package homework1;

public class Homework1_3 {

    public static void main(String[] args) {
        /* Задача 3:
        В переменной n хранится трёхзначное число. Создайте программу,
        вычисляющую и выводящую на экран сумму цифр n. Например: n = 126, в
        результате мы должны получить 9 (1+2+6). */

        int n = 339;
        int s, d, e;

        s = n / 100;
        d = (n % 100) / 10;
        e = n % 10;

        System.out.println("Сумма цифр n = " + (s + d + e));
    }
}
