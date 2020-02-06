//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class WordsCompareRunner
{
   public static void main( String args[] )
   {
		//add test cases
	   WordsCompare word = new WordsCompare();
	   word.setWords("hi", "ho");
	   word.compare();
	   out.println(word.toString());
	}
}