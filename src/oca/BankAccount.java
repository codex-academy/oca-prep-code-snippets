package oca;

public class BankAccount {

    private double balance;

    private BankAccount(double balance) {
        this.balance = balance;
    }

    public boolean pay(double amt) {
        balance -= amt;
        if (balance >= 0) {
            return true;
        }
        return false;
    }

    public void recharge(double amt) {
        balance += amt;
    }



    private static BankAccount myAccount;

    public static BankAccount getMyAccount() {
        if (myAccount == null) {
            myAccount = new BankAccount(100);
        }
        return myAccount;
    }


}
