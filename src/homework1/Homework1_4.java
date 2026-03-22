package homework1;

public class Homework1_4 {

    public static void main(String[] args) {
        /* Задача 4:
        В переменной n хранится вещественное число с ненулевой дробной частью.
        Создайте программу, которая округляет число n до ближайшего целого и
        выводящую результат на экран. */

        double n = 3.54;
        double fractionalPart = n % 1;
        int i = (int) n;

        if (fractionalPart >= 0.5) {
            ++i;
        }

        System.out.println("Округление n числа до ближайшего целого = " + i);
    }
}
