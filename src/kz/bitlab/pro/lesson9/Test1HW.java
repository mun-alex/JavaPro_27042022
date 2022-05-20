package kz.bitlab.pro.lesson9;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Test1HW {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        User[] users = new User[5];

        for (int i = 0; i < users.length; i++) {
            users[i] = new User();
            System.out.println("Insert name");
            users[i].setName(in.next());
            System.out.println("Insert surname");
            users[i].setSurname(in.next());
            System.out.println("Insert age");

            if (!in.hasNextInt()) {
                try {
                    throw new IOException();
                } catch (IOException e) {
                    users[i].setAge(0);
                    in.next();
                }
            } else users[i].setAge(in.nextInt());
        }

        for (User user: users) {
            System.out.println(user.toString());
        }
    }
}

class User {
    private String name;
    private String surname;
    private int age;

    public User() {
    }

    public User(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
