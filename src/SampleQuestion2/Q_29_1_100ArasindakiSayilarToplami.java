package SampleQuestion2;

public class Q_29_1_100ArasindakiSayilarToplami {
    public static void main(String[] args) {
        /*
        Soru29-)
1'den 100'e kadar olan doğal sayıların toplamını bulmak için bir Program yazın.
İpucu: Loop kulanabilirsiniz
         */
        int toplam=0;
        for (int i = 1; i <=100 ; i++) {
            toplam +=i;

        }
        System.out.println(toplam);
    }
}
