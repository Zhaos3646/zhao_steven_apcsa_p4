//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class WordSortTwo
{
	private String[] wordRay;

	public WordSortTwo(String sentence)
	{
		String word;
		int count = 0;
		Scanner sent = new Scanner(sentence);
		while(sent.hasNext()) {
			count ++;
		}
		wordRay = new String[count];
		for (int i = 0; i < count; i ++) {
			wordRay[i] = sent.next();
		}
		wordRay = sort(wordRay);
		
	}

	public String[] sort(String[] array)
	{
		for(int i=0; i< array.length-1; i++){

			int min = i;

			for(int j = i+1; j< array.length; j++)

			{

			if( array[j].charAt(0) < array[min].charAt(0))

			min = j;

			
			else if (array[j].charAt(0) == array[min].charAt(0)) {
				if (array[j].charAt(1) < array[min].charAt(1)) {
					min = j;
				}
			}
			}
			if(min != i) {

			String temp = array[min];

			array[min] = array[i];

			array[i] = temp;
	}
	}
		return array;
	}

	public String toString()
	{
		String output="";
		for (int i = 0; i < wordRay.length; i ++) {
			output = output + wordRay[i] + "\n";
		}
		return output+"\n\n";
	}
}