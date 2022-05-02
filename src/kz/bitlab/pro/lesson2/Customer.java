package kz.bitlab.pro.lesson2;

import kz.bitlab.pro.lesson2.HW.Phone;

public class Customer {
    private String name;
    private String surname;
    BankAccount bankAccount;
    private int age;
    private Phone phone;

    public Customer () {
        System.out.println("i'm constructor");
    }

    Customer (String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else System.out.println("age is incorrect!");
    }

    /**
     * putMoneyToTheCount - метод для внесения средств на счет клиента
     */
//    void putMoneyToTheCount(int money) {
//        bankAccount.balance += money;
//        System.out.println("success put");
//    }
//
//    void takeMoneyFromTheCount(int money) {
//        if (bankAccount.balance < money) {
//            System.out.println("sorry, you have not enough money!");
//        } else {
//            bankAccount.balance -= money;
//            System.out.println("succes take");
//        }
//    }
}
