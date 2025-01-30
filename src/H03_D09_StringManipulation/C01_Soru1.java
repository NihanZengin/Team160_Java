package H03_D09_StringManipulation;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C01_Soru1 {
    public static void main(String[] args) {

        // Kullanicidan sifre olusturmak uzere sifre isteyin.
        // Sifreyi iki kere girmesini isteyin
        // eger metin tamamen ayni ise
        // "sifreniz basarili olarak kaydedildi" yazdirin
        // eger metin ayni oldugu halde case farkliligi varsa
        // "Lutfen yazimi kontrol edin" yazdirin
        // Eger karakter farkliligi varsa
        // "Girilen sifreler farkli" yazdirin


        Scanner scanner= new Scanner(System.in);
        System.out.println("Lutfen olusturmak istediginiz sifreyi giriniz..");
        String sifre=scanner.nextLine();
        System.out.println("Lutfen kontrol icin sifreyi tekrar giriniz..");
        String sifre2=scanner.nextLine();

        if(sifre.equals(sifre2)){
            System.out.println("sifreniz basarili olarak kaydedildi");
        } else if (sifre.equalsIgnoreCase(sifre2)) {
            System.out.println("Lutfen yazimi buyuk kucuk harf farkliligini dikkate alarak kontrol edin");

        }
        else {
            System.out.println("Girilen sifreler farkli");
        }



    }
}
