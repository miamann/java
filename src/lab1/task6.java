package lab1;

public class task6 {
    public static void main(String[] args) {
        double earthWeight = 60;
        double moonWeight = earthWeight * 0.165;
        for (int year = 1; year <= 15; year++) {
            moonWeight *= 1.032;
            System.out.printf("%d год: %.2f кг%n", year, moonWeight);
        }
    }
}
