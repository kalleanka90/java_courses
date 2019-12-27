package Exercises;

import java.util.Scanner; // Import the Scanner class

public class Gratuity {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the subtotal: ");
        double subtotal = input.nextDouble();
        System.out.print("Enter a gratuity rate: ");
        double rate = input.nextDouble();
        rate = rate / 100;

        double gratuity = subtotal * rate;
        subtotal = gratuity + subtotal;
        System.out.print("The gratuity is $" + gratuity + " and the total is $" + subtotal);
    }
}
