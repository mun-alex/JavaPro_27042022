package kz.bitlab.pro.lesson6;

public class TestCW {
    public static void main(String[] args) {
        AbleToSwim person = new Person("John", "Smith");
        AbleToSwim ship = new Ship("Titanic", 150);

        AbleToSwim[] items = new AbleToSwim[]{person, ship};
        for (AbleToSwim x : items) {
            x.swim();
        }

        Person person1 = new Person("Sarah", "Connor");
        person1.swim();
        person1.think();
    }
}

interface AbleToSwim {
    void swim();
}

interface AbleToThink {
    void think();
}

class Person implements AbleToSwim, AbleToThink {
    private String name;
    private String surname;

    public Person() {
    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public void swim() {
        System.out.println("человек плывет с помощью рук");
    }

    @Override
    public void think() {
        System.out.println("человек может думать");
    }
}

class Ship implements AbleToSwim {
    private String model;
    private double length;

    public Ship() {
    }

    public Ship(String model, double length) {
        this.model = model;
        this.length = length;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void swim() {
        System.out.println("корабль плывет с помощью винтов");
    }
}
