package kz.bitlab.pro.lesson2;

import kz.bitlab.pro.lesson2.HW.Phone;

public class TestCW {
    public static void main(String[] args) {
        Customer azamat = new Customer();
        azamat.setName("7");
        System.out.println(azamat.getName());
        azamat.bankAccount = new BankAccount();
        azamat.bankAccount.setIban("KZ1234567890123456785455");
        System.out.println(azamat.bankAccount.getIban());






//        azamat.name = "Azamat";
//        azamat.surname = "Bagdat";
//        azamat.age = -5;
//        azamat.phone = new Phone("Nokia", "3310", 5000);
//        System.out.println("Azamat's phone");
//        azamat.phone.getData();
//
//        Customer shyryn = new Customer("Shyryn", "Akan");
//        shyryn.phone = new Phone("Samsung", "S21", 120000);
//        System.out.println("Shyryn's phone");
//        shyryn.phone.getData();
//
//        azamat.bankAccount = new BankAccount();
//        azamat.bankAccount.iban = "KZ1214566768";
//        azamat.bankAccount.balance = 1000;
//
//        azamat.putMoneyToTheCount(250);
//        System.out.println(azamat.bankAccount.getBalance());
//        azamat.takeMoneyFromTheCount(2000);
//
//        System.out.println(azamat.name + " " + azamat.surname);
//        System.out.println(azamat.bankAccount.iban);
//        System.out.println(azamat.bankAccount.getBalance());
//
//        Phone iphone = new Phone("iPhone", "12", 1_000_000);
//        iphone.getData();
    }
}
