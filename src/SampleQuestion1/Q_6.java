package SampleQuestion1;

import java.util.Scanner;

public class Q_6 {
    public static void main(String[] args) {
        /*
        Soru 6-)  Kullanıcıya günde ne kadar çay içtiğini ve ne kadar şeker kullandığını sorun.
            Yılda kaç çay içtigini ve kaç kg şeker kullandığını hesaplayın ve bunları ekranda yazdırın.
            1 şeker = 1.5 gr
            1 kg = 1000 gram      olarak hesaplayınç
         */
     Scanner scan=new Scanner(System.in);
     System.out.println("Günde kac bardak cay ictiginizi giriniz : ");
     double cay= scan.nextDouble();
     System.out.println("Bir bardak cay icin kac seker kullandiginizi giriniz : ");
     double seker= scan.nextDouble();
     double yillikSekerTuketimi=((cay*seker)*1.5*365)/1000;
     double yillikCayTuketimi=cay*365;
        System.out.println("Yililk cay tuketimi : "+yillikCayTuketimi+
                "\nYillik seker tuketimi : "+yillikSekerTuketimi);


    }
}
