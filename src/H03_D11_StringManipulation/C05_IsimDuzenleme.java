package H03_D11_StringManipulation;

import java.util.Scanner;

public class C05_IsimDuzenleme {
    public static void main(String[] args) {
        // Kullanicidan isim ve soyismini ayri ayri alin.
        //	- ismi daha uzun ise,
        //    isim ve soyismi ilk harf buyuk kalanlar kucuk seklinde yazdirin
        //  - soyisim daha uzun ise,
        //    ismi ilk harf buyuk digerleri kucuk, soyismin tamamini buyuk harflerle yazdirin.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen isminizi giriniz...");
        String isim = scanner.nextLine();

        System.out.println("Lutfen soyisminizi giriniz...");
        String soyisim = scanner.nextLine();


        if (isim.length() > soyisim.length()){
            //    isim ve soyismi ilk harf buyuk kalanlar kucuk seklinde yazdirin

            System.out.println(

                    isim.substring(0,1).toUpperCase() +
                            isim.substring(1).toLowerCase()+
                            " " +
                            soyisim.substring(0,1).toUpperCase()+
                            soyisim.substring(1).toLowerCase()
            );

        }


        if (soyisim.length() > isim.length()){
            //    ismi ilk harf buyuk digerleri kucuk, soyismin tamamini buyuk harflerle yazdirin.

            System.out.println(
                    isim.substring(0,1).toUpperCase() +
                            isim.substring(1).toLowerCase()+
                            " " +
                            soyisim.toUpperCase()
            );

        }
    }
}
