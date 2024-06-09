import java.util.Scanner;

public class bee1006 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double gradeA = input.nextDouble();
        double gradeB = input.nextDouble();
        double gradeC = input.nextDouble();

        double weightA = 2;
        double weightB = 3;
        double weightC = 5;

        double average = (gradeA * weightA + gradeB * weightB + gradeC * weightC) / (weightA + weightB + weightC);

        System.out.printf("MEDIA = %.1f%n", average);
    }
}
