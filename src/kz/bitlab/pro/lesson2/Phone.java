package kz.bitlab.pro.lesson2;

public class Phone {
    String name;
    String model;
    int price;

    Phone (){}

    Phone (String name, String model, int price) {
        this.name = name;
        this.model = model;
        this.price = price;
    }

    void getData() {
        System.out.println(name);
        System.out.println(model);
        System.out.println(price);
    }

    public static void main(String[] args) {
        System.out.println("hello");
    }
}
