package D03_DataCasting_WrapperClass;

import java.util.Scanner;

public class C07_Modulus {
    public static void main(String[] args) {
        System.out.println( 25 / 10 ); // 2.5 ==> 2

        System.out.println( 15 / 4 ); // 3.75 ==> 3


        System.out.println( 234 / 10 ); // 23.4 ==> 23 birler basamagidaki rakami yok eder


        System.out.println( 15 % 4 ); //  15'in 4 ile bolumunden kalani verir. 3

        System.out.println( 234 % 10 ); // 4 ==> bize birler basamagindaki rakami verir

        //girilen sayinin cift olup olmadigini yazdirin.
        // sayi 2 ile bolunuyorsa yani kalan 0 ise yani %2-->0 ise cifttir.

        int sayi=45;
        System.out.println(sayi%2); //1 sayi cift degildir.

        //girilen sayinin 5'e bolunup bolonmedigini yaziniz.

        System.out.println(sayi%5); //kalan 0 ise 5'e bolunur.

        // kullanicidan bir tamsayi isteyin
        // girilen sayinin birler basamagini yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz...");
        int girilenSayi = scanner.nextInt();//259

        System.out.println( "Girilen sayinin birler basamagi : "+ girilenSayi % 10 );//Girilen sayinin birler basamagi : 9

        System.out.println( girilenSayi /10 ); // 25
    }
}
