package homework3;

import java.util.Arrays;
import java.util.Scanner;

public class Homework3_1 {
    public static void main(String[] args) {
        /* Пройти по массиву, вывести все элементы в прямом и в обратном порядке. */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите размер массива");
        int size = scanner.nextInt();
        int[] massStraight = new int[size];
        int[] massReverse = new int[size];

        System.out.println("Введите элементы массива");
        for (int i = 0; i < size; i++) {
            massStraight[i] = scanner.nextInt();
            massReverse[size - i - 1] = massStraight[i];
        }

        System.out.println("Массив в прямом порядке: " + Arrays.toString(massStraight));
        System.out.println("Массив в обратном порядке: " + Arrays.toString(massReverse));
    }
}
