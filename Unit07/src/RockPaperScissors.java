//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;

	public RockPaperScissors()
	{
		setPlayers("");
	}

	public RockPaperScissors(String player)
	{
		setPlayers(player);
	}

	public void setPlayers(String player)
	{
		int choose = (int) Math.ceil(Math.random()*3);
		if (choose == 1) {
			compChoice = "r";
		}
		else if (choose == 2) {
			compChoice = "p";
		}
		else if (choose == 3) {
			compChoice = "s";
		}
		playChoice = player;
	}

	public String determineWinner()
	{
		String winner="";
		if (playChoice.toLowerCase().compareTo(compChoice) == 0) {
			winner = "Draw";
		}
		else if (playChoice.toLowerCase().compareTo("r") == 0 && compChoice.compareTo("p") == 0) {
			winner = "Computer Wins <Paper Grabs Rock>";
		}
		else if (playChoice.toLowerCase().compareTo("r") == 0 && compChoice.compareTo("s") == 0) {
			winner = "Player Wins <Rock Breaks Scissors>";
		}
		else if (playChoice.toLowerCase().compareTo("p") == 0 && compChoice.compareTo("r") == 0) {
			winner = "Player Wins <Paper Grabs Rock>";
		}
		else if (playChoice.toLowerCase().compareTo("p") == 0 && compChoice.compareTo("s") == 0) {
			winner = "Computer Wins <Scissors Cuts Paper>";
		}
		else if (playChoice.toLowerCase().compareTo("s") == 0 && compChoice.compareTo("p") == 0) {
			winner = "Player Wins <Scissor Cuts Paper>";
		}
		else if (playChoice.toLowerCase().compareTo("s") == 0 && compChoice.compareTo("r") == 0) {
			winner = "Computer Wins <Rock Breaks Scissors>";
		}
		return winner;
	}

	public String toString()
	{
		String output="Player had " + playChoice.toUpperCase() + "\nComputer had " + compChoice.toUpperCase() + "\n" + determineWinner();
		return output;
	}
}