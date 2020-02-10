//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class NumberVerifyRunner
{
	public static void main ( String[] args )
	{
		//add in input
		System.out.println("5 is odd :: " + NumberVerify.isOdd(5));
		System.out.println("5 is even :: " + NumberVerify.isEven(5));
		
		//add in more test cases
		System.out.println("7 is even:: " + NumberVerify.isEven(7));
		System.out.println("3 is odd:: " + NumberVerify.isOdd(3));
		System.out.println("8 is even:: " + NumberVerify.isEven(8));
		System.out.println("8 is odd:: " + NumberVerify.isOdd(8));
	}
}