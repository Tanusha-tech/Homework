package homework3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework3_5 {
    public static void main(String[] args) {
        /* Пройти по массиву и поменять местами элементы первый и последний, второй
        и предпоследний и т.д. */

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Введите размер массива");
        int size = scanner.nextInt();
        int[] mass = new int[size];

        for (int i = 0; i < size; i++) {
            mass[i] = random.nextInt(100);
        }

        System.out.println("Массив: " + Arrays.toString(mass));

        for (int i = 0; i < size / 2; i++) {
            int temp = mass[i];
            mass[i] = mass[size - 1 - i];
            mass[size - 1 - i] = temp;
        }

        System.out.println("Преобразованный массив: " + Arrays.toString(mass));

    }
}
