package H04_D14_WhileLoop;

import java.util.Scanner;

public class C03_EnUzunKelime {
    public static void main(String[] args) {


        // Kullanicidan en uzun kelimeyi bulmak uzere
        // tekrar tekrar kelime isteyip,
        // Kullanici Q'ya (veya q) bastiginda
        // o ana kadar girilen en uzun kelimeyi donduren bir method olusturun
        // eger ayni uzunlukta birden fazla kelime girildi ise herhangi biri olabilir



        enUzunKelimeyiYazdir();

    }

        public static void enUzunKelimeyiYazdir () {

            Scanner scanner = new Scanner(System.in);

            String girilenKelime = "";
            String enUzunKelime = "";


            while (!girilenKelime.equalsIgnoreCase("q")) { // buraya devam sarti yazilmali

                System.out.println("Lutfen bir kelime giriniz...\nBitirmek icin Q'ya basiniz");
                girilenKelime = scanner.next();


                if (girilenKelime.length() > enUzunKelime.length()) {
                    enUzunKelime = girilenKelime;
                }
            }

            System.out.println("Girilen isimlerden en uzun olani : "+enUzunKelime);
        }

}
