package homework5.homework5_2;

public class Main {
    /* Написать иерархию классов Фигура, Треугольник, Прямоугольник, Круг.
       Реализовать функцию подсчета площади для каждого типа фигуры и подсчет периметра
       (используя абстрактный класс/методы). Создать массив из 5 разных фигур.
       Вывести на экран сумму периметра всех фигур в массиве */

    public static void main(String[] args) {
        Figure[] figures = {
                new Triangle(3, 4, 5),
                new Rectangle(2, 5),
                new Circle(3),
                new Triangle(6, 6, 6),
                new Rectangle(4, 7)
        };

        for (int i = 0; i < figures.length; i++) {
            Figure figure = figures[i];

            System.out.println("\nФигура " + (i + 1) + ": " + figure);
            System.out.printf("  Площадь: %.2f%n", figure.area());
            System.out.printf("  Периметр: %.2f%n", figure.perimeter());
        }
    }
}
