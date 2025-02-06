package H04_D14_WhileLoop;

public class C06_UsAlma {
    public static void main(String[] args) {

        usHesaplaYazdir(2,5); //32.0

        usHesaplaYazdir(5,3); //125.0

    }

    public static void usHesaplaYazdir(double sayi , int pozitifUs){

        double sonuc =1;
        while (pozitifUs>0){

            sonuc*=sayi;
            pozitifUs--;
        }
        System.out.println(sonuc);
    }
}
