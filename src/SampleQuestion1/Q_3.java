package SampleQuestion1;

import java.util.Scanner;

public class Q_3 {
    public static void main(String[] args) {
        /*
        Soru 3-)   SCANNER
           Kullanicidan 5 tane sayi alin,alinan bu sayilarin ortalamasini hesaplayan java kodunu yaziniz.
           Ipuclari:
           * Sayilarin ortalamasi: toplam/5
         */
      Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 5 tane sayi giriniz : ");
       /* int sayi= scan.nextInt();
        int sayi1= scan.nextInt();
        int sayi2= scan.nextInt();
        int sayi3= scan.nextInt();
        int sayi4= scan.nextInt();
        System.out.println("girilen sayilarin ortalamasi : "+
                (sayi+sayi1+sayi2+sayi3+sayi4)/5);

        */

        // for ile
       /* int toplam=0;
        for (int i = 1; i <=5; i++) {
            int sayi= scan.nextInt();
            toplam +=sayi;
        }
        System.out.println("girilen sayiların ortalamasi : "+toplam/5);

        */
        int toplam=0;
        int i=1;
        int sayi=0;
        while (i<=5){
            sayi= scan.nextInt();
            toplam=toplam +sayi;
            i++;
        }
        System.out.println("girilen sayiların ortalamasi : "+toplam/5);







    }
}
