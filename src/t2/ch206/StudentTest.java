package t2.ch206;

import t2.ch206.Student;

public class StudentTest {
    public static void main(String[] args) {

        Student studentLee = new Student();
        studentLee.grade = 1;

        System.out.println(studentLee.showStudentInfo());

        Student studentKim = new Student(12345, "Kim",3);
        studentKim.showStudentInfo();
    }
}
