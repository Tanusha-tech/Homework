package homework8.homework8_2;

import java.util.LinkedList;

public class AnimalCollection {
        /* Создать класс, который будет хранить в себе коллекцию с названиями
        животных. Реализовать методы удаления и добавления животных по
        следующим правилам: добавляется всегда в начало коллекции, а удаляется
        всегда из конца. Показать работу объекта этого класса в main методе другого
        класса.*/

    private final LinkedList<String> animals;

    public AnimalCollection() {
        this.animals = new LinkedList<>();
    }

    public void addAnimal(String animal) {
        animals.addFirst(animal);
    }

    //Удаление и возвращение животного из конца коллекции
    public String removeAnimal() {
        if (animals.isEmpty()) {
            return null;
        }
        return animals.removeLast();
    }

    public void printAnimals() {
        System.out.println("Текущая коллекция: " + animals);
    }
}
