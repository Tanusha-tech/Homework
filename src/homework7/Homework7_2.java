package homework7;

import java.util.Scanner;

public class Homework7_2 {
    public static void main(String[] args) {
        /* Ввести 3 строки с консоли. Упорядочить и вывести строки в порядке
        возрастания значений их длины. */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первую строку");
        String text = scanner.nextLine();

        System.out.println("Введите вторую строку");
        String text2 = scanner.nextLine();

        System.out.println("Введите третью строку");
        String text3 = scanner.nextLine();

        //Сортировка методом пузырька
        if (text.length() > text2.length()) {
            String temp = text;
            text = text2;
            text2 = temp;
        }

        if (text2.length() > text3.length()) {
            String temp = text2;
            text2 = text3;
            text3 = temp;
        }

        if (text.length() > text2.length()) {
            String temp = text;
            text = text2;
            text2 = temp;
        }

        System.out.println("Строки в порядке возрастания длины:");
        System.out.println(text);
        System.out.println(text2);
        System.out.println(text3);
    }
}
