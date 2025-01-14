package D02_KullanicidanDataAlma;

import java.util.Scanner;

public class C04_KullanicidanBilgiAlipYazdirma {

    public static void main(String[] args) {
        //Soru4- Kullanicidan ismini, soyismini ve yasini alip asagidaki formatta yazdirin.
        // Girilen bilgiler: J Doe, 44

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen isminizi giriniz...");
        String isim = scanner.nextLine();


        System.out.println("Lutfen soyisminizi giriniz...");
        String soyisim = scanner.nextLine();

        System.out.println("Lutfen yasinizi giriniz...");
        int yas = scanner.nextInt();


        // Girilen bilgiler: J Doe, 44
        // Buradaki formatta isminin sadece ilk harfini yazdirmamizi istizzor.

        System.out.println(
                "Girilen bilgiler : " + isim.charAt(0) + " " +
                         soyisim + ", " + yas
        );
        //Lutfen isminizi giriniz...
        //Ali Mert
        //Lutfen soyisminizi giriniz...
        //Bulut Aslan
        //Lutfen yasinizi giriniz...
        //44
        //Girilen bilgiler : A Bulut Aslan, 44

    }
}
