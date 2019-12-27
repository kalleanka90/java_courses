package cb223ea_assign2;

import java.util.Scanner; // Import of Scanner class

public class FarligtArbete {
    public static void main(String[] args) {
        Scanner w = new Scanner(System.in);

        System.out.print("How much would you line to earn? ");
        int salary = w.nextInt();
        double pay = 0.01;
        int days = 0;

        // While the pay is less than the salary wanted, loop and double the pay
        while (pay < salary) {
            pay *= 2;
            days++;
        }
        // Checks if the user will survive to get the amount of money
        if (days <= 30) {
            System.out.print("You will have the money in " + days + " days.");
        } else {
            System.out.print("You wouldn't survive, it would take you " + days + " days to get the money.");
        }

        // Closing scanner
        w.close();
    }
}
