package Exercises;

import java.util.Scanner; // Import of Scanner class

public class vTriangle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length of the sides on the Equilateral triangle: ");
        double side = input.nextDouble();

        double area = (Math.sqrt(3) / 4) * (side * side);
        double volume = area * side;

        System.out.println("The area is: " + Math.round(area * 1000.0) / 1000.0);
        System.out.print("The volume is: " + Math.round(volume * 1000.0) / 1000.0);
    }
}
