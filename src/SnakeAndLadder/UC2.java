package SnakeAndLadder;

import java.util.Scanner;

public class UC2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int playerPosition1 = 0;
		int die = (int) (Math.floor(Math.random() * 10) % 6 + 1);
		System.out.println("Dice roll: " + die);

		System.out.print("Enter player name: ");
		Scanner s = new Scanner(System.in);
		String playerName = s.next();

		System.out.println("Player name: " + playerName);

		int option = (int) (Math.floor(Math.random() * 10) % 3);
		int playerPosition = 0;
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
	}

}
