package kz.bitlab.pro.lesson4.hw;

import java.util.Arrays;

public class Test5HW {
    public static void main(String[] args) {
        Staff staff1 = new Staff(1, "loginStaff1", "pass", "Staff1", "Staff1Surname", 5000);
        staff1.addSubject("History");
        staff1.addSubject("Math");
        staff1.getData();
    }
}

class User {
    protected int id;
    protected String login;
    protected String password;
    protected String name;
    protected String surname;

    public User() {
    }

    public User(int id, String login, String password, String name, String surname) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.name = name;
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void getData() {
        System.out.println(
                id + " " +
                login + " " +
                password + " " +
                name + " " +
                surname);
    }
}

class Staff extends User {
    private double salary;
    private String subjects[] = new String[100];
    private int indexOfSubject = 0;

    public Staff() {
    }

    public Staff(int id, String login, String password, String name, String surname, double salary) {
        super(id, login, password, name, surname);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public int getIndexOfSubject() {
        return indexOfSubject;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void addSubject(String subject) {
        subjects[indexOfSubject] = subject;
        indexOfSubject++;
    }

    @Override
    public void getData() {
        super.getData();
        System.out.println(
                salary + " " +
                Arrays.toString(subjects));
    }
}

class Student extends User {
    private double jpa;
    private String courses[] = new String[100];
    private int indexOfCourses = 0;

    public Student() {
    }

    public Student(int id, String login, String password, String name, String surname, double jpa, int indexOfCourses) {
        super(id, login, password, name, surname);
        this.jpa = jpa;
        this.indexOfCourses = indexOfCourses;
    }

    public double getJpa() {
        return jpa;
    }

    public int getIndexOfCourses() {
        return indexOfCourses;
    }

    public void setJpa(double jpa) {
        this.jpa = jpa;
    }

    void addCourse(String course) {
        courses[indexOfCourses] = course;
        indexOfCourses++;
    }

    @Override
    public void getData() {
        super.getData();
        System.out.println(
                jpa + " " + Arrays.toString(courses));
    }
}
