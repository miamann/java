import java.util.Scanner;

public class bee1020 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age= input.nextInt();
        int years = age / 365;
        int months = (age % 365) / 30;
        int days = (age % 365) % 30;
        System.out.printf("%d ano(s)%n", years);
        System.out.printf("%d mes(es)%n", months);
        System.out.printf("%d dia(s)%n", days);
    }
}
