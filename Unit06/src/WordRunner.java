//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class WordRunner
{
	public static void main ( String[] args )
	{
		//add test cases
		Word test = new Word("word");
		out.println(test.toString());
		test.setString("Hello");
		test.getFirstChar();
		test.getLastChar();
		test.getBackWards();
		out.println(test.toString());
		test.setString("World");
		out.println(test.toString());
		test.setString("Jukebox");
		out.println(test.toString());
		test.setString("TCEA");
		out.println(test.toString());
		test.setString("UIL");
		out.println(test.toString());
	}
}