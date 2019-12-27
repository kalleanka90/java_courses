package cb223ea_assign2;

import java.util.Random; // Import the Random class

public class Myran {
    public static void main(String[] args) {

        double totalSteps = 0;

        // Loops the program 10 times
        for (int simulations = 1; simulations <= 10; simulations++) {

            // Create a new Random class
            Random randomPos = new Random();

            // Chessboard coordinates
            boolean[][] chessBoard = new boolean[8][8];

            // Generate starting coordinates
            int pX = randomPos.nextInt(7);
            int pY = randomPos.nextInt(7);

            // Set starting point as visited
            chessBoard[pX][pY] = true;
            int step = 1;
            int allVisited = 1;

            // Will loop until all coordinates have been visited
            while (allVisited != 64) {

                // Checks if movement is allowed, the ant can't move outside board
                boolean allowedMove = false;
                while (!allowedMove) {

                    // Generates a random direction
                    int direction = randomPos.nextInt(4) + 1;

                    // Check if movement is allowed for the random direction
                    switch (direction) {
                        case 1: // Up
                            if ((pY + 1) <= 7) {
                                allowedMove = true;
                                pY++;
                            }
                            break;
                        case 2: // Down
                            if ((pY - 1) >= 0) {
                                allowedMove = true;
                                pY--;
                            }
                            break;
                        case 3: // Right
                            if ((pX + 1) <= 7) {
                                allowedMove = true;
                                pX++;
                            }
                            break;
                        case 4: // Left
                            if ((pX - 1) >= 0) {
                                allowedMove = true;
                                pX--;
                            }
                            break;
                    }
                }

                // Set the coordinate as visited if it hasn't been visited
                if (!chessBoard[pX][pY]) {
                    chessBoard[pX][pY] = true;
                    allVisited++;
                }

                // Count current simulations steps
                step++;
            }

            // Print amount of steps for the simulation
            System.out.println("Steps in simualtion " + simulations + ": " + step);
            totalSteps += step;
        }

        // Print the average amount of steps through all simulations
        System.out.println("Average steps: " + totalSteps / 10);
    }

}

