package H03_D11_StringManipulation;

import java.util.Scanner;

public class C01_VerilenMetniTemizleme {
    public static void main(String[] args) {
        // kullanicidan bir metin isteyin
        // metindeki bosluk ve harf olmayan herseyi silin
        // ornek : input  : J1a4v*a )G*&^56uzel_!dir.
        //         output : Java Guzeldir




        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz...");
        String metin = scan.nextLine();




  ///J1a4v*a )G*&^56uzel_!dir.

        // once sayilari yok edelim
        metin = metin.replaceAll("\\d","");


        // space de bir ozel karakter oldugundan
        // ozel karakterleri silmeden once space'i korumaya alalim
        // biz yukarda sayilari yok ettigimiz icin
        // gecici olarak space yerine herhangi bir sayi yazalim
        // en sonda yeniden o sayiyi space'e cevirelim
        metin = metin.replaceAll(" " , "1");


        // ozel karakterleri yok edelim
        // w==> harfler,rakamlar ve _
        metin = metin.replaceAll("\\W","");

        // _ yok etmek icin ona ozel islem yapmaliyiz
        metin = metin.replaceAll("_","");

        // space'in yerine yazdigimiz 1'i yeniden space'e cevirelim
        metin = metin.replaceAll("5"," ");



        System.out.println("Metnin son hali : " + metin);
    }
}
