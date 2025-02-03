package H4_D12_ForLoop;

import java.util.Scanner;

public class C06 {
    public static void main(String[] args) {

        // Kullanicidan pozitif bir tamsayi alip, rakamlar toplamini asagidaki gibi yazdirin.
        // input : 1453 output => 1+4+5+3 = 13
        // output :  "Girilen 1453 sayisinin rakamlar toplami : 13"

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen  pozitif bir tamsayi giriniz...");
        int girilenSayi=scan.nextInt();
        //sayi variable'i loop icinde 10'a bolunerek 0 oluncaya kadar islem devam ediyor
        //Kullanici'nin girdigi sayi degerini bu sekilde yok etmek mantikli degil.
        //Bu sebeple girilenSAyi'yi sayi variable'a atayarak, islemleri sayi variable'da yapalim.

        int sayi=girilenSayi;

        int basamakSayisi= (girilenSayi+"").length(); //basamak sayisini ogrenmek icin String'e cevirdik.

        int birlerBasamagi=0;

        int rakamlarToplam=0;

        for (int i = 1; i <= basamakSayisi ; i++) {

            birlerBasamagi=sayi%10;
            rakamlarToplam+=birlerBasamagi;
            sayi=sayi/10;

        }
        System.out.println("Girilen "+girilenSayi+ " sayisinin rakamlar toplami: "+rakamlarToplam);


    }
}
