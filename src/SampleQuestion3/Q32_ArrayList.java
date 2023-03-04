package SampleQuestion3;

import java.util.Arrays;
import java.util.Scanner;

public class Q32_ArrayList {
    public static void main(String[] args) {
        /*
        Soru 32-)
             Kullanıcıdan alacagınız bilgilerle oluşturdugunuz bir Integer Array
             dizesini Reverse olarak (tersten) yazdırınız.
             İpucu:  int arrReverse[] diye bir array oluşturun ve kullancıya
             oluşturdugunuz arrayi buna tersten assign edin...
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen array'in uzunlugunu giriniz : ");
        int boyut=scan.nextInt();
        System.out.println("Lutfen array'in elemanlarını giriniz : ");
        int[] arr=new int[boyut];
        for (int i = 0; i < arr.length ; i++) {
            int girilenSayi=scan.nextInt();
            arr[(arr.length-1)-i]= girilenSayi;
        }
        System.out.println(Arrays.toString(arr));


    }
}
