import java.util.Scanner;

public class bee1019 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int h = a / 3600;
        int min = (a % 3600) / 60;
        int sec = a % 60;
        System.out.printf("%d:%d:%d%n", h, min, sec);
    }
}
