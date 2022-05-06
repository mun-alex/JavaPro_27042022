package kz.bitlab.pro.lesson3;

import kz.bitlab.pro.lesson2.BankAccount;
import kz.bitlab.pro.lesson2.Customer;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Customer customer = new Customer();
        BankAccount bankAccount = new BankAccount("KZdsd", 43);
        System.out.println(bankAccount.getIban());
    }
}
