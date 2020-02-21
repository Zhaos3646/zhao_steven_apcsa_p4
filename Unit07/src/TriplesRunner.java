//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class TriplesRunner
{
   public static void main(String args[])
   {
	   Triples test = new Triples(100);
	   System.out.println(test.toString());
	   test.setNum(10);
	   System.out.println(test);
	   test.setNum(200);
	   System.out.println(test);
	}
}