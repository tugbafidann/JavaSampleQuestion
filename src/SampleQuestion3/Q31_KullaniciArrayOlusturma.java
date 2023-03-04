package SampleQuestion3;

import java.util.Arrays;
import java.util.Scanner;

public class Q31_KullaniciArrayOlusturma {
    public static void main(String[] args) {
        /*Soru 31-)
Kullanıcıdan Arrayin uzunlugunu isteyin.
Ardından kullanıcıdan Arrayin elemanlarını girmesini isteyin.
İpucu:  Önce uzunluk alıp arrayi oluştur daha sonra loop ile kullancııya doldurt*/

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen olusturmak istediginiz bir arrayin uzunlugunu giriniz");
        int boyut= scan.nextInt();
        String[] arrstr=new String[boyut];


        System.out.println("lutfen eleman girin");
        for (int i = 0; i <boyut; i++) {


            arrstr[i]=scan.next();



        }
        System.out.println(Arrays.toString(arrstr));
    }
}
