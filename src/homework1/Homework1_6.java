package homework1;

public class Homework1_6 {
    public static void main(String[] args) {

        /* Задача * :
        Написать программу которая будет менять местами значение целочисленных
        переменных. */

        int a = 2;
        int b = 4;

        int bNew = a;
        a = b;
        b = bNew;

        System.out.println("Новые значения для переменных");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
