//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class TriangleOneRunner
{
	public static void main ( String[] args )
	{
		//add test cases
		TriangleOne test1 = new TriangleOne("abcdefg");
		test1.print();
		test1.setWord("hippos");
		test1.print();
		TriangleOne test2 = new TriangleOne();
		test2.setWord("Mississippi");
		test2.print();
		test2.setWord("");
		test2.print();
	}
}