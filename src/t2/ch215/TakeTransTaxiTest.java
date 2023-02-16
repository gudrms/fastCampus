package t2.ch215;

public class TakeTransTaxiTest {
    public static void main(String[] args) {
        taxi taxi1 = new taxi("잘간다 운수", 10000);

        Student studentE = new Student("Edword", 20000);

        studentE.takeTaxi(taxi1);

        studentE.showInfo();
        taxi1.showTaxiInfo();

    }
}
