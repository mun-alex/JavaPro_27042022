package kz.bitlab.pro.lesson2.azamat;

import kz.bitlab.pro.lesson3.HW.Test2HW;

import java.util.Scanner;

public class Test6 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        Student[] students = new Student[10];
        students[0] = new Student("Aza","sasd",3.4);
        students[1] = new Student("Aza","sasd",3.4);
        students[2] = new Student("Aza","sasd",3.4);
        students[3] = new Student("Aza","sasd",3.4);
        Test6 main = new Test6();
        int maxIndex = 0;
        for(int i = 0;i<students.length;i++){
            if(students[i]!=null){
                maxIndex = i;
            }
        }
        System.out.println("PLease choose one of these:"+"\n"+"1) Add a student"+"\n"+"2) List of student"+"\n"+"0) Exit");
        int n = in.nextInt();
        switch (n){
            case 0:
                System.out.println("END of program");break;
            case 1: main.AddStudent(students,maxIndex);break;
            case 2:main.listStudents(students,maxIndex);break;
            default:
                System.out.println("ERROR");break;
        }


    }
    void AddStudent(Student[] students,int maxIndex){
        for(int i = 0;i<students.length;i++){
            if(students[i]!=null){
                maxIndex = i;
            }
        }
        System.out.println("Input name");
        String name = in.next();
        System.out.println("Input surname");
        String surname = in.next();
        System.out.println("Input gpa");
        double gpa = in.nextDouble();
        students[1+maxIndex] = new Student(name,surname,gpa);
        System.out.println("If you want to see list of students input (2)");
        int n = in.nextInt();
        if(n==2){
            Test6 main = new Test6();
            main.listStudents(students,maxIndex);
        }
        else System.out.println("GOOD BYE!");
    }
    void listStudents(Student[] students,int max){
        for(int i = 0;i<students.length;i++){
            if(students[i]!=null){
                max = i;
            }
        }
        for(int i = 0;i<students.length;i++){
            if(students[i]!=null){
                System.out.print(i+1+" ");
                students[i].list();
            }
        }
        System.out.println("If you want to see list of students input (1)");
        int n = in.nextInt();
        if(n==1){
            AddStudent(students,max);
        }
        else System.out.println("GOOD BYE!");
        listStudents(students,max);
    }
}

class Student {
    String name;
    String surname;
    double gpa;
    public Student(String name,String surname,double gpa){
        this.name = name;
        this.surname = surname;
        this.gpa = gpa;
    }
    public void list(){
        System.out.println(name+" "+ surname+" "+gpa);
    }
}
