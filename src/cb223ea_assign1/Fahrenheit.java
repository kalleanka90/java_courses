package cb223ea_assign1;

import java.util.Scanner;  // Import the Scanner class

public class Fahrenheit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Asks the user to put in degrees in Fahrenheit
        System.out.print("Enter degrees in Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        // Converts the Fahrenheit to celsius then prints it
        double celcius = ((5 * (fahrenheit - 32)) / 9);
        System.out.print("Your input of fahrenheit is equal to " + celcius + "°C");

        // Closing scanner
        input.close();
    }
}
