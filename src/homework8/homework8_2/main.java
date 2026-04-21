package homework8.homework8_2;

public class main {
    public static void main(String[] args) {
        AnimalCollection collection = new AnimalCollection();

        collection.addAnimal("Лиса");
        collection.addAnimal("Слон");
        collection.addAnimal("Хомяк");
        collection.printAnimals();

        String removed = collection.removeAnimal();
        System.out.println("Удалено животное: " + removed);
        collection.printAnimals();

        collection.addAnimal("Попугай");
        collection.printAnimals();

        removed = collection.removeAnimal();
        System.out.println("Удалено животное: " + removed);
        collection.printAnimals();
    }
}
