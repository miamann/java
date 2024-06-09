import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class bee1581 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < N; i++) {
            int K = scanner.nextInt();
            scanner.nextLine();
            Set<String> languages = new HashSet<>();
            for (int j = 0; j < K; j++) {
                String language = scanner.nextLine();
                languages.add(language);
            }
            if (languages.size() == 1) {
                System.out.println(languages.iterator().next());
            } else {
                System.out.println("ingles");
            }
        }

        scanner.close();
    }
}
