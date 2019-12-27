package cb223ea_assign1;

import java.util.Scanner;  // Import the Scanner class

public class Avstand {
    public static void main(String[] args) {
        Scanner cords = new Scanner(System.in);

        // The user puts in 4 coordinates
        System.out.println("Enter coordinates below.");
        System.out.print("Cord X1: ");
        int x1 = cords.nextInt();
        System.out.print("Cord Y1: ");
        int y1 = cords.nextInt();
        System.out.print("Cord X2: ");
        int x2 = cords.nextInt();
        System.out.print("Cord Y2: ");
        int y2 = cords.nextInt();

        double distance = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));

        // Prints the distance between the coordinates
        System.out.printf("The distance is %4.3f", distance);

        // Closing scanner
        cords.close();
    }
}
