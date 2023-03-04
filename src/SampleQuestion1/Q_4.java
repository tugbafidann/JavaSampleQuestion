package SampleQuestion1;

import java.util.Scanner;

public class Q_4 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan bir sayı alın ve aldiginiz bu sayının küpünün yarısını konsola yazdırin.
             Ipuclari:
             * Sayinin küpü: sayi*sayi*sayi
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz : ");
        int sayi=scan.nextInt();
        System.out.println("Sayinin küpünün yarisi : "+(sayi*sayi*sayi)/2);

        int carpim=1;
        for (int i = 1; i <=15 ; i++) {
            carpim=carpim*sayi;
        }
        System.out.println("Sayilarin carpimi : "+carpim);
    }
}
