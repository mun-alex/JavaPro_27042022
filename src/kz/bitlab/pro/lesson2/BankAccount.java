package kz.bitlab.pro.lesson2;

public class BankAccount {
    private String iban;
    private int balance;
    public BankAccount() {}

    public BankAccount(String iban, int balance) {
        this.iban = iban;
        this.balance = balance;
    }

    public void setIban(String iban) {
        if (iban.length() == 20 ) {
            this.iban = iban;
        } else System.out.println("error");
    }

    public String getIban() {
        return iban;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    int getBalance() {
        System.out.println("Your balance is " + balance);
        return balance;
    }
}
