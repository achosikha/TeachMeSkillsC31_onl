package tasks_6.atm_card;

import java.util.Random;
import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        CreditCard1 AlexVISA = new CreditCard1();
        CreditCard1 AlexMasterCard = new CreditCard1();
        CreditCard1 AlexWorld = new CreditCard1();

        AlexVISA.setPlusBalance();
        AlexVISA.getInfoBalance();
        System.out.println();

        AlexMasterCard.setPlusBalance();
        AlexMasterCard.getInfoBalance();
        System.out.println();

        AlexWorld.setMinusBalance();
        AlexWorld.getInfoBalance();
        System.out.println();

        ATM1 Belveb = new ATM1();
        Belveb.addCash();
        Belveb.getwithdrawals(460);
        Belveb.update();
        Belveb.getwithdrawals();
        Belveb.update();
    }
}

class CreditCard1 {
    private int[] accountNumber;
    private int balance;

    // номер карточки создаётся автоматически случайным образом, балансс карточки 2000
    CreditCard1() {
        accountNumber = new int[] {randomNum(), randomNum(), randomNum(), randomNum()};
        balance = 2000;
    }

    private int randomNum() {
        return new Random().nextInt(1111, 9999);
    }

    // выводит номер карточки
    public void getAccountNumber() {
        for (int num : accountNumber) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public int getBalance() {
        return balance;
    }

    // операция по внесению средств на карточку с консоли
    public void setPlusBalance() {
        getInfoBalance();
        System.out.print("Укажите какую сумму положить на счёт: ");
        this.balance += new Scanner(System.in).nextInt();
    }

    // операция по снятию средств с карточки с консоли
    public void setMinusBalance() {
        getInfoBalance();
        System.out.print("Укажите сумму для снятие средств: ");
        this.balance -= new Scanner(System.in).nextInt();
    }

    // выводит информацию о карточки в консоль номер и баланс
    public void getInfoBalance() {
        getAccountNumber();
        System.out.println("Баланс на счету: " + balance);
    }
}
class ATM1 {
    private int banknote20;
    private int banknote50;
    private int banknote100;
    private int balance;

    ATM1() {
        banknote20 = 25;
        banknote50 = 10;
        banknote100 = 5;
        balance = banknote20 * 20 + banknote50 * 50 + banknote100 * 100;
    }
    ATM1(int banknote20, int banknote50, int banknote100) {
        this.banknote20 = banknote20;
        this.banknote50 = banknote50;
        this.banknote100 = banknote100;
        balance = banknote20 * 20 + banknote50 * 50 + banknote100 * 100;
    }
    // обновление значение баланса после операций
    void updateBalance() {
        balance = banknote20 * 20 + banknote50 * 50 + banknote100 * 100;
    }
    void update() {
        System.out.println(balance);
    }

    // операия по добавлению купюр в банкомат
    void addCash() {
        System.out.println("Укажите количество купюр добавленные в банокмат каждого номинала");
        System.out.print("номиналом 20: ");
        banknote20 += new Scanner(System.in).nextInt();
        System.out.print("номиналом 50: ");
        banknote50 += new Scanner(System.in).nextInt();
        System.out.print("номиналом 100: ");
        banknote100 += new Scanner(System.in).nextInt();
        updateBalance();
        System.out.println("Итоговый баланс средст банкомата: " + balance);
    }
    void addCash(int banknote20, int banknote50, int banknote100) {
        System.out.println("Купюры добавленные в банокмат каждого номинала");
        System.out.println("номиналом 20: " + banknote20);
        this.banknote20 += banknote20;
        System.out.println("номиналом 50: " + banknote50);
        this.banknote50 += banknote50;
        System.out.println("номиналом 100: " + banknote100);
        this.banknote100 += banknote100;
        updateBalance();
        System.out.println("Итоговый баланс средст банкомата: " + balance);
    }
    // снятие денег с банкомата
    boolean getwithdrawals(int balance) {
        // проверка хватит ли денег в банкомате.
        if(this.balance > balance) {
            // проверка на соответсвие суммы купюрам банкомата, вторая проверка проверяет значения с 70 и 90
            if(((balance % 20 == 0) || ((balance - 50) % 20 == 0)) && balance != 0){
                int cashBanknote100 = 0;
                int cashBanknote50 = 0;
                int cashBanknote20 = 0;
                // выдача купюр по 1
                while (balance >= 100) {
                    balance -= 100;
                    cashBanknote100++;
                }
                // проверка на числа которые могу привести к ошибке 60, 80.
                while ((balance >= 50) && !(balance < 100 && balance % 20 == 0)) {
                    balance -= 50;
                    cashBanknote50++;
                }
                while (balance >= 20) {
                    balance -= 20;
                    cashBanknote20++;
                }

                banknote20 -= cashBanknote20;
                banknote50 -= cashBanknote50;
                banknote100 -= cashBanknote100;
                updateBalance();

                System.out.println("Банкомат выдал запрошенную сумму купюрами:");
                System.out.println("Номинало 20: " + cashBanknote20);
                System.out.println("Номинало 50: " + cashBanknote50);
                System.out.println("Номинало 100: " + cashBanknote100);
                return true;

            } else {
                System.out.println("В банкомате есть купюры номиналом 20, 50, 100.");
                System.out.println("Повторите операцию");
                return false;
            }
        } else {
            System.out.println("В банокмате недостаточно средств, или вы ввели 0");
            System.out.println("Максимальная возможная сумма: " + this.balance);
            return false;
        }
    }
    boolean getwithdrawals() {
        boolean result = false;
        int balance;
        while (true) {
            System.out.println("Ввдеите сумму которую хотите снять.");
            balance = new Scanner(System.in).nextInt();
            // проверка хватит ли денег в банкомате.
            if (this.balance > balance) {
                // проверка на соответсвие суммы купюрам банкомата
                if(((balance % 20 == 0) || ((balance - 50) % 20 == 0)) && balance != 0) {
                    break;
                } else {
                    System.out.println("В банкомате есть купюры номиналом 20, 50, 100.");
                    System.out.println("Повторите операцию");
                }
            } else {
                System.out.println("В банокмате недостаточно средств, или вы ввели 0");
                System.out.println("Максимальная возможная сумма: " + this.balance);
                System.out.println("Повторите операцию");
            }
        }
        int cashBanknote100 = 0;
        int cashBanknote50 = 0;
        int cashBanknote20 = 0;
        // выдача купюр по 1
        while (balance >= 100) {
            balance -= 100;
            cashBanknote100++;
        }
        // проверка на числа которые могу привести к ошибке 60, 80.
        while ((balance >= 50) && !(balance < 100 && balance % 20 == 0)) {
            balance -= 50;
            cashBanknote50++;
        }
        while (balance >= 20) {
            balance -= 20;
            cashBanknote20++;
        }
        banknote20 -= cashBanknote20;
        banknote50 -= cashBanknote50;
        banknote100 -= cashBanknote100;
        updateBalance();

        System.out.println("Банкомат выдал запрошенную сумму купюрами:");
        System.out.println("Номинало 20: " + cashBanknote20);
        System.out.println("Номинало 50: " + cashBanknote50);
        System.out.println("Номинало 100: " + cashBanknote100);
        return result = true;
    }
}