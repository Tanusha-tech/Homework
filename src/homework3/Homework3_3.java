package homework3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework3_3 {
    public static void main(String[] args) {
        /* Найти индексы минимального и максимального элементов и вывести в консоль. */

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Введите размер массива");
        int size = scanner.nextInt();
        int[] mass = new int[size];
        int[] massSorted = new int[size];

        for (int i = 0; i < size; i++) {
            mass[i] = random.nextInt(100);
            massSorted[i] = mass[i];
        }

        System.out.println("Массив: " + Arrays.toString(mass));

        Arrays.sort(massSorted);
        int iMax = massSorted[size - 1];
        int iMin = massSorted[0];
        int posMax = 0, posMin = 0;
        for (int i = 0; i < size; i++) {
            if (mass[i] == iMax)
                posMax = i;
            if (mass[i] == iMin)
                posMin = i;
        }

        System.out.println("Максимальный элемент в массиве = " + iMax + ", его индекс = " + posMax);
        System.out.println("Минимальный элемент в массиве = " + iMin + ", его индекс = " + posMin);
    }
}
