package t1.ch10;

public class TypeConversionTest {
    public static void main(String[] args) {

        //byte bNum = 125;
        int iNum = 255;
        byte bNum = (byte) iNum;

        System.out.println(bNum);

        double dNum = 3.14;
        int inum = (int)dNum;

        System.out.println(inum);

        double dNum1 = 1.2;
        float fNum = 0.9F;

        int iNum1 = (int)dNum1 + (int)fNum;
        int iNum2 = (int)(dNum1+ fNum);

        System.out.println(iNum1);
        System.out.println(iNum2);

        int myNum = 10;
        int yourNum = 20;

        myNum = myNum + yourNum;
        System.out.println(myNum);







































































































































































































































    }
}