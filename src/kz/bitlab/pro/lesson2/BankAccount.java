package kz.bitlab.pro.lesson2;

public class BankAccount {
    private String iban;
    private int balance;

    int getBalance() {
//        System.out.println("Your balance is " + balance);
        return balance;
    }

    public void setIban(String iban) {
        if (iban.length() == 30 ) {
            this.iban = iban;
        } else System.out.println("error");
    }

    public String getIban() {
        return iban;
    }
}
