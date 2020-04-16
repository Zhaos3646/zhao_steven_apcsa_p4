//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class MonsterRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		String name;
		int size;
		System.out.println("Enter first monster's name: ");
		name = keyboard.next();
		System.out.println("Enter first monster's size: ");
		size = keyboard.nextInt();
		Skeleton one = new Skeleton(name, size);
		//ask for name and size
		System.out.println("Enter second monster's name: ");
		name = keyboard.next();
		System.out.println("Enter second monster's size: ");
		size = keyboard.nextInt();
		Zombie two = new Zombie(name, size);
		
		if (one.isBigger(two)) {
			System.out.println("Monster one is bigger than Monster two");
		}
		else if (one.isSmaller(two)) {
			System.out.println("Monster two is bigger than Monster one");
		}
		else {
			System.out.println("Monster one and Monster two are the same size");
		}
		if (one.namesTheSame(two)) {
			System.out.println("Monster one and Monster two have the same name");
		}
		else {
			System.out.println("Monster one and Monster two do not have the same name");
		}
		//instantiate monster one
		
		//ask for name and size
		
		//instantiate monster two
	}
}