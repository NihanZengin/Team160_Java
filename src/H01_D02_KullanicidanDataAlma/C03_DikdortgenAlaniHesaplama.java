package H01_D02_KullanicidanDataAlma;

import java.util.Scanner;

public class C03_DikdortgenAlaniHesaplama {
    public static void main(String[] args) {
        // Soru 3- Kullanicidan bir dikdortgenin 2 kenar uzunlugunu isteyip dikdortgenin alanini yazdirin.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen dikdortgenin kenar uzuluklarini metre cinsinden giriniz...");

        double kenar1 = scanner.nextDouble();
        double kenar2 = scanner.nextDouble();

        System.out.println("Dikdortgenin alani : " + (kenar1 * kenar2) + " metrekare" ) ;

        //Lutfen dikdortgenin kenar uzuluklarini metre cinsinden giriniz...
        //3.4
        //2.4
        //Dikdortgenin alani : 8.16 metrekare

    }



}
