package cb223ea_assign2;

import java.util.Scanner; // Import of Scanner class

public class NastStorsta {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        // Amount of integers that should be entered
        int numbers = 10;
        System.out.println("You will be asked to type in " + numbers + " integers.");

        int secondLargest = 0, largest, input;

        // First input to give largest a value
        System.out.print("Type in an Integer: ");
        input = n.nextInt();
        largest = input;

        // The secondLargest should never be greater than the largest
        if (input < secondLargest) {
            secondLargest = largest;
        }

        // My do..while-loop for the input of all integers and finding the secondLargest integer
        int count = 1;
        do {
            System.out.print("Type in an Integer: ");
            input = n.nextInt();
            if (input > largest) {
                secondLargest = largest;
                largest = input;
            } else if (input < secondLargest && secondLargest == largest) {
                secondLargest = input;
            } else if (input > secondLargest && input < largest) {
                secondLargest = input;
            }
            count++;
        } while (count != numbers);

        System.out.print("The second largest number is: " + secondLargest);

        // Closing scanner
        n.close();
    }
}
