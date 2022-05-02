package kz.bitlab.pro.lesson2.HW;

public class Student {
    int id;
    String name;
    String surname;
    double gpa;

    Student() {}

    Student(int id, String name, String surname, double gpa) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.gpa = gpa;
    }

    String getStudentData() {
        return id + " " + name + " " + surname + " " + gpa;
    }
}
