package kz.bitlab.pro.lesson6;

public class Students {
    private String name;
    private int year;

    public Students() {
    }

    public Students(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

class StudentsImp implements UserBean {
    private Students[] students;

    public StudentsImp(Students[] students) {
        this.students = students;
    }

    public StudentsImp() {
    }

    public Students[] getStudents() {
        return students;
    }

    public void setStudents(Students[] students) {
        this.students = students;
    }

    @Override
    public void getAllUsers() {
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
    }

    @Override
    public void getUsersByName(String name) {

    }

    @Override
    public void getUsersBySurname(String surname) {

    }
}
