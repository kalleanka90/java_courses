package cb223ea_assign2;
import java.util.Scanner; // Import of Scanner class

public class RaknaNummer {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        int sum = 0;
        System.out.print("Write an integer, negative or positive: ");
        int number = n.nextInt();

        // As long as the user doesn't type 0 the loop will continue and calculate the sum of all the number put in
        while ( number != 0 ) {
            sum += number;
            System.out.print("Write an integer, negative or positive: ");
            number = n.nextInt();
        }
        System.out.print("The sum is: " + sum);

        // Closing scanner
        n.close();
    }
}
