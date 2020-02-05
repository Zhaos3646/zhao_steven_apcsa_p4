//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class DistanceRunner
{
	public static void main( String[] args )
	{
		//add test cases	
		Distance distance1 = new Distance();
		distance1.setCoordinates(1, 2, 5, 7);
		distance1.calcDistance();
		System.out.println(distance1.toString());
		distance1.print();
		Distance distance2 = new Distance(1, 3, 6, 2);
		distance2.calcDistance();
		distance2.print();
	}
}