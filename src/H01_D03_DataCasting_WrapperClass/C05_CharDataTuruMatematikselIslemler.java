package H01_D03_DataCasting_WrapperClass;

public class C05_CharDataTuruMatematikselIslemler {
    public static void main(String[] args) {


        //Sayisal data turundeki (byte, short, int, long, float, double )bir variable char data turune;
        //ayni sekilde char data turundeki bir variable da,sayisal data turlerinin herhangibirine cast edilebilir.
        //boolean ve String olmaz yani.

        //Not: Char data turundeki bir variable int, float ve double'a otomatik olarak cevrilirken,
        // digerlerine (byte ve short) cevirmek icin cast etmek gerekiyor.

        char chr1 = 'a';
        char chr2 = 'b';
        char chr3 = 'c';

        System.out.println(chr1 + chr2 + chr3); //97 + 98 + 99 --> 294

        System.out.println('a' + 'b' + 'c');//97 + 98 + 99 --> 294

        /** char data turundeki bir variable veya deger
         MATEMATIKSEL bir isleme girerse ASCII table'daki degeri devreye girer
         */

        System.out.println("a" + "b" + "c"); // abc String toplanan metinleri YANYANA yazdirir.


        //sayi olarak verilmis bir degerin char olarak karsiligini yazdirin.

        int sayi1 = 97;
        int sayi2 = 65;

        System.out.println((char) sayi1); // a
        System.out.println((char) sayi2); // A

        //Soru: k harfinden sonraki 3 karakteri yazdirin.

        char ch5 = 'k';

        System.out.println(
                (char) (ch5 + 1) + " " + (char) (ch5 + 2) + " " + (char) (ch5 + 3)  //l m n
        );


        //Verilen bir karekterin k dan sonra olup olmadigini yazdirin.

        char chr6 = 'a';
        char chr7 = 'm';

        System.out.println(chr6 > 'k'); //false 97>108

        System.out.println(chr7 > 'k'); //true  110>108
    }
}
