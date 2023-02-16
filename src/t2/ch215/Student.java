package t2.ch215;

public class Student {

    String name;
    int money;

    public Student(String name, int money){
        this.name = name;
        this.money = money;
    }

    public void takeTaxi(taxi taxi) {
        taxi.income(110000);
        this.money -= 10000;
    }

    public void showInfo(){
        System.out.println(name+"님의 남은 돈은"+money+"원 입니다");
    }

}
