package H03_D11_StringManipulation;

import java.util.Scanner;

public class C04_SifreKontrolu {
    public static void main(String[] args) {

        //Soru 4 : Kullanicidan bir sifre isteyip,
        //         asagidaki sartlari kontrol edin
        //         ve kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
        //         eger tum sartlari saglarsa, "sifre basariyla kaydedildi" yazdirin
        //         - ilk harf kucuk harf olmali
        //         - son karakter rakam olmali
        //         - sifre bosluk icermemeli
        //         - uzunlugu en az 10 karakter olmali


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen sifrenizi giriniz...");
        String sifre = scanner.nextLine();

        int sayac =0;

        //         - ilk harf kucuk harf olmali
        char ilkHarf = sifre.charAt(0);

        if ( ! Character.isLowerCase(ilkHarf) ){
            System.out.println("ilk harf kucuk harf olmali");
            sayac++;
        }

        //         - son karakter rakam olmali
        char sonKarakter = sifre.charAt( sifre.length()-1 );

        if ( ! Character.isDigit(sonKarakter) ){
            System.out.println("son karakter rakam olmali");
            sayac++;
        }

        //         - sifre bosluk icermemeli
        if ( sifre.contains(" ") ){
            System.out.println("sifre bosluk icermemeli");
            sayac++;
        }

        //         - uzunlugu en az 10 karakter olmali
        if (  !(sifre.length() > 10) ){
            System.out.println("uzunlugu en az 10 karakter olmali");
            sayac++;
        }

        // basta sayac olarak olusturdugumuz variable degeri 0 idi
        // sona geldiginde sayac 0-1-2-3-4
        //         eger tum sartlari saglarsa, "sifre basariyla kaydedildi" yazdirin


        if (sayac == 0){
            System.out.println("sifre basariyla kaydedildi");
        }
    }
}
