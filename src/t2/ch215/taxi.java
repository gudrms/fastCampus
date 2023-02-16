package t2.ch215;

public class taxi {

    String taxiName;
    int income;

    public taxi(String taxiName, int income) {
        this.taxiName = taxiName;
    }

    public void income(int income){
        this.income += income;
    }

    public void showTaxiInfo() {
        System.out.println(taxiName+"의 운수수입은"+income+"원 입니다.");
    }
}
