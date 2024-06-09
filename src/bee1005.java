import java.util.Scanner;

public class bee1005 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double gradesA = input.nextDouble();
        double gradesB = input.nextDouble();

        double weightA = 3.5;
        double weightB = 7.5;

        double MEDIA = (gradesA * weightA + gradesB * weightB) / (weightA + weightB);

        System.out.printf("MEDIA = %.5f%n", MEDIA);

    }
}

