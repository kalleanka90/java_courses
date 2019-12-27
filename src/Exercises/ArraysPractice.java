package Exercises;

import java.util.Scanner;
import java.util.ArrayList;

public class ArraysPractice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] person = new String[2];
        System.out.print("Enter a forname: ");
        person[0] = input.nextLine();
        System.out.print("Enter a surename: ");
        person[1] = input.nextLine();

        for (int i = 0; i < person.length; i++) {
            System.out.print(person[i] + " ");
        }
    }
}
