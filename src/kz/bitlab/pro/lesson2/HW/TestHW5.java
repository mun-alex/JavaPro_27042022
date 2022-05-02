package kz.bitlab.pro.lesson2.HW;

public class TestHW5 {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Student1Name", "Student1Surname", 10);
        Student student2 = new Student(2, "Student2Name", "Student2Surname", 20);
        Student student3 = new Student(3, "Student3Name", "Student3Surname", 30);
        Student student4 = new Student(4, "Student4Name", "Student4Surname", 40);
        Student student5 = new Student(5, "Student5Name", "Student5Surname", 50);
        Student student6 = new Student(6, "Student6Name", "Student6Surname", 90);
        Student student7 = new Student(7, "Student7Name", "Student7Surname", 60);
        Student student8 = new Student(8, "Student8Name", "Student8Surname", 70);
        Student student9 = new Student(9, "Student9Name", "Student9Surname", 800);
        Student student10 = new Student(10, "Student10Name", "Student10Surname", 05);
        Student[] students = new Student[]{
                student1,
                student2,
                student3,
                student4,
                student5,
                student6,
                student7,
                student8,
                student9,
                student10};
        Student bestStudent = topStudent(students);
        System.out.println(bestStudent.id + " "
                + bestStudent.name + " "
                + bestStudent.surname + " "
                + bestStudent.gpa);
    }
    static Student topStudent(Student[] students) {
        Student bestStudent = new Student();
        bestStudent.gpa = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i].gpa > bestStudent.gpa) bestStudent = students[i];
        }
        return bestStudent;
    }
}
