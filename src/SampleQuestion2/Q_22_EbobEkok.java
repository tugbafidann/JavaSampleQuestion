package SampleQuestion2;

import java.util.Scanner;

public class Q_22_EbobEkok {
    public static void main(String[] args) {
        // 	//Soru 22-)
        ////Kullanıcıdan 2 tamsayı girmesini isteyin,
        //// ardından GCD (greatest common divisior) ve LCM'yi (least common multiplication)bulun (En Küçük Ortak Kat)
        ////Giriş :
        ////30 ve 40
        ////Beklenen Çıktı:
        ////30 ve 40 için EBOB= 10
        ////30 ve 40 için EKOK= 120
        ////ipucu:
        ////Loopları kullanarak çözebiliriz.
        //// İki sayının EKOK'u sayıların çarpımının
        //// sayıların EBOB'una bölünerek bulunabilir.
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen iki tam sayi giriniz : ");
        int sayi1= scan.nextInt();
        int sayi2= scan.nextInt();
        int ebob=1;
        for (int i = 1; i <=sayi1 && i<=sayi2 ; i++) {
            if(sayi1%i==0 && sayi2%i==0) {
                ebob = i;
            }
        }
        int ekok=(sayi1*sayi2)/ebob;
        System.out.println("Sayilarin EBOB'u : "+ebob);
        System.out.println("Sayilarin EKOK'u : "+ ekok);
    }
}
