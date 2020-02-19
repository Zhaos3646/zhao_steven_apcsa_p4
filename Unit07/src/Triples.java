//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class Triples
{
   private int number;

	public Triples()
	{
		this(0);
	}

	public Triples(int num)
	{
		setNum(num);
	}

	public void setNum(int num)
	{
		number = num;
	}
	
	private int greatestCommonFactor(int a, int b, int c)
	{
		int max = 0;
		max = Math.max(a, b);
		max = Math.max(max, c);
		for (int i = 1; i < max; i++) {
			if (a % i != 0 || b%i != 0 || c%i != 0) {
				return 0;
			}
		}
		return 1;
	}
	
	public String toString()
	{
		String output="";
		for (int i = 1; i <= number; i ++) {
			for (int o = i; o <= number; o ++) {
				for (int p = o; p <= number; p++) {=
					if (greatestCommonFactor(i, o, p) == 1) {
						
						if (Math.pow(i, 2) + Math.pow(o, 2) == Math.pow(p, 2)) {
							if (i % 2 == 0 && o % 2 == 1 && p % 2 == 1 || i % 2 == 1 && o % 2 == 0 && p % 2 == 1) {
								output = i + " " + o + " " + p + "\n";
							}
						}
					}
				}
			}
		}
		return output+"\n";
	}
}