package homework1;

public class Homework1_2 {

    public static void main(String[] args) {

        /* Задача 2:
        В переменной n хранится двузначное число. Создайте программу,
        вычисляющую и выводящую на экран сумму цифр n. Например: n = 26, в
        результате мы должны получить 8 (2 + 6). */

        int n = 89;
        int d, e;

        d = n / 10;
        e = n % 10;

       System.out.println("Сумма цифр n = " + (d + e));
    }
}
