package homework7;

import java.util.Scanner;

public class Homework7_3 {
    public static void main(String[] args) {
        /* Ввести 3 строки с консоли. Вывести на консоль те строки, длина которых
        меньше средней, а также их длину */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первую строку");
        String text = scanner.nextLine();

        System.out.println("Введите вторую строку");
        String text2 = scanner.nextLine();

        System.out.println("Введите третью строку");
        String text3 = scanner.nextLine();

        int avg = (text.length() + text2.length() + text3.length()) / 3;

        System.out.printf("Строки короче средней длины = %d: %n", avg);

        if (text.length() < avg) System.out.printf("Строка: %s, Длина: %d%n", text, text.length());
        if (text2.length() < avg) System.out.printf("Строка: %s, Длина: %d%n", text2, text2.length());
        if (text3.length() < avg) System.out.printf("Строка: %s, Длина: %d%n", text3, text3.length());
    }
}
