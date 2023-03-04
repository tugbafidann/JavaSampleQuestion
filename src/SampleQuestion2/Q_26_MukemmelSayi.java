package SampleQuestion2;

import java.util.Scanner;

public class Q_26_MukemmelSayi {
    public static void main(String[] args) {
        /*
           Soru 26-)
Sayının Mükemmel sayı olup olmadığını kontrol eden kodu yazalım.
NOT:  Kendisi hariç, pozitif bölenlerinin toplamı o sayıya eşitse, bu tür sayılar Mükemmel Sayı olabilir.
Örnek:
Giriş :6
Çıkış: 6 Mükemmel Sayıdır
Giriş :7
Çıkış:7 Mükemmel Sayı Değildir
ipucu: For Loop kullanarak ve belki biraz da if else yardımı ile bu soruyu çözebilirsiniz
       */
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayi giriniz : ");
        int sayi= scan.nextInt();
        int toplam=0;
        for (int i = 1; i <sayi ; i++) {
            if ((sayi % i == 0)) {
                toplam += i;
            }
        }
            if(sayi==toplam){
                System.out.println("Mükemmel Sayidir");
            }else System.out.println("Mukemmel sayi degildir");

    }
}
