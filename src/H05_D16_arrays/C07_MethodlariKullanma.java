package H05_D16_arrays;

import java.util.Arrays;

public class C07_MethodlariKullanma {
    public static void main(String[] args) {
        int[] sayilar = {2,4,6,-9,-5,-2};
        // sayilar array'indeki pozitif sayilarin toplamini yazdirin

        System.out.println(C06_Next.getPozitifSayilarToplam(sayilar)); // 12



        // sayilar array'inde 4 var mi?

        C08_Next.printKullanimSayisi(sayilar,4);
        // Aradaginiz 4 sayisi array'de 1 adet kullanilmis

        String[] sirketler = {"Sony","Amazon","Tesla","Apple","Samsung","Toyota"};

        // sirket ismi en uzun ve en kisa olan sirket isimlerini yazdirin
        C09_Next.printEnKisaEnUzunKelime(sirketler);
        //En kisa kelime : Sony
        //En uzun kelime : Samsung


        // sayilar array'ine 7 ve 9 degerlerini ekleyin {2,4,6,-9,-5,-2};

        sayilar = C10_Next.arrayElemanEkle(sayilar,7);
        sayilar = C10_Next.arrayElemanEkle(sayilar,9);

        System.out.println(Arrays.toString(sayilar)); // [2, 4, 6, -9, -5, -2, 7, 9]

        int[] arr={3,6,7,3,5,1};

        C13_Next.elemanalriArtir(arr,4); //arr yeni hali: [7, 10, 11, 7, 9, 5]

    }
}
