package Exercises;

public class MethodPractice {
    public static void main(String[] args) {

        double x = 13.56;
        double y = 199.123;
        System.out.println(xMethod(x, y));
    }

    public static double xMethod(double x, double y) {
        System.out.println(x + y);
        return x + y;
    }
}
