package cb223ea_assign2;

import java.util.Random; // Import the Random class

public class Histogram {
    public static void main(String[] args) {

        int one = 0, two = 0, three = 0, four = 0, five = 0, six = 0;
        String ones = "", twos = "", threes = "", fours = "", fives = "", sixes = "";

        Random random = new Random();
        for (int i = 0; i < 500; i++) {
            int dice = (random.nextInt(6) + 1);
            if (dice == 1) {
                one++;
                ones += "*";
            } else if (dice == 2) {
                two++;
                twos += "*";
            } else if (dice == 3) {
                three++;
                threes += "*";
            } else if (dice == 4) {
                four++;
                fours += "*";
            } else if (dice == 5) {
                five++;
                fives += "*";
            } else {
                six++;
                sixes += "*";
            }
        }
        System.out.println("Ones (" + one + "): " + ones);
        System.out.println("Ones (" + two + "): " + twos);
        System.out.println("Ones (" + three + "): " + threes);
        System.out.println("Ones (" + four + "): " + fours);
        System.out.println("Ones (" + five + "): " + fives);
        System.out.println("Ones (" + six + "): " + sixes);
    }
}
