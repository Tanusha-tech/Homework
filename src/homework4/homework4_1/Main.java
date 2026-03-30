package homework4.homework4_1;

public class Main {

    public static void main(String[] args) {
        CreditCard creditCard1 = new CreditCard("3911 6127 6452 1193", 100);
        CreditCard creditCard2 = new CreditCard("3911 6101 3452 1154", 10000);
        CreditCard creditCard3 = new CreditCard("3911 6138 7805 2751", 5555);

        creditCard1.accrualMoney();
        creditCard2.accrualMoney();
        creditCard3.withdrawalMoney();

        creditCard1.informationAccountNumber();
        creditCard2.informationAccountNumber();
        creditCard3.informationAccountNumber();
    }
}
