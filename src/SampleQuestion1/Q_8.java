package SampleQuestion1;

import java.util.Scanner;

public class Q_8 {
    public static void main(String[] args) {
        /*
        Soru-8)  Kullanicidan üc basamaklı bir sayı alin.
               Kullanicidan alinan bu sayinin basamaklari toplamini ekranda yazdirin.
                    ipuclari:
                    Matematiksel Islemler konusuna bakalim. Bölme islemi kullanarak sayinin
                    basamaklarini alalim ve toplam adli bir konteynira (Variable) atalim.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 3 basamakli sayi giriniz ");
        int sayi = scan.nextInt();

        int birlerBasamagi=0;
        int toplam = 0;
         //123
        birlerBasamagi = sayi % 10; // 3
        toplam += birlerBasamagi;   //
        sayi= sayi / 10;  //

        birlerBasamagi = sayi % 10;
        toplam += birlerBasamagi;
        sayi = sayi / 10;

        toplam+=sayi;

        System.out.println(toplam);




    }
}
