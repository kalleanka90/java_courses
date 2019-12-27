package cb223ea_assign1;

import java.util.Scanner;  // Import the Scanner class

public class Tid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Asks the user to put in time in seconds
        System.out.println("Enter seconds: ");
        int seconds = input.nextInt();

        // Calculates the input of seconds and converts it into hours, minutes and seconds
        int hours = (seconds / 3600);
        seconds = (seconds - (3600 * hours));
        int minutes = (seconds / 60);
        seconds = (seconds - (minutes * 60));

        System.out.print("You entered: " + hours + "h, " + minutes + " minutes and " + seconds + " seconds.");

        // Closing scanner
        input.close();

    }
}
