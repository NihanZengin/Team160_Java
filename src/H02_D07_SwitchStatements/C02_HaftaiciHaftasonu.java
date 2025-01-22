package H02_D07_SwitchStatements;

import java.util.Scanner;

public class C02_HaftaiciHaftasonu {
    public static void main(String[] args) {



        // kullanicidan gun ismini alin
        // buyuk kucuk harf farketmez
        // girilen gunun hafta ici veya haftasonu oldugunu yazdirin
        // kullanici gun ismini yanlis yazarsa uyarin


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen gun ismini giriniz...");
        String gunIsmi = scanner.nextLine().toLowerCase();

        // Pazar  , PAZAR, pazar, PAzar, PaZaR ==> pazar

        switch (gunIsmi){

            case "pazartesi":
            case "sali":
            case "carsamba":
            case "persembe":
            case "cuma":
                System.out.println("haftaici");
                break;
            case "cumartesi":
            case "pazar":
                System.out.println("haftasonu");
                break;
            default:
                System.out.println("girilen gun hatali yazildi..");
        }

        /**
         EGER birden fazla case icin ayni islem yapilacaksa
         break her case'de yazilmaz,
         ayni islevi yapan case'ler bir tek break ile birlestirilebilir.
         */

        boolean emekliMi=true;
        double sayiDouble=45;
        float sayiFloat=48.6f;
        long sayiLong=43;           /// buradaki variable turleri switch statement'da kullanilamaz.

        /* switch (sayiDouble){}

        * Incompatible types. Found: 'boolean',
        * required: 'char, byte, short, int, Character, Byte, Short, Integer, String, or an enum'*/

        /**
         * Bir switch statement'da kullanabilecegimiz variable turleri
         * byte, short, int, char, String  OLABILIR
         * boolean, long, float, double OLAMAZ
         */
    }
}
