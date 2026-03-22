package homework2;

import java.util.Scanner;

public class Homework2_1 {
    public static void main(String[] args) {
        /* Напишите программу, которая будет принимать на вход число из консоли и на
        выход будет выводить сообщение четное число или нет. Для определения
        четности числа используйте операцию получения остатка от деления (операция
        выглядит так: '% 2'). */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int n = scanner.nextInt();

        String result = n % 2 == 0 ? "Число четное" : "Число нечетное";
        System.out.println(result);
    }
}
