package kz.bitlab.pro.lesson2;

public class Customer {
    String name;
    String surname;
    BankAccount bankAccount;
    Phone phone;

    Customer () {
        System.out.println("i'm constructor");
    }

    Customer (String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    /**
     * putMoneyToTheCount - метод для внесения средств на счет клиента
     */
    void putMoneyToTheCount(int money) {
        bankAccount.balance += money;
        System.out.println("success put");
    }

    void takeMoneyFromTheCount(int money) {
        if (bankAccount.balance < money) {
            System.out.println("sorry, you have not enough money!");
        } else {
            bankAccount.balance -= money;
            System.out.println("succes take");
        }
    }
}
