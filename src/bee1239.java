import java.util.Scanner;

public class bee1239 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String text = scanner.nextLine();
            System.out.println(convertToHTML(text));
        }
        scanner.close();
    }
    private static String convertToHTML(String text) {
        StringBuilder result = new StringBuilder();
        boolean italic = false;
        boolean bold = false;
        for (char ch : text.toCharArray()) {
            if (ch == '_') {
                if (italic) {
                    result.append("</i>");
                } else {
                    result.append("<i>");
                }
                italic = !italic;
            } else if (ch == '*') {
                if (bold) {
                    result.append("</b>");
                } else {
                    result.append("<b>");
                }
                bold = !bold;
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }
}
