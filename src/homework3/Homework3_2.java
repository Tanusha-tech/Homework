package homework3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework3_2 {
    public static void main(String[] args) {
        /* Найти минимальный - максимальный элементы и вывести в консоль. */

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Введите размер массива");
        int size = scanner.nextInt();
        int[] mass = new int[size];

        for (int i = 0; i < size; i++) {
            mass[i] = random.nextInt(100);
        }

        System.out.println("Массив: " + Arrays.toString(mass));
        Arrays.sort(mass);
        System.out.println("Максимальный элемент в массиве = " + mass[size - 1]);
        System.out.println("Минимальный элемент в массиве = " + mass[0]);
    }
}
