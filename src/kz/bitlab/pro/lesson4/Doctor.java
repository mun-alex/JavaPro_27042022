package kz.bitlab.pro.lesson4;

public class Doctor extends Worker {

    String profession;

    Doctor() {
        System.out.println("I'm doctor");
    }

    public Doctor(String name, String surname, int age, String profession) {
        super(name, surname, age);
        this.profession = profession;
    }

    @Override
    void doWork() {
        System.out.println("doctor is working");
    }

     public void doDiagnos() {
        System.out.println("diagnos");
    }
}
