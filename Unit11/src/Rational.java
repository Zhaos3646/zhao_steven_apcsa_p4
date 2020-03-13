//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

class Rational implements Comparable<Rational>
{
	//add two instance variables
	private int numerator, denominator;

	//write two constructors
	public Rational() {
		setRational(1, 1);
	}
	public Rational(int num, int den) {
		setRational(num, den);
	}

	public void setRational(int num, int den) {
		numerator = num;
		denominator = den;
	}
	//write a setRational method
	
	public void setNumerator(int num) {
		numerator = num;
	}
	public void setDenominator(int den) {
		denominator = den;
	}
	//write  a set method for numerator and denominator

	
	public String add(Rational  other)
	{
		int newNumerator = 0;
		int newDenominator = 0;
		newNumerator = numerator*other.getDenominator() + denominator*other.getNumerator();
		newDenominator = denominator*other.getDenominator();
		//num1/den1 + num2/den2 
		//new numerator = (num1 * den2 + num2 * den1)
		//new denominator = (den1 * den2)
		reduce(newNumerator, newDenominator);
		return numerator + "/" + denominator;
	}

	private void reduce(int num, int den)
	{
		int divideBy = gcd(num, den);
		numerator = num/divideBy;
		denominator = den/divideBy;

	}

	private int gcd(int numOne, int numTwo)
	{
		int gcd = 1;
		for (int i = 1; i < Math.max(numOne, numTwo); i ++) {
			if (numOne % i == 0 && numTwo % i == 0) {
				gcd = i;
			}
		}

		return gcd;
	}

	public Object clone ()
	{
		Rational clone = new Rational(numerator,denominator);
		return clone;
	}


	//ACCESSORS
	public int getNumerator() {
		return numerator;
	}
	public int getDenominator() {
		return denominator;
	}
	//write get methods for numerator and denominator
	
	
	public boolean equals( Rational obj)
	{
		int num1 = numerator;
		int num2 = denominator;
		int den1 = obj.getDenominator();
		int den2 = obj.getNumerator();
		int factor1 = gcd(numerator, denominator);
		int factor2 = gcd(obj.getNumerator(), obj.getDenominator());
		num1 = num1/factor1;
		num2 = num2/factor2;
		den1 = den1/factor1;
		den2 = den2/factor2;
		if (num1 == num2 && den1 == den2) {
			return true;
		}
		return false;
	}

	public int compareTo(Rational other)
	{
		if((numerator*other.getDenominator() + denominator*-1*other.getNumerator())/denominator*other.getDenominator() > 0) {
			return 1;
		}
		


		return -1;
	}

	public String toString() {
		return numerator + "/" + denominator;
	}

	
	//write  toString() method
	
	
}