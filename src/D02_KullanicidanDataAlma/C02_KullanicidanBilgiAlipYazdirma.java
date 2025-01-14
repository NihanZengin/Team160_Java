package D02_KullanicidanDataAlma;

import java.util.Scanner;

public class C02_KullanicidanBilgiAlipYazdirma {

    public static void main(String[] args) {
        //Kullanicidan ismini, soyismini, yasini alip asagidaki formatta yazdirin.

        /** Isminiz : John
         * Soyisminiz : Doe
         * Yasiniz : 44
         * Kaydiniz basariyla tamamlanmistir.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen isminizi giriniz...");

        //String isim = scanner.next();
        // kullanicinin girdigi bilginin ILK KELIMESINI (ilk space'e kadar olan kismini) alir.

        String isim = scanner.nextLine();
        //kullanicinin girdigi bilginin tamamini alir.

        System.out.println("Lutfen soyisminizi giriniz...");

        String soyisim = scanner.nextLine();

        System.out.println("Lutfen yasinizi giriniz...");

        int yas = scanner.nextInt();

        System.out.println(
                "Isminiz : " + isim +
                "\nSoyisminiz : " + soyisim +
                "\nYasiniz : " + yas +
                "\nKaydiniz basariyla tamamlanmistir."
        );

        //Isminiz : Ali Mert
        //Soyisminiz : Kalkan
        //Yasiniz : 34
        //Kaydiniz basariyla tamamlanmistir.
        /** Alt alta yazdirmak icin onune \n yazdik. Yoksa hepsini yanyana yazdiriyor.*/

    }







}
