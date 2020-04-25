//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifter
{
	public static int[] makeLucky7Array( int size)
	{
		int[] array = new int[size];
		for (int i = 0; i < size; i ++) {
			array[i] = (int)Math.ceil((10*Math.random()));
		}
		return array;
	}
	public static void shiftEm(int[] array)
	{
		System.out.println(Arrays.toString(array));
		for(int i=0; i< array.length-1; i++){

			int pos = i;

			for(int j = i+1; j< array.length; j++)

			{

				if( array[j] == 7)
					pos = j;
			}

			if(pos != i) {
				int temp = array[pos];
				array[pos] = array[i];
				array[i] = temp;
			}
		}
		System.out.println(Arrays.toString(array));
	}
}