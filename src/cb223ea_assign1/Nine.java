package cb223ea_assign1;

import java.util.Scanner;  // Import the Scanner class

public class Nine {
    public static void main(String[] args) {
        Scanner answer = new Scanner(System.in);
        System.out.println("Play a game \n===========");
        System.out.print("Are you ready to play? (Y/N): ");
        String yesOrNo = answer.nextLine();
        int player = 0, computer = 0;
        int dice1 = 0, dice2 = 0;

        // Checks if the player wants to play at all
        if (yesOrNo.contains("Y") || yesOrNo.contains("y")) {
            dice1 = (int) (Math.random() * ((6 - 1) + 1)) + 1;
            System.out.println("You rolled " + dice1);
            player = dice1;

            // Checks if the player wants to roll the second dice
            System.out.print("Do you want to roll again? (Y/N): ");
            yesOrNo = answer.nextLine();
            if (yesOrNo.contains("Y") || yesOrNo.contains("y")) {
                dice2 = (int) (Math.random() * ((6 - 1) + 1)) + 1;
                player = (dice1 + dice2);
                System.out.println("You rolled " + dice2 + " and have a total of " + player);
            }

            // Computers turn
            dice1 = (int) (Math.random() * ((6 - 1) + 1)) + 1;
            System.out.println("The computer rolled " + dice1);
            computer = dice1;

            // Checks if the computer rolled higher than 4
            if (dice1 <= 4) {
                dice2 = (int) (Math.random() * ((6 - 1) + 1)) + 1;
                computer = (dice1 + dice2);
                System.out.println("The computer rolled again and got " + dice2 + ", total of " + computer);
            }
            // Checks the result of the rolls
            if (player > 9) {
                System.out.println("Busted! The computer won!");
            } else if (computer > 9) {
                System.out.print("The computer is busted! You won!");
            } else if (player > computer) {
                System.out.println("You won!");
            } else if (computer > player) {
                System.out.println("The computer won!");
            } else {
                System.out.println("It's a tie!");
            }
        } else if (yesOrNo.contains("N") || yesOrNo.contains("n")) {
            System.out.println("If you want to play more, run application again.");
        } else {
            System.out.println("Use either Y or N to answer if you want to play or not!");
        }

        // Closing scanner
        answer.close();
    }
}
