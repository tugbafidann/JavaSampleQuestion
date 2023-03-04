package SampleQuestion1;

import java.util.Scanner;

public class Q_9 {
    public static void main(String[] args) {
        /*
        Soru 9-)  Girilen zamanı saniyeye çeviriniz.
               Örnek: 2 saat 3 dakika 10 saniye ==>	 7390 saniye
         Ipucu:
         Saati alıp saniyeye cevirebilirsiniz.  Kullanıcıdan ayrı ayrı alabilirsiniz veya  kullanıcıdan hepsini
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen saati giriniz : ");
        int saat= scan.nextInt();
        System.out.println("Lutfen dakikayi giriniz : ");
        int dakika= scan.nextInt();
        System.out.println("Lutfen saniye  giriniz : ");
        int saniye= scan.nextInt();
        int saniyeCevirme=((saat*60)+dakika)*60+saniye;
        System.out.println(saniyeCevirme);

    }
}
