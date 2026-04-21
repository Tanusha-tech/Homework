package homework7;

import java.util.Scanner;

public class Homework7_5 {
    public static void main(String[] args) {
        /* Вывести на консоль новую строку, которой задублирована каждая буква из
        начальной строки. Например, "Hello" -> "HHeelllloo" */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");

        String input = scanner.nextLine();
        String result = doubleEachLetter(input);
        System.out.println(result);
    }

    public static String doubleEachLetter(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            result.append(ch).append(ch);
        }
        return result.toString();
    }
}
