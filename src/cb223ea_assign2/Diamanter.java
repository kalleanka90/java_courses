package cb223ea_assign2;

import java.util.Scanner; // Import if Scanner class

public class Diamanter {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        int number = 1;
        do {
            System.out.print("Type in a positive Integer: ");
            number = n.nextInt();
            if (number <= 0) {
                System.out.println("You must type in a number of positive value greater than 0!");
                break;
            }

            // Loop for building the upper part of the diamond
            for (int i = 1; i <= number; i++) {
                for (int j = 1; j <= number - i; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= (i * 2) - 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            // Loop for building the lower part of the diamond
            for (int i = number - 1; i > 0; i--) {
                for (int j = 1; j <= number - i; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= (i * 2) - 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } while (number > 0);

        // Closing scanner
        n.close();
    }
}
