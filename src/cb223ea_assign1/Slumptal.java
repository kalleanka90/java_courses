package cb223ea_assign1;

public class Slumptal {
    public static void main(String[] args) {

        // Generates 5 random numbers
        int rn1 = (int) Math.floor(Math.random() * 100) + 1;
        int rn2 = (int) Math.floor(Math.random() * 100) + 1;
        int rn3 = (int) Math.floor(Math.random() * 100) + 1;
        int rn4 = (int) Math.floor(Math.random() * 100) + 1;
        int rn5 = (int) Math.floor(Math.random() * 100) + 1;
        System.out.println("Random numbers: " + rn1 + " " + rn2 + " " + rn3 + " " + rn4 + " " + rn5);

        // Prints the sum of all the random numbers
        System.out.println("The sum is: " + (rn1 + rn2 + rn3 + rn4 + rn5));
    }
}
