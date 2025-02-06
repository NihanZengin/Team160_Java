package H04_D14_WhileLoop;

import java.util.Scanner;

public class C08_DoWhileLoop {
    public static void main(String[] args) {
        /*
        While loop'un en buyuk eksisi kullanicidan deger alinan gorevlerde
        loop calismadan once bizim atayacagimiz degerin ONEMLI olmasidir.

        Cunku biz ilk deger atamasini yanlis yaparsak LOOP BODY hic calismayabilir.
         */

        /*
        Kullanicidan toplanmak uzere pozitif tamsayilar isteyin
        Kullaniciya bitirmek istediginde 0'a basmasini soyleyin
        Kullanici bitirmek istediginde toplam kac adet pozitif tamsayi oldugu
        ve bunlarin toplaminin kac oldugunu yazdirin
        Kullanici negatif sayi girerse "negatif sayi kullanamazsiniz yazdirin
        bu negatif sayiyi, sayi adedine ve toplama eklemeyin
         */

        Scanner scanner =new Scanner(System.in);

        //int sayi=0; //sayiyi 0 olarak atarsak while loop body hic calismaz. ama do-while'da bu sorun olusturmaz
        int sayi=10;
        int sayiToplami=0;
        int sayac=0;

        //while loop ile yapalim

        while (sayi !=0){
            System.out.println("Lutfen toplanmak uzere pozitif tamsayi giriniz"+
                    "\nBitirmek icin 0'a basiniz");

            sayi=scanner.nextInt();

            if(sayi>0){
                sayiToplami+=sayi;
                sayac++;
            } else if (sayi<0) {

                System.out.println("negatif sayi kullanamazsiniz");
            }

        }
        System.out.println("Girilen "+sayac + " adet pozitif tamsayinin toplami : "+sayiToplami);

        do{

            System.out.println("Lutfen toplanmak uzere pozitif tamsayi giriniz"+
                    "\nBitirmek icin 0'a basiniz");

            sayi=scanner.nextInt();

            if(sayi>0){
                sayiToplami+=sayi;
                sayac++;
            } else if (sayi<0) {

                System.out.println("negatif sayi kullanamazsiniz");
            }

        }
        while(sayi != 0);
    }
}
