package cb223ea_assign1;

import java.util.Scanner;  // Import the Scanner class

public class Area {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);

        // The user puts in a number for the radius
        System.out.print("Pick a number for the radius: ");
        double radius = r.nextFloat();
        double area = ((radius * radius) * Math.PI);

        // The area of a circle is printed using the radius input
        System.out.print("The corresponding area is: " + Math.round(area * 10.0) / 10.0);

        // Closing scanner
        r.close();
    }
}
