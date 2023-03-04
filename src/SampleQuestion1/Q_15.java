package SampleQuestion1;

import java.util.Scanner;

public class Q_15 {
    public static void main(String[] args) {
        /*
        Soru 15-)
        Kullanıcıdan 2 isim/kelime alın: isim1 ve isim2
                -> isim1 çift sayıda karaktere sahipse, ikinci kelimeyi ilk kelimenin ortasına ekleyin
                -> ilk sözcükte tek sayılar varsa,  'isim2, isim1'e eklenemez" ifadesini yazdırın.
        Ipucu: If Else ve String Manipulation konusunu hatırlayalım!  Substring,concat,lengt...
        Örn:
        isim1= masa
        isim2= ali
        Konsol => maalisa

         */
        Scanner scan=new Scanner(System.in);
        System.out.println("1. isimi giriniz : ");
        String isim = scan.nextLine();
        System.out.println("2. isimi giriniz : ");
        String isim1= scan.nextLine();
       // String isimBas="";
      //  String isimKalan="";
        int isimOrt=0;
        if((isim.length())%2==0){
            isimOrt=(isim.length())/2;
            // System.out.println(isimOrt);
            //isimBas = isim.substring(0,isimOrt);
           // isimKalan=isim.substring(isimOrt);
           //System.out.println(isimBas+isim1+isimKalan);
            System.out.println(isim.substring(0,isimOrt)+isim1+(isim.substring(isimOrt)));
        }else {
            System.out.println("isim2, isim1'e eklenemez");
        }


    }
}
