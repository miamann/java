import java.util.Scanner;

public class bee1011 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double radius = input.nextDouble();
        double p = 3.14159;
        double volume = (4.0 / 3.0) * p * Math.pow(radius, 3);
        System.out.printf("VOLUME = %.3f%n", volume);
    }
}
