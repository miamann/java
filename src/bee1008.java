import java.util.Scanner;

public class bee1008 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int h = input.nextInt();
        double r = input.nextDouble();
        double salary = h * r;
        System.out.printf("NUMBER = %d%n", num);
        System.out.printf("SALARY = U$ %.2f%n", salary);
    }
}
