package homework4.homework4_2;

public class CashMachine {
    /* Создать класс, описывающий банкомат. Набор купюр, находящихся в банкомате,
     должен задаваться тремя свойствами: количеством купюр номиналом 20, 50 и 100.
     Сделать метод для добавления денег в банкомат.
     Сделать функцию, снимающую деньги, которая принимает сумму денег, а возвращает булевое значение - успешность
     выполнения операции.
     При снятии денег, функция должна распечатывать каким количеством купюр какого номинала выдаётся сумма.
     Создать конструктор с тремя параметрами - количеством купюр каждого номинала */

    int banknotes20;
    int banknotes50;
    int banknotes100;

    public CashMachine(int banknotes20, int banknotes50, int banknotes100) {
        this.banknotes20 = banknotes20;
        this.banknotes50 = banknotes50;
        this.banknotes100 = banknotes100;
    }

    // Метод для добавления денег в банкомат
    public void addMoney(int add20, int add50, int add100) {
        banknotes20 += add20;
        banknotes50 += add50;
        banknotes100 += add100;
        System.out.println("\n===ПОПОЛНЕНИЕ СЧЕТА===");
        System.out.println("Вы внесли: " + add20 + "  купюр по 20, " + add50 + "  купюр по 50, " + add100 + " купюр по 100");
        System.out.println("Итого Вы внесли: " + (add100 * 100 + add50 * 50 + add20 * 20) + " рублей");
    }

    // Метод для снятия денег с банкомата
    public boolean withdrawMoney(int sum) {
        if (sum <= 0) {
            System.out.println("\n===ВЫДАЧА НАЛИЧНЫХ===");
            System.out.println("Некорректная сумма.");
            return false;
        }

        // Перебор кол-ва банкнот, начиная с максимального номинала
        for (int nominal100 = Math.min(banknotes100, sum / 100); nominal100 >= 0; nominal100--) {
            int remainingAfter100 = sum - nominal100 * 100;
            for (int nominal50 = Math.min(banknotes50, remainingAfter100 / 50); nominal50 >= 0; nominal50--) {
                int remainingAfter50 = remainingAfter100 - nominal50 * 50;

                // Проверяем, можно ли оставшуюся сумму выдать двадцатками
                if (remainingAfter50 % 20 == 0) {
                    int nominal20 = remainingAfter50 / 20;
                    if (nominal20 <= banknotes20) {
                        // Если найдена успешная комбинация, обновляем кол-во банкнот на балансе
                        banknotes100 -= nominal100;
                        banknotes50 -= nominal50;
                        banknotes20 -= nominal20;

                        System.out.println("\n===ВЫДАЧА НАЛИЧНЫХ===");
                        System.out.println("Выдача:" + sum + " рублей");
                        if (nominal100 > 0) System.out.println(nominal100 + " купюр по 100");
                        if (nominal50 > 0) System.out.println(nominal50 + " купюр по 50");
                        if (nominal20 > 0) System.out.println(nominal20 + " купюр по 20");
                        return true;
                    }
                }
            }
        }

        System.out.println("\n===ВЫДАЧА НАЛИЧНЫХ===");
        System.out.println("Невозможно выдать запрошенную сумму. " + sum + " рублей нельзя обменять на доступные банкноты");
        return false;
    }

    // Метод для просмотра баланса
    public void printState() {
        System.out.println("\n===ПРОСМОТР БАЛАНСА===");
        System.out.println("В банкомате: " + banknotes20 + " купюр по 20, " + banknotes50 + " купюр по 50, " + banknotes100 + " купюр по 100");
        System.out.println("Итого на балансе: " + (banknotes100 * 100 + banknotes50 * 50 + banknotes20 * 20) + " рублей");
    }
}
