package H05_D16_arrays;

import java.util.Scanner;

public class C09_EnUzunEnKisaKelime {
    public static void main(String[] args) {

        //Verilen String bir array'deki
        //en uzun ve en kisa kelimeleri yazdirin

        String[] isimler = {"Aysenur","Emin", "Fadime", "Haydar Turna","Nihan","Ramazan"};

        String enKisaKelime = isimler[0]; //en bastaki kelimeyi en kisa kelime olarak atayip sirasiyla bununla kiyaslayarak en kisayi bulurum.
        String enUzunKelime = isimler[0]; //en bastaki kelimeyi en uzun kelime olarak atayip sirasiyla bununla kiyaslayarak en uzunu bulurum.

//        for(int i=0; i<isimler.length; i++){
//            if (isimler[i].length() < enKisaKelime.length()) {
//                enKisaKelime=isimler[i];
//
//            }
//            if (isimler[i].length() > enUzunKelime.length()) {
//                enUzunKelime=isimler[i];
//
//            }
//        }
//        System.out.println("En uzun kelime: "+enUzunKelime);//En uzun kelime: Haydar Turna
//        System.out.println("En kisa kelime: "+enKisaKelime);//En kisa kelime: Emin

        for(int i=0; i<isimler.length; i++){
            enUzunKelime=enUzunKelime.length()<isimler[i].length()?isimler[i]:enUzunKelime;
            enKisaKelime=enKisaKelime.length()>isimler[i].length()?isimler[i]:enKisaKelime;
        }
        System.out.println("En uzun kelime: "+enUzunKelime);//En uzun kelime: Haydar Turna
        System.out.println("En kisa kelime: "+enKisaKelime);//En kisa kelime: Emin

    }
}
