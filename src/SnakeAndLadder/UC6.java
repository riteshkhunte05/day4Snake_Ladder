package SnakeAndLadder;

import java.util.Scanner;

public class UC6 {

	 static int count = 0;

	    public static void main(String[] args) {
	        int playerPosition = 0;
	        Scanner s = new Scanner(System.in);
	        System.out.println("Enter Player Name: ");
	        String playerName = s.next();
	        int winningPosition = 100;
	        int remainingPosition = winningPosition - playerPosition;

	        while (winningPosition > playerPosition) {

	            int diceRoll = (int) Math.floor(Math.random() * 10) % 6 + 1;
	            System.out.println("The no on dice is:" + diceRoll);


	            int option = (int) Math.floor(Math.random() * 10) % 3;
	            if (remainingPosition >= diceRoll) {

	                if (option == 0) {
	                    //System.out.println("No Play");
	                    playerPosition += 0;
	                } else if (option == 1) {
	                    //System.out.println("Ladder");
	                    playerPosition += diceRoll;
	                } else {
	                    //System.out.println("Snake");
	                    playerPosition -= diceRoll;

	                    if (playerPosition < 0) {
	                        playerPosition = 0;
	                    }
	                }
	                count++;
	                System.out.println("Player Position is:" + playerPosition);

	            }
	        }
	        System.out.println("the Dice roll for :" + count);
	    }
	}

