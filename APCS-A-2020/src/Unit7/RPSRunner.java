package Unit7;
//(c) A+ Computer Science

// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner {
	public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in);
		char response;
		String player = "";

		out.print("Rock-Paper-Scissors - pick your weapon[R,P,S]:: ");
		player = keyboard.next();
		RockPaperScissors game = new RockPaperScissors(player);
		
		game.setPlayers(player);
		System.out.println(game);

		// add in a do while loop after you get the basics up and running

		do {
			System.out.println("Do you want to play again");
			response = keyboard.next().charAt(0);
			out.print("Rock-Paper-Scissors - pick your weapon[R,P,S]:: ");
			player = keyboard.next();
			game.setPlayers(player);
			System.out.println(game);
		} while (response == 'y');
		
		System.out.println(game);
		game.setPlayers("R");
		System.out.println(game);
		game.setPlayers("R");
		System.out.println(game);
		game.setPlayers("S");
		System.out.println(game);
		game.setPlayers("S");
		System.out.println(game);
		game.setPlayers("P");
		System.out.println(game);
		game.setPlayers("P");
		System.out.println(game);
	}
}
