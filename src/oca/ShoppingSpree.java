package oca;

public class ShoppingSpree {
    public static void main(String[] args) {

        BankAccount bankAccount = BankAccount.getMyAccount();

        System.out.println(bankAccount.pay(20));
        System.out.println(bankAccount.pay(20));
        System.out.println(bankAccount.pay(80));

        bankAccount.recharge(140);

        BankAccount bankAccount2 = BankAccount.getMyAccount();

        System.out.println(bankAccount2.pay(20));
        System.out.println(bankAccount2.pay(20));
        System.out.println(bankAccount2.pay(80));

    }
}
