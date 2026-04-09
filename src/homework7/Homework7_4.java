package homework7;

import java.util.Scanner;

public class Homework7_4 {
    public static void main(String[] args) {
        /* Ввести 3 строки с консоли. Найти слово, состоящее только из различных
        символов. Если таких слов несколько, найти первое из них.*/

        Scanner scanner = new Scanner(System.in);

        String[] text = new String[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Введите строку " + (i + 1) + ": ");
            text[i] = scanner.nextLine();
        }

        // Перебираем все слова во всех строках
        for (String line : text) {
            String[] words = line.split(" ");
            for (String word : words) {
                if (isAllCharsUnique(word)) {
                    System.out.println("Первое слово с уникальными символами: " + word);
                    return; // Завершаем после нахождения первого подходящего слова
                }
            }
        }

        System.out.println("Слов с уникальными символами не найдено.");
    }

    // Проверка на уникальность символов
    private static boolean isAllCharsUnique(String word) {
        char[] chars = word.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
