import java.util.Scanner;

public class bee1002 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double p = 3.14159;
        double R = input.nextDouble();
        double A = p * R * R;
        System.out.printf("A=%.4f%n", A);
    }
}
