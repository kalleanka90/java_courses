package cb223ea_assign2;

import java.util.Random; // Import the Random class

public class AllaUdda {
    public static void main(String[] args) {

        // Creating new Random class
        Random random = new Random();

        // Creating new int-array that can hold 10 integers
        int[] arr = new int[10];

        // Randomizes 10 numbers and puts them in the array, one for each element
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (random.nextInt(100) + 1);
        }

        // Prints every element of the array
        System.out.print("The whole array: ");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.println(arr[i]);
            } else {
                System.out.print(arr[i] + " ");
            }
        }

        // Prints only odd numbers of the array
        System.out.print("The odd numbers in the array: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
