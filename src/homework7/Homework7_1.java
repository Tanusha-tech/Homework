package homework7;

import java.util.Scanner;

public class Homework7_1 {
    public static void main(String[] args) {
        /* Ввести 3 строки с консоли, найти самую короткую и самую длинную строки.
         Вывести найденные строки и их длину. */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первую строку");
        String text = scanner.nextLine();

        System.out.println("Введите вторую строку");
        String text2 = scanner.nextLine();

        System.out.println("Введите третью строку");
        String text3 = scanner.nextLine();

        String shortest = text;
        String longest = text;

        if (text2.length() < shortest.length()) {
            shortest = text2;
        }
        if (text2.length() > longest.length()) {
            longest = text2;
        }

        if (text3.length() < shortest.length()) {
            shortest = text3;
        }
        if (text3.length() > longest.length()) {
            longest = text3;
        }

        System.out.printf("Самая короткая строка: %s, длина %d: %n", shortest, shortest.length());
        System.out.printf("Самая длинная строка: %s, длина %d: %n", longest, longest.length());
    }
}
