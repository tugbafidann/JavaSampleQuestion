package SampleQuestion2;

public class Q_25_alfabe {
    public static void main(String[] args) {
        // Soru 25-)
        //Alfabeyi konsola yazdırın.
        //örnek:
        //a b c .. .. .. .. y z
        //ipucu: char kullanmak iyi bir fikir olabilir
        char ilk='a';
        char son='z';

        // ~~~~~~~ WHİLE ile ~~~~~~~~~~~
        System.out.println("While ile : ");
       while (ilk<=son){
            System.out.print(ilk+ " ");
            ilk=(char)(ilk+1);
        }
        System.out.println("");
        System.out.println("Do While ile : ");
       ilk='a';
        // ~~~~~~~ DO WHİLE  ile ~~~~~~~~~~~
        do {
            System.out.print(ilk +" ");
            ilk=(char)(ilk+1);
        }while (ilk<=son);

        System.out.println("");
        System.out.println("For ile : ");
        ilk='a';
        // ~~~~~~~ FOR ile ~~~~~~~~~~~
        for (int i = ilk; i <=son ; i++) {
            System.out.print(ilk+" ");
            ilk=(char) (ilk+1);

        }
    }
}
