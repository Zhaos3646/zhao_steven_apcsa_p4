//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStore
{
	private ArrayList<Toy> toyList;

	public ToyStore()
	{
		toyList = new ArrayList();
	}

	public void loadToys( String toys )
	{
		Scanner toyscan = new Scanner(toys);
		while(toyscan.hasNext()) {
			for (int i = 0; i < toyList.size(); i ++) {
				if (toyscan.next().equals(toyList.get(i).getName())) {
					toyList.get(i).setCount(toyList.get(i).getCount() + 1);
				}
			}
		}
	}
  
  	public Toy getThatToy( String nm )
  	{
  		for (int i = 0; i < toyList.size(); i ++) {
  			if (toyList.get(i).getName().equals(nm)) {
  				return toyList.get(i);
  			}
  		}
  		return null;
  	}
  
  	public String getMostFrequentToy()
  	{
  		Toy max = toyList.get(0);
  		for (int i = 0; i < toyList.size(); i ++) {
  			if (toyList.get(i).getCount() > max.getCount()) {
  				max = toyList.get(i);
  			}
  		}
  		return max.getName();
  	}  
  
  	public void sortToysByCount()
  	{
  		
  	}  
  	  
	public String toString()
	{
	   return "";
	}
}