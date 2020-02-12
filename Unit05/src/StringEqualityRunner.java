//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;

public class StringEqualityRunner
{
	public static void main( String args[] )
	{
		StringEquality string = new StringEquality();
		string.setWords("hello", "goodbye");
		string.checkEquality();
		out.println(string);
		StringEquality string2 = new StringEquality("hi", "hi");
		string2.checkEquality();
		out.println(string2);
		string2.setWords("hi", "not hi");
		out.println(string2);
	}
}