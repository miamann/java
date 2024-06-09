import java.util.Scanner;

public class bee1040 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float N1 = scanner.nextFloat();
        float N2 = scanner.nextFloat();
        float N3 = scanner.nextFloat();
        float N4 = scanner.nextFloat();
        float average = (N1 * 2 + N2 * 3 + N3 * 4 + N4 * 1) / 10;
        System.out.printf("Media: %.1f%n", average);
        if (average >= 7.0) {
            System.out.println("Aluno aprovado.");
        } else if (average < 5.0) {
            System.out.println("Aluno reprovado.");
        } else {
            System.out.println("Aluno em exame.");
            float examScore = scanner.nextFloat();
            System.out.printf("Nota do exame: %.1f%n", examScore);
            float finalAverage = (average + examScore) / 2;
            if (finalAverage >= 5.0) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }
            System.out.printf("Media final: %.1f%n", finalAverage);
        }
        scanner.close();
    }
}
