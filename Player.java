import java.util.*;

public class Player {
	//Class Constructor
	public Player(String _name){
		name = _name;	
	}
	
	//Declare variables. Kinda badly done, but oh well
	//TODO: implement some sort of mana\power system
	String name;
	int health = 10;
	int attack = 3;
	int armor = 3;
	boolean isTurn = false;
	
	//Prints out stats
	public void check() {
		System.out.println(name + "\nhp: " +  health + "\nattack: " + attack + "\narmor: " + armor + "\n");	
	}	

	//Self explanatory
	//TODO: revamp attack, make it more complex
	public void attack(Player enemy) {
		Random rand = new Random();
		enemy.health -= attack + rand.nextInt(11);		
	}

	//TODO: Create more methods, especially a block method
}
