package lab1;
import java.util.stream.IntStream;

public class task7 {
    public static void main(String[] args) {
        int age = 15;
        IntStream.rangeClosed(1, age)
                .filter(n -> (age % 2 == 0) ? n % 2 == 0 : n % 2 != 0)
                .forEach(n -> System.out.print(n + " "));
    }
}

