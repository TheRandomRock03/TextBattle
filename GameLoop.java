import java.util.*;

public class GameLoop {
	//Declare variables
	private Scanner sc = new Scanner(System.in);
	Player p1;
	Player p2;

	//Class constructor
	public GameLoop(Player _p1, Player _p2){
		p1 = _p1;
		p2 = _p2;		
	}

	//Self explanatory, initializes game loop
	public void start() {	
		while(true /*!(p1.health <= 0) || !(p2.health <= 0)*/) {
			turn(p1, p2);
			checkForWin();
			turn(p2, p1);	
			checkForWin();
		}		
	}

	//Turn for one player
	//TODO: remember to make more cases once there are more methods in Player class
	private void turn(Player playerActive, Player playerPassive) {
		playerActive.isTurn = true;
		System.out.println(playerActive.name + "'s turn:\n");
		while(playerActive.isTurn) {
			String action = sc.next();	
			switch(action) {
				case "check":
					playerActive.check();
					playerPassive.check();	
					break;	
				case "attack":
					playerActive.attack(playerPassive);
					playerActive.isTurn = false;
					break;
				case "quit":
					System.exit(0);
					break;
				default:
					System.out.println("\nEnter a valid command\n");
					break;
			}
		}	
	}

	//OwO what's this? Shitty code? Mmm yes it do be like that sometimes
	//Probably should fix, but meh
	private void checkForWin() {
		if(p1.health <= 0) {
			System.out.println(p2.name + " wins!");	
			System.exit(0);
		}	
		else if(p2.health <= 0) {
			System.out.println(p1.name + " wins!");	
			System.exit(0);
		}
		else {
			return;
		}
	}
}
