package homework4.homework4_1;

import java.util.Scanner;

public class CreditCard {
    /* Создать класс CreditCard c полями номер счета, текущая сумма на счету.
     Добавьте метод, который позволяет начислять сумму на кредитную карточку.
     Добавьте метод, который позволяет снимать с карточки некоторую сумму.
     Добавьте метод, который выводит текущую информацию о карточке. Напишите
     программу, которая создает три объекта класса CreditCard у которых заданы номер счета и начальная сумма.
     Тестовый сценарий для проверки: Положите деньги на первые две карточки и
     снимите с третьей. Выведите на экран текущее состояние всех трех карточек. */

    Scanner scanner = new Scanner(System.in);
    String accountNumber;
    int money;

    public CreditCard(String accountNumber, int money) {
        this.accountNumber = accountNumber;
        this.money = money;
    }

    public void accrualMoney() {
        System.out.println("Сколько денег вы хотите положить на карту: " + accountNumber + "?");
        int accrualMoney = scanner.nextInt();
        money += accrualMoney;
    }

    public void withdrawalMoney() {
        System.out.println("Сколько денег вы хотите снять с карты: " + accountNumber + "?");
        int withdrawalMoney = scanner.nextInt();
        money -= withdrawalMoney;
    }

    public void informationAccountNumber() {
        System.out.println("На карте " + accountNumber + ": " + money + " рублей");
    }
}
