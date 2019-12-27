package cb223ea_assign2;

import java.util.Scanner; // Import of Scanner class

public class Datumformat {
    public static void main(String[] args) {

        // Starting Scanner
        Scanner input = new Scanner(System.in);

        // Asks the user for a year
        System.out.print("Write a year: ");
        int year = Integer.parseInt(input.nextLine());

        // Asks the user for a month using numbers
        System.out.print("Write a month(number): ");
        int month = Integer.parseInt(input.nextLine());

        // Asks the user for a day using numbers
        System.out.print("Write a day(number): ");
        int day = Integer.parseInt(input.nextLine());

        // Asks the user what format should be used
        System.out.print("Choose format (b/l/m): ");
        String format = input.nextLine();

        // Calls the method dateform with all inputs as parameters
        String date = dateform(year, month, day, format);

        // Prints the string returned from the method dateform
        System.out.print(date);

        // Closing Scanner
        input.close();
    }

    public static String dateform(int year, int month, int day, String format) {

        String date = "";

        // Converts the integers to strings and formatting days and months if
        // they don't have 2 digits and using the correct format chosen by the user
        if (format.contains("b")) {
            date = String.format("%d/%02d/%02d", year, month, day);
        } else if (format.contains("l")) {
            date = String.format("%02d/%02d/%d", day, month, year);
        } else if (format.contains("m")) {
            date = String.format("%02d/%02d/%d", month, day, year);
        }

        // Returns the string
        return date;
    }
}
