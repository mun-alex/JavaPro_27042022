package kz.bitlab.pro.lesson4.cw;

public class Ex1 {
    public static void main(String[] args) {
        System.out.println();
        Car car = new Car();
        car.name = "BMW";
        car.model = "525";
        car.maxSpeed = 280;
        car.year = 2022;
        car.volume = 2.5;
        car.ride();

        Toyota toyota = new Toyota();
        toyota.ride();
    }
}

class Car {
    String name;

    String model;

    int maxSpeed;

    int year;

    double volume;

    public Car() {

    }

    public Car(String model, int maxSpeed, int year, double volume) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.year = year;
        this.volume = volume;
    }

    void ride() {
        System.out.println("Model: " + model + ", MaxSpeed: " + maxSpeed + ", Year: " + year + ", Volume: " + volume);
        System.out.println("Car is riding");
    }
}

class Toyota extends Car {
    String manufacturer; // Japan, Europe, USA, United Arabian Emirates

    void ride() {
        System.out.println("Model: " + model + ", MaxSpeed: " + maxSpeed + ", Year: " + year + ", Volume: " + volume);

        System.out.println("Class Toyota");
    }
}

class Mercedes extends Car {
    String classType; // E Class, S Class, M Class …

    void ride() {
        System.out.println("Class Mercedes");
    }
}
