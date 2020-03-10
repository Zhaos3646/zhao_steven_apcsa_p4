//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.ArrayList;
import java.util.List;

public class ListOddToEven
{
	public static int go( List<Integer> ray )
	{
		int count = 0;
		int k = 0;
		boolean check = false;
		for (int i = 0; i < ray.size(); i ++) {
			if (ray.get(i) % 2 == 1 && check == false) {
				check = true;
			}
			if (check == true && ray.get(i) % 2 == 0) {
				count = k;
			}
			if (check == true) {
				k ++;
			}
		}
		if (count == 0) {
			return -1;
		}
		return count;
	}
}