package Exercises;

import java.util.*;
import java.util.Scanner; // Import of Scanner class

public class arrayListTesting {
    public static void main(String[] args) {

        List<Integer> arr = new ArrayList<>(
                Arrays.asList(
                        3, 6, 8, 9
                ));
        ArrayList<Integer> intarrList = new ArrayList<Integer>(arr);
        System.out.println(intarrList);
        Scanner input = new Scanner(System.in);
        ArrayList<String> arlist = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            System.out.print("Input a string: ");
            if (i == 2) {
                arlist.add(0, input.nextLine());
            } else {
                arlist.add(input.nextLine());
            }
        }

        for (String eleTest : arlist) {
            System.out.print(eleTest);
        }
        System.out.println(arlist);
        arlist.remove(1);
        System.out.println(arlist);
        System.out.println(arlist.size());
        arlist.set(0, "this is a replacement");
        System.out.println(arlist);
    }
}
