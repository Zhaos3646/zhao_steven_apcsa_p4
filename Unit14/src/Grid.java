//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Grid
{
   private String[][] grid;

   //load vals into the rows x cols grid randomly
	public Grid(int rows, int cols, String[] vals)
	{
		grid = new String[rows][cols];
		for (int i = 0; i < rows; i ++) {
			for (int j = 0; j < cols; j ++) {
			  int randomval = (int) Math.ceil(vals.length*Math.random()) - 1;
			  grid[i][j] = vals[randomval];
			  }
			}
			
		}

	//find out which of the vals occurs the most
	public String findMax(String[] vals)
	{
		int max = 0;
		for (int i = 1; i < vals.length; i ++) {
			if (countVals(vals[i]) > countVals(vals[max])) {
				max = i;
			}
		}
		return vals[max] + " occurs the most";
	}

	//returns a count of how many times val occurs in the matrix
	private int countVals( String val )
	{
		int count = 0;
		for (int i = 0; i < grid.length; i ++) {
			for (int j = 0; j < grid[0].length; j ++) {
				if (grid[i][j].equals(val)) {
					count ++;
				}
			}
		}
		return count;
	}

	//display the grid
	public String toString()
	{
		String output="";
		for (int i = 0; i < grid.length; i ++) {
			for (int j = 0; j < grid[0].length; j ++) {
				output = output + grid[i][j] + " ";
			}
			output = output + "\n";
		}
		return output;
	}
}