package SampleQuestion2;

public class Q_24_ciftSayilar {
    public static void main(String[] args) {
        // Soru 24-)
        //20'den 0'a kadar çift sayıları yazdırın ancak decrement (i--) kullanmayın.
        //Örnek:
        //20'den 0'a kadar Çift Sayılar şunlardır: 20 18 16 14 12 10 8 6 4 2 0
        //ipucu:
        //Loop içinde if kullanarak çözebilirsiniz. % kullanmak iyi bir fikir olabilir
        System.out.println("20'den 0'a kadar cift sayilar sunlardir : ");
        for (int i = 20; i >=0 ; i--) {
            if (i%2==0){
                System.out.print(i+" ");
            }

        }
    }
}
