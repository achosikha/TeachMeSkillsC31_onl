package lesson_15.genericsbasic;

public class GenericsBase {
    private final int bankAccount;
    private final Object allTypesBankAccount;

    public GenericsBase(int bankAccount, Object allTypesBankAccount){
        this.bankAccount = bankAccount;
        this.allTypesBankAccount = allTypesBankAccount;
    }

    public Object getAllTypesBankAccount() {
        return allTypesBankAccount;
    }

    public int getBankAccount() {
        return bankAccount;
    }

    @Override
    public String toString() {
        return "GenericsBase{" +
                "bankAccount=" + bankAccount +
                ", allTypesBankAccount=" + allTypesBankAccount +
                '}';
    }
}
