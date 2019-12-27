package cb223ea_assign1;

import java.util.Scanner;  // Import the Scanner class

public class DoctorWho {
    public static void main(String[] args) {
        Scanner y = new Scanner(System.in);

        // The user puts in a year to see if and which Doctor Who series was aired that year
        System.out.println("Enter a year to find out when and which series of Doctor Who was aired: ");
        int year = y.nextInt();

        // Checks the input year to see if it matches any options
        if (year >= 1963 && year < 1989) {
            System.out.print("The original series was aired.");
        } else if (year >= 1989 && year < 2005) {
            System.out.print("At this time the series had a pause.");
        } else if (year >= 2005 && year <= 2020) {
            System.out.print("The modern Doctor Who.");
        } else if (year > 2020) {
            System.out.print("We don't know, but we can always hope.");
        } else {
            System.out.print("The Doctor hasn't been born yet.");
        }
        
        // Closing scanner
        y.close();
    }
}
