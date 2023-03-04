package SampleQuestion1;

import java.util.Scanner;

public class Q_16 {
    public static void main(String[] args) {
       /* Soru 16-)  Kullanıcıdan en az 5 harfli bir kelime alın. Alınan kelimenin
       son 3 harfinin 2 kopyasından oluşan yeni bir String oluşturun ve konsolda yazdırın
        Kullanicidan alinan isim uzunluğu en az 5 değilse yeni bir kelime  girmesini isteyin.
        Ipucu:  For/While/Do Loops konularını ve String Manipulation konularını hatırlayalım!
                Loopun içerisinde StringM methodlarından  yararlanalım!
                        */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen en az 5 harfli bir kelime giriniz  :");
        String kelime= scan.nextLine();
        while (kelime.length()<5){
            System.out.println("Lutfen yeni kelime giriniz");
            kelime=scan.nextLine();
        }
        String kelimeKopya=kelime.substring(kelime.length()-3);
        System.out.println("Yeni Kelime : "+kelimeKopya+kelimeKopya);


    }
}
