package SnakeAndLadder;

import java.util.Scanner;

public class UC5 {
	public static final int winningPosition = 100;
	public static void main(String[] args) {
		
		
		
			// TODO Auto-generated method stub
	      System.out.println("Welcome to Snake ladder Game");
	
			int playerPosition = 0;	
			System.out.println("Starting position is " + playerPosition );

			int playerPosition1 = 0;
			int die = (int) (Math.floor(Math.random() * 10) % 6 + 1);
			System.out.println("Dice roll: " + die);

			System.out.print("Enter player name: ");
			Scanner s = new Scanner(System.in);
			String playerName =s.next();
	        System.out.println("Player name: "+ playerName);
	        int option = (int) (Math.floor(Math.random() * 10) % 3);
			switch (option) {
				case 0:
					System.out.println("No play");
					playerPosition += 0;
					break;
				case 1:
					System.out.println("Ladder");
					playerPosition += die;
					break;
				default:
					System.out.println("Snake");
					playerPosition -= die;
					if (playerPosition < 0)
						playerPosition = 0;		
			}
			System.out.println("Player position: " + playerPosition);
			while ( winningPosition > playerPosition ) {
				int die1 = (int) (Math.floor(Math.random() * 10) % 6 + 1);

				int option1 = (int) (Math.floor(Math.random() * 10) % 3);
				switch (option1) {
					case 0:
						System.out.println("No play : " + 0);
						playerPosition += 0;
						break;
					case 1:
						System.out.println("Ladder  : " + "+" + die1);
						playerPosition += die1;
						break;
					default:
						System.out.println("Snake   : " + "-" + die1);
						playerPosition -= die1;
						if (playerPosition < 0)
							playerPosition = 0;
				}
				}
				System.out.println("Player position: " + playerPosition);
		}

	
		
	
}


