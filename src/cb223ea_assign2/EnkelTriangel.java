package cb223ea_assign2;

import java.util.Scanner; // Import of Scanner class

public class EnkelTriangel {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        System.out.print("Type in a positive Integer: ");
        int number = n.nextInt();
        String space = "";

        // Checks if the user put in a positive number
        if (number > 0) {

            // A loop that prints the triangle
            for (int i = 0; i < number; i++) {
                System.out.print(space);
                space += " ";
                for (int j = 0; j < number - i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            n.close();

            // Error message if the Integer was negative or 0
        } else {
            System.out.print("You need to type in a positive Integer greater than 0.");
            n.close();
        }

        // Closing scanner
        n.close();
    }
}
