import java.util.*;

public class Main {
		
	public static void main(String[] args) {
		//Declaring important objects
		Player player1;	
		Player player2;
		Scanner sc = new Scanner(System.in);		

		//Setting up players
		//TODO: fix shitty code
		System.out.println("Player 1, enter your name: ");
		player1 = new Player(sc.next());	
		System.out.println("Player 2, enter your name: ");
		player2 = new Player(sc.next());

		//Set up and start game loop
		GameLoop gl = new GameLoop(player1, player2);
		gl.start();		
	}		
}
