//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

public class PerfectRunner
{
	public static void main( String args[] )
	{
		Perfect test = new Perfect(6);
		test.isPerfect();
		out.println(test);
		test.setNum(4);
		out.println(test);
		Perfect test1 = new Perfect();
		test1.setNum(496);
		test1.isPerfect();
		out.println(test1);
		test1.setNum(497);
		out.println(test1);
																
	}
}