//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class WordsCompare
{
	private String wordOne, wordTwo;
   private int compare;

	public WordsCompare()
	{
		wordOne = "";
		wordTwo = "";
	}

	public WordsCompare(String one, String two)
	{
		wordOne = one;
		wordTwo = two;
	}

	public void setWords(String one, String two)
	{
		wordOne = one;
		wordTwo = two;
	}

	public void compare()
	{
		boolean check = false;
		System.out.println("double yay");
		while (check == false) {
			int i = 0;
			if ((int) wordOne.charAt(i) > (int) wordTwo.charAt(i)) {
				compare = -1;
				System.out.println("yay");
				check = true;
			}
			if ((int) wordTwo.charAt(i) < (int) wordTwo.charAt(i)) {
				compare = 1;
				System.out.println("nay");
				check = true;
			}
			else {
			i++;
			}
		}
	}

	public String toString()
	{
		if(compare<0)
		{
			return wordOne + " should be placed before " + wordTwo + "\n";
		}
		else
		{
			return wordOne + " should be placed after " + wordTwo + "\n";
		}
	}
}