package homework8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class homework8_1 {
    public static void main(String[] args) {
        /* Пользователь вводит набор чисел в виде одной строки с клавиатуры.
            Например: "1, 2, 3, 4, 4, 5". Избавиться от повторяющихся элементов в строке.
            Вывести результат на экран.
            При решении использовать коллекции. */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите набор чисел через запятую, например \"1, 2, 3, 4, 4, 5\": \n");
        String numbers = scanner.nextLine();

        String[] numberArray = numbers.split(",\\s*"); //Разделение строки на отдельные числа
        Set<String> uniqueNumbers = new HashSet<>(Arrays.asList(numberArray));

        System.out.println("Результат без дубликатов:");
        System.out.println(uniqueNumbers);
    }
}
