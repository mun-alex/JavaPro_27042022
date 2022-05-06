package kz.bitlab.pro.lesson4;

public class Worker {
    String name;
    String surname;
    int age;

    Worker () {
        System.out.println("I'm worker");
    }

    public Worker(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    void doWork() {
        System.out.println("I'm working");
    }
}
