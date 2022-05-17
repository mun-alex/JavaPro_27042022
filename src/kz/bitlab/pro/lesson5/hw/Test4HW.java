package kz.bitlab.pro.lesson5.hw;

import java.util.Arrays;
import java.util.Scanner;

public class Test4HW {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("PRESS[1] TO ADD USER");
        System.out.println("PRESS[2] TO LIST USERS");
        System.out.println("PRESS[3] TO LIST USER BY INDEX");
        int command = in.nextInt();

        switch (command) {
            case 1:
                System.out.println("PRESS[1] TO ADD STUDENT");
                System.out.println("PRESS[2] TO ADD TEACHER");
                
        }
    }
}

abstract class User {
    protected int id;
    protected String login;
    protected String password;

    abstract String getUserData();

    public User() {
    }

    public User(int id, String login, String password) {
        this.id = id;
        this.login = login;
        this.password = password;
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

    public void setId(int id) {
        this.id = id;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

class Student extends User {
    private String name;
    private String surname;
    private String group;
    private double gpa;

    public Student() {
    }

    public Student(int id, String login, String password, String name, String surname, String group, double gpa) {
        super(id, login, password);
        this.name = name;
        this.surname = surname;
        this.group = group;
        this.gpa = gpa;
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

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    String getUserData() {
       return "id: " + id +
               "login: + " + login +
               "password: " + password +
                "name: " + name +
               "surname: " + surname +
               "group: " + group +
               "gpa: " + gpa;
    }
}

class Teacher extends User {
    private String nickName;
    private String status;
    private String subjects[] = new String[10];
    private int sizeOfObjects = 0;

    public Teacher() {
    }

    public Teacher(int id, String login, String password, String nickName, String status) {
        super(id, login, password);
        this.nickName = nickName;
        this.status = status;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String[] getSubjects() {
        return subjects;
    }

    public int getSizeOfObjects() {
        return sizeOfObjects;
    }

    public void addSubject(String subject) {
        subjects[sizeOfObjects++] = subject;
    }

    @Override
    String getUserData() {
        return  "id: " + id +
                "login: + " + login +
                "password: " + password +
                "nick name: " + nickName +
                "status: " + status +
                "subjects: " + Arrays.toString(subjects);
    }
}

class ERPSystem {
    private User[] memory = new User[1000];
    private int sizeOfUsers = 0;

    public void addUser(User u) {
        memory[sizeOfUsers++] = u;
    }

    public void printAllUsers() {
        for(User x : memory) {
            System.out.println(x.getUserData());
        }
    }

    public void printUser(int index) {
        if(memory[index] != null) System.out.println(memory[index].getUserData());
        else System.out.println("No such user in this index");
    }
}
