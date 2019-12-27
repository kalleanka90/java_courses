package cb223ea_assign2;

import java.util.Scanner; // Import of Scanner class

public class VarannanSiffra {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);

        System.out.print("Type in a start value: ");
        int start = number.nextInt();

        System.out.print("And now type in a stop value: ");
        int stop = number.nextInt();


        String result = "";

        // This while-loop adds every other Integer (including the start value) to result
        while (start < stop) {
            result += " " + start;
            start += 2;
        }
        System.out.print(result);

        // Closing scanner
        number.close();
    }
}
