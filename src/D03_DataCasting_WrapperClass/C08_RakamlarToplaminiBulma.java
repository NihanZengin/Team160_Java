package D03_DataCasting_WrapperClass;

import java.util.Scanner;

public class C08_RakamlarToplaminiBulma {
    public static void main(String[] args) {
        // Kullanicidan 3 basamakli pozitif bir tamsayi isteyin
        // sayinin rakamlar toplamini bulun
        // ornek input = 245  ise output = 11


        Scanner scanner = new Scanner(System.in);

        System.out.println( "Lutfen 3 basamakli pozitif bir tamsayi giriniz...");

        int sayi = scanner.nextInt();

        int birlerBasamagi=0;
        int rakamlarToplami=0;

        birlerBasamagi=sayi%10;                             //245%10-->5

        rakamlarToplami=rakamlarToplami+birlerBasamagi;     //rT=0+5-->5

        sayi=sayi/10;                                       //sayi=245/10-->24 boylece
        // rakamlar toplamina ekledigimiz ilk basamaktan kurtuluyoruz.

        birlerBasamagi=sayi%10;                             //24%10-->4 birler basamaginin yeni degeri

        rakamlarToplami=rakamlarToplami+birlerBasamagi;     //rT=5+4-->9 onlar ve birler basamaginin toplamini bulduk.

        sayi=sayi/10;                                       // rakamlar toplamina ekledigimiz onlar basamagindan kurtuluyoruz.

        rakamlarToplami=rakamlarToplami+sayi;               // rT=9+2-->11 kalan sayiyi direk eklerim.

        System.out.println("Girilen sayinin rakamlar toplami " + rakamlarToplami); //11
    }
}
