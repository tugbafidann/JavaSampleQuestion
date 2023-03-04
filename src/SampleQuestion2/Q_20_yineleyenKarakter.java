package SampleQuestion2;

import java.util.Scanner;

public class Q_20_yineleyenKarakter {
    public static void main(String[] args) {
        //Soru 20-) Kullanıcıdan bir isim yazmasını isteyin, İsim uzunluğu 3 olmalıdır.
        // Daha sonra ismin aynı karakterlere sahip olup olmadığını kontrol edin.
        //Dize aynı karakterlere sahipse:  "Dizede yinelenen karakterler var" ;
        // aynı karakterlere sahip degilse  "String benzersiz karakterlere sahip"
        //yazdırın. İsim 3 karakterden uzunsa "Bu kadar uzun cümleyi anlayamam ben agam" yazdırın.
        //  Örnek:
        //     giriş: ama
        //	   çıkış: Dizede yinelenen karakterler var
        //  İpucu: İf Else ve Char kullanarak çözebiliriz.
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 3 karakterli bir kelime giriniz : ");
        String girilenKarakter= scan.next();
        if (girilenKarakter.length()>3){
            System.out.println("Bu kadar uzun cümleyi anlayamam ben agam");
        }if (girilenKarakter.charAt(0)==girilenKarakter.charAt(1) ||
                girilenKarakter.charAt(2)==girilenKarakter.charAt(0)||
                girilenKarakter.charAt(1)==girilenKarakter.charAt(2)){
            System.out.println("Dizede yinelenen karakterler var");
        }else System.out.println("String benzersiz karakterlere sahip");
    }
}
