package cb223ea_assign2;

import java.util.Scanner; // Import of Scanner class

public class Palindrom {
    public static void main(String[] args) {

        // Starting new scanner
        Scanner input = new Scanner(System.in);

        // String variable for input
        String str = "";

        // This while-loop will continue as long as str does not contain the text "stopp"
        while (!str.contains("stopp")) {
            System.out.print("Enter a string: ");
            str = input.nextLine();

            // Checks if str contains the text "stopp" to stopp
            // or if the program should continue
            if (!str.contains("stopp")) {
                boolean isPal = palindrome(str);
                if (isPal) {
                    System.out.println("The entered string is a palindrome.");
                } else {
                    System.out.println("The entered string is not a palindrome.");
                }
            }
        }
        // Closing scanner
        input.close();
    }

    public static boolean palindrome(String str) {

        // Transforms all letters to lower case letters
        str = str.toLowerCase();

        // Removes all whitespaces
        str = str.replaceAll(" ", "");

        // The index-number at the end of the string
        int high = str.length() - 1;

        // The variable to be returned
        boolean isPal = true;

        // Loops through all index-numbers of the string
        for (int low = 0; low < high; low++) {

            // Checks if the low and high index contains the same letter and then proceeds
            // if they do not, the loop will break and return isPal = false
            if (str.charAt(low) != str.charAt(high)) {
                isPal = false;
                break;
            }
            high--;
        }

        return isPal;
    }
}
