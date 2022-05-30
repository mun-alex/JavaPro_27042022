package kz.bitlab.pro.lesson11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestLambda {
    public static void main(String[] args) {
        Student st1 = new Student("Azamat", 20, 85);
        Student st2 = new Student("Batyrhan", 19, 95);
        Student st3 = new Student("Zarina", 18, 90);
        Student st4 = new Student("Aidar", 25, 75);
        Student st5 = new Student("Rahat", 22, 70);
        Student st6 = new Student("Shyryn", 17, 80);
        Student st7 = new Student("Azamat", 20, 87);

        List<Student> studentList = new ArrayList<>(Arrays.asList(
                st1, st2, st3, st4, st5, st6, st7
        ));

//        for(Student student: studentList) {
//            if (studentAgeFilter(student)) System.out.println(student.toString());
//        }
//        for(Student student: studentList) {
//            if (studentGradeFilter(student)) System.out.println(student.toString());
//        }

//        StudentFilter ageFilter = new StudentAgeFilter();
//        StudentFilter gradeFilter = new StudentGradeFilter();

//        for(Student student: studentList) {
//            if (ageFilter.filter(student)) System.out.println(student.toString());
//        }
//        System.out.println("---------------------------");
//        for(Student student: studentList) {
//            if (gradeFilter.filter(student)) System.out.println(student.toString());
//        }

        StudentFilter stFilter = (student) -> student.getAge() > 18;
        StudentFilter stFilterGrade = (student) -> student.getGrade() > 75;

        for (Student student: studentList) {
            if (stFilter.filter(student)) System.out.println(student.toString());
        }

        System.out.println("=======================");
        studentList.stream()
                .filter(student -> student.getAge() > 18 && student.getGrade() > 80)
                .map(student -> student.getName().toUpperCase())
                .distinct()
                .forEach(student -> System.out.println(student));
    }

//    public static boolean studentAgeFilter(Student student) {
//        return student.getAge() > 18;
//    }
//
//    public static boolean studentGradeFilter(Student student) {
//        return student.getGrade() > 80;
//    }
}

class Student {
    private String name;
    private int age;
    private double grade;

    public Student() {
    }

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                '}';
    }
}

interface StudentFilter {
    boolean filter(Student student);
}

//class StudentAgeFilter implements StudentFilter {
//    @Override
//    public boolean filter(Student student) {
//        return student.getAge() > 18;
//    }
//}
//
//class StudentGradeFilter implements StudentFilter {
//    @Override
//    public boolean filter(Student student) {
//        return student.getGrade() > 80;
//    }
//}
