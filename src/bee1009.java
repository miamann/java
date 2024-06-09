import java.util.Scanner;

public class bee1009 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.next();
        double salary = input.nextDouble();
        double total = input.nextDouble();
        double res = salary + (total * 0.15);
        System.out.printf("TOTAL = R$ %.2f%n", res);
    }
}
