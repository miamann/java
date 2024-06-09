package lab2;
import java.io.*;
import java.util.Scanner;


public class task4 {
    public static void main(String[] args) throws Exception {
        if (args.length != 4) {
            System.out.println("использование: java ReplaceText sourceFile targetFile oldStr newStr");
            System.exit(1);
        }
        File sourceFile = new File(args[0]);
        if (!sourceFile.exists()) {
            System.out.println("исходного файла " + args[0] + " не существует");
            System.exit(2);
        }
        File targetFile = new File(args[1]);
        if (targetFile.exists()) {
            System.out.println("целеевой файл " + args[1] + " уже существуеи");
            System.exit(3);
        }

        try (
                Scanner input = new Scanner(sourceFile);
                PrintWriter output = new PrintWriter(targetFile);
        ) {
            while (input.hasNext()) {
                String s1 = input.nextLine();
                String s2 = s1.replaceAll(args[2], args[3]);
                output.println(s2);
            }
        }
    }
}

