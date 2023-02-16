package t2.ch204;

public class StudentTest {
    public static void main(String[] args) {

        Student studentLee = new Student();

        studentLee.studentId = 12345;
        studentLee.setStudentName("Lee");
        studentLee.address = "서울 강남구";

        studentLee.showStudentInfo();

        Student studentKim = new Student();
        studentLee.studentId = 54321;
        studentLee.setStudentName("Kim");
        studentLee.address = "경기도 성남시";

        studentKim.showStudentInfo();
        System.out.println(studentKim);
        System.out.println(studentLee);


    }
}
