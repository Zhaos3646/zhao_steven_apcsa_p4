//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class GridRunner
{
	public static void main( String args[] ) throws IOException
	{
		String[] vals = {"a", "b", "c", "d", "e"}; 
		Grid grid1 = new Grid(10, 10, vals);
		System.out.print(grid1.toString());
		System.out.println(grid1.findMax(vals));
	}
}