package cb223ea_assign2;

import java.util.Scanner; // Import of Scanner class

public class Primtal {
    public static void main(String[] args) {

        // Starting new scanner
        Scanner input = new Scanner(System.in);

        // The integer that will be checked for primes
        int prime = 0;

        // Do...while-loop that will continue as long as the integer input is positive
        do {
            System.out.print("Enter a positive Integer: ");
            prime = input.nextInt();

            // Checks if the integer is positive of negative
            if (prime < 0) {
                System.out.println("Goodbye!");
            } else {

                // Calls the method isPrime with the integer as a parameter
                // to check if the positive integer is a prime
                boolean isPrime = ifPrime(prime);

                // The method ifPrime returns a boolean to display if the integer is
                // a prime or not
                if (isPrime) {
                    System.out.println("It is a prime!");
                } else {
                    System.out.println("It's not a prime!");
                }
            }
        } while (prime >= 0);

        // Closing scanner
        input.close();
    }

    public static boolean ifPrime(int prime) {

        // The boolean that will be returned
        boolean isPrime = true;

        // Checks if the prime-parameter is divisible by 2 and up to ( prime / 2)
        // and if the remainder of the calculation = 0 then it's not a prime.
        for (int i = 2; i <= (prime / 2); i++) {
            if (prime % i == 0) {
                isPrime = false;
                break;
            }
        }

        // Returns the boolean isPrime
        return isPrime;
    }
}
