//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;

public class Doggies
{
	private Dog[] pups;

	public Doggies(int size)
	{
		pups = new Dog[size];
		//point pups at a new arry of Dog
		
	}
	
	public void set(int spot, int age, String name)
	{
		if (spot < pups.length && spot >= 0) { 
			pups[spot] = new Dog(age, name);
		}
		//put a new Dog in the array at spot 
		//make sure spot is in bounds		
	}

	public String getNameOfOldest()
	{
		Dog Oldest = pups[0];
		for (int i = 0; i < pups.length; i ++) {
			if (pups[i].getAge() > Oldest.getAge()) {
				Oldest = pups[i];
			}
		}
		return Oldest.getName();
	}

	public String getNameOfYoungest()
	{
		Dog Youngest = pups[0];
		for (int i = 0; i < pups.length; i ++) {
			if (pups[i].getAge() < Youngest.getAge()) {
				Youngest = pups[i];
			}
		}
		return Youngest.getName();
	}

	public String toString()
	{
		return ""+Arrays.toString(pups);
	}
}