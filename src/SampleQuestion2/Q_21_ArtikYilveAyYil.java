package SampleQuestion2;

import java.util.Scanner;

public class Q_21_ArtikYilveAyYil {
    public static void main(String[] args) {
        /* Soru 21-)
Bir aydaki gün sayısını bulmak için bir Java programı yazın
(Mülakat Sorusu / Interview Sorusu / Leak Year)

Örnek:
Bir ay numarası girin: 2
Bir yıl girin: 2016
Şubat 2016'da 29 gün vardır
ipucu:
Switch Case kullanarak çözebiliriz. Şubat ayı senelere göre farklılık gösterir.
Bunu çözmek için Şubat ayı için method kullanmamız gerekiyor!
Artık yıl ile ilgili olarak NOT düşeyim değerli arkadaşlar!
ipucu2:
ARTIK YILI BULABİLMENİZ İÇİN İKİ KOŞULU GÖZ ÖNÜNDE BULUNDURUN!:
1-) Bir yılın son iki rakamı "00" değilse ve bu sayı 4 e tam bölünebiliyorsa bu yıl artık yıldır.
Mesela 2008 yılı artık yıldır. Son iki rakamı "00" değildir ve 4 e bölünebilen bir sayıdır.
2-) Bir yılın son iki rakamı "00" ise ve bu sayı 400 e tam bölünüyorsa, yine bu yıl yine artık yıldır.
Mesela 2000 yılı artık yıldır.Son iki rakamı "00" ve 400 e bölünebilen bir sayıdır.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir ay numarasi giriniz : ");
        int ay= scan.nextInt();
        System.out.println("Bir yil girin : ");
        int yil= scan.nextInt();
        switch (ay){
            case 1:
                System.out.println("Ocak "+yil+" 'da 31 gun vardir");
                break;
            case 2:
                artikYilHesaplama(yil);
                break;
            case 3:
                System.out.println("Mart "+yil+" 'da 31 gun vardir");
                break;
            case 4:
                System.out.println("Nisan "+yil+" 'da 30 gun vardir");
                break;
            case 5:
                System.out.println("Mayis "+yil+" 'da 31 gun vardir");
                break;
            case 6:
                System.out.println("Haziran "+yil+" 'da 30 gun vardir");
                break;
            case 7:
                System.out.println("Temmuz "+yil+" 'da 31 gun vardir");
                break;
            case 8:
                System.out.println("Agustos "+yil+" 'da 31 gun vardir");
                break;
            case 9:
                System.out.println("Eylul "+yil+" 'da 30 gun vardir");
                break;
            case 10:
                System.out.println("Ekim "+yil+" 'da 31 gun vardir");
                break;
            case 11:
                System.out.println("Kasim "+yil+" 'da 30 gun vardir");
                break;
            case 12:
                System.out.println("Aralik "+yil+" 'da 31 gun vardir");
                break;
            default:
                System.out.println("Gecersiz giris!!!!");
        }
    }
    public static int artikYilHesaplama(int yil){
        int artikYil=0;
        if (yil%100!=0 && yil%4==0) System.out.println("Şubat "+yil+" ' da 29 gun vardir");
        else if (yil%100==0 && yil% 400==0){
            System.out.println("Şubat "+yil+" ' da 29 gun vardir");
        }
        else{
            System.out.println("Şubat "+yil+" ' da 28 gun vardir");
        }
        return artikYil;
    }
}
