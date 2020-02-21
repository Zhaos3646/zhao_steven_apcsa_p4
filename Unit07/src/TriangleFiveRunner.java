//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleFiveRunner
{
   public static void main(String args[])
   {
	   TriangleFive test = new TriangleFive('a', 4);
	   System.out.println(test.toString());
	   test.setAmount(10);
	   System.out.println(test);
	   test.setLetter('c');
	   System.out.println(test);
	}
}