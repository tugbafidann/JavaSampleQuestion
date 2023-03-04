package SampleQuestion2;

import java.util.Scanner;

public class Q_19_burcHesaplama {
    public static void main(String[] args) {
        // Kullanıcıdan doğum tarihini alınız. Burcunu hesaplayan bir method yazınız.
        //ipucu:
        //Switch Case kullanabilirsiniz. Veya Method yazarak Method aracılıgı ile de yapabilirsiniz.
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen ay gun(2/28)  sekilde giriniz ");
        int ay=scan.nextInt();
        int gun=scan.nextInt();
        burcHesaplama(gun,ay);
    }
    public static void burcHesaplama(int gun, int ay){
        switch (ay){
            case 1:
                if(gun>=1 && gun<22 ) System.out.println("Oglak burcu");
                if(gun>=22 && gun<=31) System.out.println("Kova burcu");
                break;
            case 2:
                if(gun>=1 && gun<20 ) System.out.println("Kova burcu");
                if(gun>=20 && gun<=31) System.out.println("Balık burcu");
                break;
            case 3:
                if(gun>=1 && gun<21 ) System.out.println("Balık burcu");
                if(gun>=21 && gun<=31) System.out.println("Koç burcu");
                break;
            case 4:
                if(gun>=1 && gun<21 ) System.out.println("Koç burcu");
                if(gun>=21 && gun<=31) System.out.println("Boga burcu");
                break;
            case 5:
                if(gun>=1 && gun<22 ) System.out.println("Boga burcu");
                if(gun>=22 && gun<=31) System.out.println("İkizler burcu");
                break;
            case 6:
                if(gun>=1 && gun<22 ) System.out.println("Ikizler burcu");
                if(gun>=22 && gun<=31) System.out.println("Yengec burcu");
                break;
            case 7:
                if(gun>=1 && gun<23 ) System.out.println("Yengec burcu");
                if(gun>=23 && gun<=31) System.out.println("Aslan burcu");
                break;
            case 8:
                if(gun>=1 && gun<22 ) System.out.println("Aslan burcu");
                if(gun>=22 && gun<=31) System.out.println("Basak burcu");
                break;
            case 9:
                if(gun>=1 && gun<23 ) System.out.println("Basak burcu");
                if(gun>=23 && gun<=31) System.out.println("Terazi burcu");
                break;
            case 10:
                if(gun>=1 && gun<23 ) System.out.println("Terazi burcu");
                if(gun>=23 && gun<=31) System.out.println("Akrep burcu");
                break;
            case 11:
                if(gun>=1 && gun<23 ) System.out.println("Akrep burcu");
                if(gun>=23 && gun<=31) System.out.println("Yay burcu");
                break;
            case 12:
                if(gun>=1 && gun<23 ) System.out.println("Yay burcu");
                if(gun>=23 && gun<=31) System.out.println("Oglak burcu");
                break;
            default:
                System.out.println("Gecersiz giris!!!!!!");
        }
    }
}
