package homework6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionsAndError {
        /* Создать класс с как минимум 4 разными методами, в каждом методе добавить проверку
        на исключительные ситуации, используя:
        1. try- catch
        2. try-catch, где catch будет несколько
        3. try -catch, с использованием multi - catch
        4. try-catch-finally
        Продемонстрировать обработку исключительных ситуаций на примерах */

    public void method1() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введите целое число: ");
            int number = scanner.nextInt();
            System.out.println("Вы ввели: " + number);
        } catch (InputMismatchException e) {
            System.out.println("Ошибка: Введено не целое число.");
            scanner.next();
        }
    }

    public void method2() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите делитель ");
        int a = scanner.nextInt();

        try {
            int result = 10 / a;
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: Деление на ноль.");
        } catch (Exception e) {
            System.out.println("Другая ошибка: " + e.getMessage());
        }
    }

    public void method3() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите индекс массива (0-4), чтобы его заполнить: ");

        try {
            int index = Integer.parseInt(scanner.nextLine());
            int[] arr = new int[5];
            arr[index] = 10;
            System.out.println("Записали число в массив");
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: неверный ввод или индекс вне массива!");
        }
    }

    public void method4() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите индекс массива (0-4), чтобы вывести элемент массива: ");
        int[] arr = {10, 20, 30, 40, 50};

        try {
            int index = scanner.nextInt();
            System.out.println("Элемент: [%s] = %s".formatted(index, (arr[index])));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: Индекс вне границ массива!");
        } finally {
            scanner.close();
            System.out.println("Блок finally: операция завершена");
        }
    }
}
