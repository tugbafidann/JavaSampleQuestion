package SampleQuestion1;

import java.util.Scanner;

public class Q_5 {
    public static void main(String[] args) {
        /*
        Soru 5-)   SCANNER
           Kullanıcıdan karenin kenar uzunluğunu alın. Aldiginiz uzunluklarla
           karenin alanını ve çevresini hesaplayan kodu yazın.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println(("Karenin kenar uzunlugunu giriniz : "));
        double kenar= scan.nextDouble();
        System.out.println("Karenin Cevresi  :"+(4*kenar));
        System.out.println("Karenin Alani : "+(kenar*kenar));

    }
}
