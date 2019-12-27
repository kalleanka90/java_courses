package Exercises;

import java.util.Scanner; // Import Scanner classs

public class charTesting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = (int)'\t';
        System.out.printf("\\u%04x", i);

    }
}
