package cb223ea_assign2;

import java.util.ArrayList; // Import the ArrayList class
import java.util.Random;    // Import the Random class
import java.util.Collections; // Import the Collections class

public class Lotto {
    public static void main(String[] args) {

        // Creating new Random
        Random lottNr = new Random();

        // Creating new ArrayList
        ArrayList<Integer> lottoRad = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            int number;
            // Generates a random number until a non-existent
            // number is generated for each element in the array
            do {
                number = lottNr.nextInt(35) + 1;
            } while (lottoRad.contains(number));
            lottoRad.add(number);
        }

        // Using the Collections class to sort my arraylist
        Collections.sort(lottoRad);
        System.out.println("This weeks lucky row: ");

        // This loop prints each number in the arraylist
        for (Integer number : lottoRad) {
            System.out.print(number + " ");
        }
    }
}
