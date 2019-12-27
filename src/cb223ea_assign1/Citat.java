package cb223ea_assign1;

import java.util.Scanner;  // Import the Scanner class

public class Citat {
    public static void main(String[] args) {
        Scanner newQuote = new Scanner(System.in);

        // Asks the user to write a sentence
        System.out.print("Give me a sentence to qoute: ");
        String sentence = newQuote.nextLine();

        // Prints the sentence with quotations
        System.out.print("Qoute of the day: \"" + sentence + "\"");

        // Closing scanner
        newQuote.close();
    }
}
