import java.util.Scanner;

public class bee1014 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int km = input.nextInt();
        double lit = input.nextDouble();
        double res = km / lit;
        System.out.printf("%.3f km/l\n", res);
    }
}
