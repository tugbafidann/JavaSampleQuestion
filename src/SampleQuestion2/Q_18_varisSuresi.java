package SampleQuestion2;

import java.util.Scanner;

public class Q_18_varisSuresi {
    public static void main(String[] args) {
        // Soru 18-) Girilen araç hızı ve yol kilometresinden, gidilen yere varış süresini
        // hesaplayan bir method yazalım. Kullanıcıya hızını ve kilometreyi soralım,
        // bunu methoda gönderelim ve bize varış süremizi hesaplasın
        //İpucu:
        //yol=Hız*zaman
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen km ve saat giriniz : ");
        double yol= scan.nextDouble();
        double hiz= scan.nextDouble();
        System.out.println(varisSuresiHesaplama(yol,hiz));
    }
    public static double varisSuresiHesaplama(double yol,double hiz){
        double varisSuresi=yol/hiz;
        return varisSuresi;
    }
}
