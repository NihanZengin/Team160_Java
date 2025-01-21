package H02_D05_IfStatements.D05_NestedIfElseStatements;

import java.util.Scanner;

public class C20_EmeklilikHesabi {
    public static void main(String[] args) {
        // Kullanicidan cinsiyetini ve yasini alin,
        // Kadin, 60 yas ve uzeri , Erkek 65 yas ve uzeri emekli olabilir.
        // Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin”
        // veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.
        // kullanici E ve K disinda bir cinsiyet girerse
        // veya 15 yasdan kucuk, 80 yasdan buyuk yas girerse uyarin

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen cinsiyetinizi giriniz. E: erkek, K:kadin");
        char cinsiyet = scanner.next().toUpperCase().charAt(0);

        // kullanici kucuk buyuk harf girebilir diye
        // kontrolu kolay yapabilmek icin toUpperCase() kullandik

        System.out.println("Lutfen yasinizi giriniz...");
        double yas = scanner.nextDouble();

        /*
            Eger bir if else'de karar vermek icin baktigimiz
            variable sayisi birden fazla ise nested if else statement tercih edilebilir

            Oncelikle bakacagimiz 2 degiskenden birini
            ana degısken kabul edip sadece ona gore bir if else olustururuz

            biz cinsiyeti ana degisken kabul edelim
         */


        if (cinsiyet == 'K'){ // sadece kadinlar bolumu, yasi kadinlara gore degerlendirebiliriz.

            if (yas<15 || yas>80){
                System.out.println("Girilen yas icin emeklilik hesaplanamaz");
            } else if (yas>=60) {
                System.out.println("Kadin, 60 yasdan buyuk. Emekli olabilir");
            } else  {
                System.out.println("Kadin, emekli olmak icin daha " + (60-yas) + " sene daha calismalidir");
            }

        } else if(cinsiyet == 'E'){ // sadece erkekler bolumu

            if (yas<15 || yas>80){
                System.out.println("Girilen yas icin emeklilik hesaplanamaz");
            } else if (yas>=65) {
                System.out.println("Erkek, 65 yasdan buyuk. Emekli olabilir");
            } else  {
                System.out.println("Erkek, emekli olmak icin daha " + (65-yas) + " sene daha calismalidir");
            }

        } else {
            System.out.println("Cinsiyet olarak E veya K secmelisiniz");
        }
    }
}
