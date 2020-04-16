//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

public class Skeleton implements Monster
{
	//add instance variables
	private String name;
	private int size;
	
	public Skeleton() {
		name = "";
		size = 0;
	}
	public Skeleton(String x, int y) {
		name = x;
		size = y;
	}
	public int getHowBig() {
		return size;
	}
	public String getName() {
		return name;
	}
	public boolean isBigger(Monster other) {
		if (other.getHowBig() < size) {
			return true;
		}
		return false;
	}
	public boolean isSmaller(Monster other) {
		if (other.getHowBig() > size) {
			return true;
		}
		return false;
	}
	public boolean namesTheSame(Monster other) {
		if (other.getName().equals(name)) {
			return true;
		}
		return false;
	}
	
	public String toString() {
		return name + " is " + size + "size";
	}
	//add a constructor

	//add code to implement the Monster interface

	//add a toString
}