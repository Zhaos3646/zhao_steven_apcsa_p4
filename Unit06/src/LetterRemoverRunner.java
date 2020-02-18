//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class LetterRemoverRunner
{
	public static void main( String args[] )
	{
		//add test cases	
		LetterRemover test = new LetterRemover();
		test.setRemover("aaaaabbbbb", 'a');
		out.println(test.toString());
		out.println(test.removeLetters());
											
	}
}