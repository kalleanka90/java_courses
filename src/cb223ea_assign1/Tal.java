package cb223ea_assign1;

import java.util.Scanner;  // Import the Scanner class

public class Tal {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);

        // Asks the user to put in 3 different numbers
        System.out.println("Enter three numbers!");
        System.out.print("First number: ");
        int n1 = number.nextInt();

        System.out.print("Enter the second number: ");
        int n2 = number.nextInt();

        System.out.print("Enter the third number: ");
        int n3 = number.nextInt();

        int a, b, c = 0;

        // Sorting the number in ascending order
        if (n1 > n3 && n2 > n3) {
            a = n3;
            b = n2;
            c = n1;
        } else if (n3 > n2 && n1 > n3) {
            a = n2;
            b = n3;
            c = n1;
        } else if (n2 > n1 && n1 > n3) {
            a = n3;
            b = n1;
            c = n2;
        } else if (n3 > n1 && n2 > n3) {
            a = n1;
            b = n3;
            c = n2;
        } else if (n3 > n1 && n1 > n2) {
            a = n2;
            b = n1;
            c = n3;
        } else {
            a = n1;
            b = n2;
            c = n3;
        }
        System.out.println("Order: " + a + ", " + b + ", " + c);

        // Closing scanner
        number.close();
    }
}
