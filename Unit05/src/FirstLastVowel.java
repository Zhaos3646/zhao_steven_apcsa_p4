//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -


public class FirstLastVowel
{
   public static String go( String a )
	{
	   char[] VowelArray = {'a', 'e', 'i', 'o', 'u'};
	   for (int i = 0; i < 5; i++) {
		   if (VowelArray[i] == a.toLowerCase().charAt(0) || VowelArray[i] == a.toLowerCase().charAt(a.length()-1)) {
			   return "yes";
		   }
	   }
	   return "no";
	}
   
}