import java.util.Scanner;

public class bee1012 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double A = input.nextDouble();
        double B = input.nextDouble();
        double C = input.nextDouble();
        double triangle = (A * C) / 2.0;
        double circle = 3.14159 * Math.pow(C, 2);
        double trapezium = ((A + B) * C) / 2.0;
        double square = B * B;
        double rectangle = A * B;

        System.out.printf("TRIANGULO: %.3f%n", triangle);
        System.out.printf("CIRCULO: %.3f%n", circle);
        System.out.printf("TRAPEZIO: %.3f%n", trapezium);
        System.out.printf("QUADRADO: %.3f%n", square);
        System.out.printf("RETANGULO: %.3f%n", rectangle);
    }
}
