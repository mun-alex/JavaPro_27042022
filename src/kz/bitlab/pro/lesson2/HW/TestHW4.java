package kz.bitlab.pro.lesson2.HW;

public class TestHW4 {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Student1Name", "Student1Surname", 10);
        Student student2 = new Student(2, "Student2Name", "Student2Surname", 20);
        Student student3 = new Student(3, "Student3Name", "Student3Surname", 30);
        Student student4 = new Student(4, "Student4Name", "Student4Surname", 40);
        Student student5 = new Student(5, "Student5Name", "Student5Surname", 50);
        Student[] students = new Student[]{student1, student2, student3, student4, student5};
        for (int i = 0; i < students.length; i++) {
            students[i].getStudentData();
        }
    }
}
