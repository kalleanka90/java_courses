package Exercises;

import java.util.Scanner; // Import of Scanner class

public class Miles {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter miles: ");
        int miles = input.nextInt();
        double km = miles * 1.6;

        km = Math.round(km * 10.0) / 10.0;
        System.out.println(miles + " miles is " + km + " kilometers.");
    }
}
