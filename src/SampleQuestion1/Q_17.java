package SampleQuestion1;

public class Q_17 {
    public static void main(String[] args) {
        /*
        Soru 17-)
            Kullanıcıdan bir isim ve bir karakter girmesini isteyin, ardından isimde karakterin
            kaç kez tekrarlandığını kontrol edelim.
            Örnek:
            char ch1=            'a'
            String name =     "Ali bakkala geç gitti."
            Beklenen Çıktı=    a sayısı = 3
            Ipucu:
            Loop döngülerini hatırlayalım. While döngüsü kullanabilirsiniz!
            Sayac adlı bir int variable oluşturarak bunun ile kelimenin kaç defa geçtigini
            Loop içindeki İf ile bulabilirsiniz!
         */
        char karakter='a';
        int sayac=0;

        String name="Tugba Belkis Sümeyra ders calisiyor";
        for (int i = 0; i <=name.length()-1 ; i++) {
            if(name.charAt(i)==karakter){
                sayac ++;
            }
        }
        System.out.println("verilen karakter sayisi : " +sayac );

        /////************/////
        int counter=0;
        int index=0;
        while(index<name.length()){
            if(name.charAt(index)==karakter){
                counter ++;
            }
            index++;
        }
        System.out.println("karakter sayisi : "+counter);
    }



}
