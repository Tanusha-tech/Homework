package homework4.homework4_1;

public class CreditCard {
    /* Создать класс CreditCard c полями номер счета, текущая сумма на счету.
     Добавьте метод, который позволяет начислять сумму на кредитную карточку.
     Добавьте метод, который позволяет снимать с карточки некоторую сумму.
     Добавьте метод, который выводит текущую информацию о карточке. Напишите
     программу, которая создает три объекта класса CreditCard у которых заданы номер счета и начальная сумма.
     Тестовый сценарий для проверки: Положите деньги на первые две карточки и
     снимите с третьей. Выведите на экран текущее состояние всех трех карточек. */

    String accountNumber;
    int money;

    public CreditCard(String accountNumber, int money) {
        this.accountNumber = accountNumber;
        this.money = money;
    }

    public void accrualMoney(int accrualMoney) {
        money += accrualMoney;
    }

    public void withdrawalMoney(int withdrawalMoney) {
        money -= withdrawalMoney;
    }

    public void informationAccountNumber() {
        System.out.println("На карте " + accountNumber + ": " + money + " рублей");
    }
}
