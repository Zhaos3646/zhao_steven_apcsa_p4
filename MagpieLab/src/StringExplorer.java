/**
 * A program to allow students to try out different 
 * String methods. 
 * @author Laurie White
 * @version April 2012
 */
public class StringExplorer
{

	public static void main(String[] args)
	{
		String sample = "The quick brown fox jumped over the lazy dog.";
		int pos = sample.indexOf("slow");
		if(pos != -1) {
		System.out.println("slow is found at position" + pos);
		}
		else {
		System.out.println("slow is not found");
		}
		//  Demonstrate the indexOf method.
		int position = sample.indexOf("quick");
		System.out.println ("sample.indexOf(\"quick\") = " + position);
		
		//  Demonstrate the toLowerCase method.
		String lowerCase = sample.toLowerCase();
		System.out.println ("sample.toLowerCase() = " + lowerCase);
		System.out.println ("After toLowerCase(), sample = " + sample);
		
		//  Try other methods here:
		int i = 0;
		int count = 0;
		int p;
		String str = "Computer Science is the best, the greatest, and the most wonderful subject to study!";
		while (i == 0) {
			
			p = str.indexOf("the");
			if (p != -1) {
				str = str.substring(0,p) + str.substring(p+3, str.length());
				count ++;
			}
			else {
				break;
			}
		}
		System.out.println(count);
	}

}
