package t2.ch214;

public class Subway {

    int lineNumber;
    int passengerCount;
    int money;

    public Subway(int lineNumber){
        this.lineNumber = lineNumber;

    }

    public void take(int money)
    {
        this.money+=money;
        passengerCount++;
    }

    public void showBusInfo(){
        System.out.println(lineNumber+"승객수는"+ passengerCount+"명이고 수입은"+money+"입니다");
    }
}
