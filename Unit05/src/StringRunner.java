//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class StringRunner
{
	public static void main ( String[] args )
	{
		System.out.println("Enter a word");
		Scanner keyboard = new Scanner(System.in);
		String str = keyboard.next();
		StringOddOrEven string = new StringOddOrEven(str);
		string.isEven();
		System.out.println(string);
	}
}