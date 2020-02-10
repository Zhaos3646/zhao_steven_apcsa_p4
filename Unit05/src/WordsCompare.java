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
		int i = 0;
		while (check == false) {
			if (i > wordOne.length()-1){
				compare = -1;
				check = true;
				break;
			}
			if (i > wordTwo.length()-1) {
				compare = 1;
				check = true;
				break;
			}
			if (wordOne.charAt(i) > wordTwo.charAt(i)) {
				compare = 1;
				check = true;;
			}
			if ( wordOne.charAt(i) <  wordTwo.charAt(i)) {
				compare = -1;
				check = true;
			}
			i++;
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
			return wordTwo + " should be placed before " + wordOne + "\n";
		}
	}
}