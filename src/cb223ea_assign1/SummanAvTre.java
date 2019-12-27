package cb223ea_assign1;

import java.util.Scanner; // Import

public class SummanAvTre {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Asks the user to put in a 3-digit number
        System.out.println("Enter a 3-digit number: ");
        int num = input.nextInt();
        int sum = 0;

        // Adds each digit of the number together
        sum = sum + num % 10;
        num = num / 10;
        sum = sum + num % 10;
        num = num / 10;
        sum = sum + num % 10;
        num = num / 10;
        System.out.print("The sum of all digits are: " + sum);

        // Closing scanner
        input.close();
    }
}
