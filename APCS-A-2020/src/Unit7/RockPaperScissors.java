package Unit7;
//(c) A+ Computer Science

// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors {
	private String playChoice;
	private String compChoice;

	public RockPaperScissors() {
	}

	public RockPaperScissors(String player) {
		playChoice = player;
	}

	public void setPlayers(String player) {
		playChoice = player;
		
		int computer = (int) (Math.random() * 3);

		if (computer == 0) {
			compChoice = "R";
		} 
		else if (computer == 1) {
			compChoice = "P";
		} 
		else {
			compChoice = "S";
		}
	}

	public String determineWinner() {
		String winner = "";
	
		
		
		if(compChoice.equals(playChoice)) {
			winner = "!Draw Game!";
		}
		else if(compChoice.equals("R") && playChoice.equals("S")) {
			winner = "!Computer wins <<Rock Beaks Scissors>>!";
		}
		else if(compChoice.equals("P") && playChoice.equals("R")) {
			winner = "!Computer wins <<Paper Covers Rock>>!";
		}
		else if(compChoice.equals("S") && playChoice.equals("P")) {
			winner = "!Computer wins <<Scissors Cuts Paper>>!";
		}
		
		else if(compChoice.equals("S") && playChoice.equals("R")) {
			winner = "!Player wins <<Rock Beaks Scissors>>!";
		}
		else if(compChoice.equals("R") && playChoice.equals("P")) {
			winner = "!Player wins <<Paper Covers Rock>>!";
		}
		else if(compChoice.equals("P") && playChoice.equals("S")) {
			winner = "!Player wins <<Scissors Cuts Paper>>!";
		}
		
		
		
		return winner;
	}

	public String toString() {
		String output = "Player had " + playChoice + "\nComputer had " + compChoice + "\n" + determineWinner() + "\n";
		return output;
	}
}