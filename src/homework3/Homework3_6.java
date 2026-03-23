package homework3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework3_6 {
    public static void main(String[] args) {
        /* Проверить, является ли массив возрастающей последовательностью
        (каждое следующее число больше предыдущего) */

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Введите размер массива");
        int size = scanner.nextInt();
        int[] mass = new int[size];

        for (int i = 0; i < size; i++) {
            mass[i] = random.nextInt(100);
        }

        System.out.println("Массив: " + Arrays.toString(mass));

        boolean subsequence = true;
        for (int i = 0; i < size - 1; i++) {
            if (mass[i] >= mass[i + 1]) {
                subsequence = false;
                break;
            }
        }

        if (subsequence) {
            System.out.println("Массив является возрастающей последовательностью.");
        } else {
            System.out.println("Массив не является возрастающей последовательностью.");
        }
    }
}
