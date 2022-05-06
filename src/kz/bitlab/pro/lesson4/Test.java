package kz.bitlab.pro.lesson4;

public class Test {
    public static void main(String[] args) {

        Worker doctor = new Doctor();
        Worker driver = new Driver();
        Doctor doctor1 = new Doctor();
        doctor.doWork();
        driver.doWork();
    }
}
