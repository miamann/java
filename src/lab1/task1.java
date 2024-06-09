package lab1;
import java.util.*;
import java.util.stream.Collectors;

public class task1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 2, 3, 3, 1);
        Map<Integer, Long> frequencyMap = numbers.stream()
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        List<Integer> result = numbers.stream()
                .filter(e -> frequencyMap.get(e) % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(result);
    }
}
