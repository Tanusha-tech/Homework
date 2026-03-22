package homework2;

import java.util.Scanner;

public class Homework2_5 {
    public static void main(String[] args) {
        /* Напишите программу, где пользователь вводит любое целое положительное число.
        А программа суммирует все числа от 1 до введенного пользователем числа. Для ввода числа
        воспользуйтесь классом Scanner. Сделать проверку, чтобы пользователь не мог ввести некорректные данные */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое положительное число");

        if (!scanner.hasNextInt()) System.out.println("Ошибка: Введите целое число");
        else {
            int n = scanner.nextInt();
            int s = 0;
            if (n > 0) {
                for (int i = 1; i <= n; i++) {
                    s += i;
                }
                System.out.println("Сумма чисел от 1 до " + n + " = " + s);
            } else System.out.println("Число отрицательное");
        }
    }
}
