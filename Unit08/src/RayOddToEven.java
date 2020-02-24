//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayOddToEven
{
	public static int go(int[] ray)
	{
		int cnt = 0;
		boolean set = false;
		for (int i = 0; i < ray.length; i++) {
			if (ray[i] % 2 == 1 && set == false) {
				set = true;
			}
			else if (ray[i] % 2 == 0 && set == true) {
				set = false;
				return cnt;
			}
			if (set == true) {
				cnt ++;
			}
		}
		return -1;
	}
}