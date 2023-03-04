package SampleQuestion2;

import java.util.Scanner;

public class Q_28_SayiTerstenYazdir {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Bir sayi giriniz: ");
        int sayi = scan.nextInt();

        System.out.print("Girdiğiniz sayinin tersten yazılısı = ");
        while (sayi > 0) {

            System.out.print(sayi % 10);
            sayi /= 10;
        }
    }
}
