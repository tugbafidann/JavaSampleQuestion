package SampleQuestion2;

public class Q_23_faktoriyel {
    public static void main(String[] args) {
        /*
        Girdi olarak bir tamsayı kabul eden ve bu tam sayının faktöriyelini hesaplayan bir method yazın.
         Method bize çıktıyı döndürsün.
            Örnek:
            Girdi: 6
            Çıktı: 6!=65432*1=720
            ipucu: Aldıgınız sayıyı methoda gönderin. Methodun içinde For Loop ile faktöriyelini hesaplayın.
         */
        int girilenSayi=6;
        if(girilenSayi<=0)
            System.out.println("Hatali giris.Lutfen tam sayi giriniz");
        else
            System.out.println("Girilen sayinin faktoriyeli : "+faktoriyelHesapla(girilenSayi));
    }
    public static int faktoriyelHesapla(int girilenSayi){
        int carpim=1;

        for (int i = girilenSayi; i >=1 ; i--) {
            carpim*=i;
        }
        return carpim;
    }

}
