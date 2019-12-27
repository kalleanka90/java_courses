package Exercises;

import java.util.Scanner; // Import the Scanner class

public class MultiAndModulus {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter an Integer between 0 and 1000: ");
        int number = input.nextInt();
        int numberCopy = number;
        int tempNr;
        int newNumber = 1;
        while (number != 0) {
            tempNr = number % 10;
            newNumber = newNumber * tempNr;
            number = number / 10;
        }
        System.out.print("The multiplication of all digits in " + numberCopy + " is " + newNumber);
    }
}
