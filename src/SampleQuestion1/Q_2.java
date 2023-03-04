package SampleQuestion1;

import java.util.Scanner;

public class Q_2 {
    public static void main(String[] args) {
        /*
        Soru-2)   SOUT/SYSO
          Dikdortgenin alanini ve cevresini hesaplayan kodu yaziniz.
          Ipuclari:
                 * Dikdortgenin Cevresi: 2 * (uzun kenar + kisa kenar)
                 * Dikdortgenin Alani : uzun kenar * kisa kenar
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Dikdörtgenin kenarlarını giriniz : ");
        double kenar1=scan.nextDouble();
        double kenar2=scan.nextDouble();
        System.out.println("Dikdörtgenin cevresi : "+2*(kenar1+kenar2));
        System.out.println("Dikdörgenin alani : "+kenar1*kenar2);



    }
}
