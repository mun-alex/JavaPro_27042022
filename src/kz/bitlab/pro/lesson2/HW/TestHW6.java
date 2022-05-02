package kz.bitlab.pro.lesson2.HW;

import java.util.Scanner;

public class TestHW6 {
    public static void main(String[] args) {
        //1-add, 2-list, 3-exit
        Student[] students = new Student[10];

        students[0] = new Student(1, "Rahat", "Seitkanov", 40);
        students[1] = new Student(2, "Zarina", "Dosmailova", 50);

        Student newStudent = new Student();
        Scanner in = new Scanner(System.in);

        System.out.println("insert command");
        System.out.println("1 - add new student");
        System.out.println("2 - list students");
        System.out.println("0 - exit");

        int command = in.nextInt();
        switch (command) {
            case 1:
                System.out.println("insert name");
                newStudent.name = in.next();
                System.out.println("insert surname");
                newStudent.surname = in.next();
                System.out.println("insert gpa");
                newStudent.gpa = in.nextDouble();
                for (int i = 0; i < students.length; i++) {
                    if (students[i] == null) {
                        newStudent.id = i + 1;
                        students[i] = newStudent;
                        break;
                    }
                }
                break;
            case 2:
                for (int i = 0; i < students.length; i++) {
                    if (students[i] == null) {
                        break;
                    }
                    System.out.println(students[i].getStudentData());
                }
                break;
            case 0: break;
        }
    }
}
