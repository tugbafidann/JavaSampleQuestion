package SampleQuestion1;

public class Q_12 {
    public static void main(String[] args) {
        /*Soru 12-)
        Verilen iki sayının toplamını -sıfırdan büyük veya eşit olabilir-
        hesaplamak ve yazdırmak için bir program oluşturalım
        Eğer verilen tamsayıların veya toplamın 10'dan fazla basamağı varsa, "Fazla Yüklenme" yazdıralım

        Ipucu:  IF/Else kullanabilirsiniz.
                Örnek:
        İki tamsayı girin:
        25  veya  4567986321453
        46   veya 123456
        Konsolda Çıktı :
        Sayıların toplamı: 71  veya  Fazla Yüklenme

         */
        double sayi1=4563218987D;
        double sayi2=789546;
        double toplam=sayi1+sayi2;
        if(sayi1>99999999999D|| sayi2>99999999999D || toplam>99999999999D){
            System.out.println("fazla Yükleme");
        } else if (sayi2>=0 && sayi1>=0) {
            System.out.println("toplam : "+toplam);
        } else{
            System.out.println("Gecersiz giris");
        }


    }

}
