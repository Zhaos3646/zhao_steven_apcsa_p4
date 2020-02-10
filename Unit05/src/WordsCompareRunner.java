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
	   word.setWords("bat", "ba");
	   word.compare();
	   System.out.println(word.toString());
	   WordsCompare word1 = new WordsCompare("yeti", "yacht");
	   word1.compare();
	   System.out.println(word1.toString());
	}
}