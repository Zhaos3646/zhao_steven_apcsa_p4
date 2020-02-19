//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleFive
{
   private char letter;
   private int amount;

	public TriangleFive()
	{
		setLetter(' ');
		setAmount(0);
	}

	public TriangleFive(char c, int amt)
	{
		setLetter(c);
		setAmount(amt);
	}

	public void setLetter(char c)
	{
		letter = c;
	}

	public void setAmount(int amt)
	{
		amount = amt;
	}

	public String toString()
	{
		char temp = letter;
		String output="";
		for (int y = amount; y > 0; y--) {
			for (int i = 0; i < y; i++) {
				temp = (char)(letter + i);
				for (int o = amount - i; o > 0; o--) {
					output = output + temp;
				}
				output = output + " ";
			}
			output = output + "\n";
		}
		return output;
	}
}