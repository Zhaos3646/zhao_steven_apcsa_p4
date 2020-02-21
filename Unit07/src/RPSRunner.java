//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		String response;
		int i = 0;
		//add in a do while loop after you get the basics up and running
		while (i == 0) {
			String player = "";
		
			out.print("Type in your prompt [R,P,S] :: ");
			response = keyboard.next().substring(0,1);
			
			//read in the player value
		
			RockPaperScissors game = new RockPaperScissors(response);
			System.out.println(game.toString());
			
			System.out.println("Play again? (y/n)");
			response = keyboard.next().substring(0,1);
			if (response.toLowerCase().compareTo("y") != 0) {
				break;
			}
		}	
	}
}



