import java.util.Scanner;
import java.util.Arrays;

public class bee1042 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[3];
        for (int i = 0; i < 3; i++) {
            num[i] = scanner.nextInt();
        }
        int[] original = Arrays.copyOf(num, 3);
        Arrays.sort(num);
        for (int i = 0; i < 3; i++) {
            System.out.println(num[i]);
        }
        System.out.println();
        for (int i = 0; i < 3; i++) {
            System.out.println(original[i]);
        }
        scanner.close();
    }
}
