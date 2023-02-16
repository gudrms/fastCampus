package t2.ch214;

public class Bus {

    int busNumber;
    int passengerCount;
    int money;

    public Bus(int busNumber){
        this.busNumber = busNumber;

    }

    public void take(int money)
    {
        this.money+=money;
        passengerCount++;
    }

    public void showBusInfo(){
        System.out.println(busNumber+"승객수는"+ passengerCount+"명이고 수입은"+money+"입니다");
    }
}
