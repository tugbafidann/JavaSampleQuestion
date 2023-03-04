package SampleQuestion3;

import java.util.Arrays;
import java.util.Scanner;

public class Q33_StringiArrayOlarakTerstenYazdir {
    public static void main(String[] args) {
        /*
    Soru 33-)
       Array kullanarak String bir cümleyi Reverse eden (tersine çeviren)
        bir Java programı yazın (boşluklar ve özel karakterler dahil).
       Örnek:
       String str=''Kodlama harika.''
       String arr[]: ".etaerg si gnidoC"
       İpucu: Önce Split kullanarak Arraye çevirin ardından Loop kullanarak
       son karakterden başlayıp tersten yazdırın
         */
        String str="Kodlama harika.";
        String[] arr=str.split("");
        System.out.println(Arrays.toString(arr));
        String[] tersArr=new String[arr.length];
        for (int i = arr.length-1; i <0 ; i++) {
            tersArr[i]=arr[i];


        }
        System.out.println(Arrays.toString(tersArr));






    }
}
