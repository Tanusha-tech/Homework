package homework4.homework4_2;

public class Main {
    
    public static void main(String[] args) {
        CashMachine machine = new CashMachine(10, 8, 6);
        machine.printState(); // Просмотр начального баланса

        machine.withdrawMoney(-30); // Пример некорректного снятия денег
        machine.printState();

        machine.withdrawMoney(30); // Пример снятия денег без подходящего номинала
        machine.printState();

        machine.withdrawMoney(200); // Пример снятия
        machine.printState();

        machine.addMoney(5, 3, 2);
        machine.printState();
    }
}
