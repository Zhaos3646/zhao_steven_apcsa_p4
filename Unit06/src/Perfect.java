//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Perfect
{
   private int number;
   
   public Perfect()
   {
	   setNum(0);
   }
   public Perfect(int num1)
   {
	   setNum(num1);
   }
   public void setNum(int num1) {
	   number = num1;
   }
	//add constructors

	//add a set method

	public boolean isPerfect()
	{
		int checker = 0;
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				checker += i;
			}
		}
		if (checker == number) {
			return true;
		}
		return false;
	}
	public String toString()
	{
		if (isPerfect() == true) {
			return number + " is perfect" + "\n";
		}
		return number + " is not perfect" + "\n";
	}
	//add a toString	
	
}