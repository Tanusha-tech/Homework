package homework3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework3_4 {
    public static void main(String[] args) {
        /* Найти и вывести количество нулевых элементов. Если нулевых элементов нет -
        вывести сообщение, что их нет. */

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Введите размер массива");
        int size = scanner.nextInt();
        int[] mass = new int[size];

        for (int i = 0; i < size; i++) {
            mass[i] = random.nextInt(5);
        }

        System.out.println("Массив: " + Arrays.toString(mass));

        int count = 0;
        for (int i = 0; i < size; i++) {
            if (mass[i] == 0) {
                count++;
            }
        }

        if (count > 0) {
            System.out.println("количество нулевых элементов = " + count);
        } else {
            System.out.println("Нулевых элементов нет");
        }
    }
}
