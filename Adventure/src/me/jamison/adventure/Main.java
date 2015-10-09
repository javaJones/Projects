package me.jamison.adventure;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		// ask user for name
		print("What is you name?");
		
		// scan for name
		String name = s.nextLine();
		
		Player player = new Player(name);
		
		// welcome message
		print("Welcome to Adventure, " + player.getName() + "!");
		
		int input;
		
		do {
			// menu
			System.out.println("[0] Quit.");
			System.out.println("[1] Go to the store.");
			System.out.println("[2] Go into the forest.");
			System.out.println("[3] Talk to the townspeople.");
			
			// get option
			input = s.nextInt();
			
			if (input == 0){
				continue; 
			}
			
			else if (input == 1) { // this is the store option.
				// make sure you have enough money.
				if (player.getMoney() - 1 < 0){
					print("You don't have enough money!");
					continue;
				}
				
				// make sure you don't have max health
				if (player.getHealth() + 1 > 10) {
					print("You have max health!");
					continue;
				}
				print("You bought a health potion and restore some health!");
				player.modifyMoney(-1);  // could be negative.
				player.modifyHealth(1); // could be > 10 (max).
			}
			else if (input == 2) { // this is the forest option.
				// make sure  health is at least 0
				if (player.getHealth() - 1 < 0) {
					print("You don't have enough health.");
					continue;
				}
				print("You went to the forest. You grow tired of your travels, but you also find treasure!");
				player.modifyMoney(+1);
				player.modifyHealth(-1); // could be negative.
			}
			else if (input == 3) { // talk to townspeople option.
				for (int i = 0; i < 5; i++) { // say hello multiple times
					print("Someone says hello.");
				}
			}
			else {
				print("Invalid Choice!");
			}
		}while(input != 0);
	}
	
	public static void print(String msg){
		System.out.println("Adventure: " + msg);
	}
}
