package SampleQuestion1;

public class Q_11 {
    public static void main(String[] args) {
       /* Soru 11-) Kullanıcıya Adını, Soyadını ve kredi kartı numaralarını sorup bunları özel forma dönüştürün.
                Ad ve soyadın baş harfleri büyük olmalıdır
        Kredi kartı numarasını kontrol edin, 16 hane yoksa "Geçersiz kredi kartı numarası" yazdırın.
                Kredi Kartı 16 Hane ise aşagıda belirtilen şekilde çıktı alın.
                Ipucu: IF ile çözebilirsiniz. Baş harfleri alın gerisi zaten * işareti ;-)
        Giriş :
		 > Gandalf Grey 563245879632
        Çıktı :
		 > İsim : G****** G***
		 > CCN : **** **** 9632 (edited)

        */
       /* Scanner scan=new Scanner(System.in);
        System.out.println("Adinizi giriniz : ");
        String isim = scan.nextLine();
        System.out.println("Soyadinizi giriniz : ");
        String soyad= scan.nextLine();
        System.out.println("Kart numaranizi giriniz : ");
        String kartNo = scan.nextLine();

        */
        String isim="tugba";
        String soyisim="fidan";
        String kartNo="12564789654789321";
        if(kartNo.length()!=16){
            String adBas=isim.substring(0,1).toUpperCase();
            String kalanHarfler=isim.substring(1);
            //System.out.println(kalanHarfler);  // ugba
            kalanHarfler=kalanHarfler.replaceAll("\\w","*");
            System.out.print("Isim : " +adBas+kalanHarfler);

            String soyadBas=soyisim.substring(0,1).toUpperCase();
            String soyadKalan=soyisim.substring(1);
            soyadKalan=soyadKalan.replaceAll("\\w","*");
            System.out.print(" "+soyadBas+soyadKalan);
            System.out.println("");
            String kartNoKalan=kartNo.substring(13);
            System.out.println("CCN : **** **** ****"+" "+kartNoKalan);



        }else {
            System.out.println("Geçersiz kredi kart numarasi");

        }



    }
}
