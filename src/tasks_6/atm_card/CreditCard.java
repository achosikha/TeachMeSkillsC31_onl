package tasks_6.atm_card;

import java.util.Random;

public class CreditCard {
    String accountNumber;
    int accountMoney;

    public CreditCard(String accountNumber, int accountMoney) {
        this.accountNumber = accountNumber;
        this.accountMoney = accountMoney;
    }

    public void addMoney(int money) {
        this.accountMoney += money;
    }

    public void withdrawalMoney(int money) {
        this.accountMoney += money;
    }

    public void printInfo() {
        System.out.println("Your account number: " + accountNumber + ". How money to account: " + accountMoney);
    }
}
