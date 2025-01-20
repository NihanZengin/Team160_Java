package H01_D03_DataCasting_WrapperClass;

import java.util.Scanner;

public class C04_DataCasting {
    public static void main(String[] args) {

        //kullanicidan iki tamsayi alin sayilari birbirine bolup,
        // islem sonucunu ondalikli olarak yazdirin.

        Scanner scanner= new Scanner(System.in);

        System.out.println("Lutfen iki pozitif tamsayi giriniz..");

        int sayi1= scanner.nextInt();
        int sayi2= scanner.nextInt();

        System.out.println("sayilarin birbirine bolumu: " + (sayi1/sayi2));
        //Lutfen iki pozitif tamsayi giriniz..
        //24
        //5
        //sayilarin birbirine bolumu: 4 --> aslinda cevap 4.8
        ////NOT: Java islem sonucunun sadece tamsayi kismini alir.

        System.out.println("sonucu double'a cast edersek: " + (double)(sayi1/sayi2));
        //Once bolme islemini yapacagindan 4 bulur sonra double a cast eder ve 4.0 yazdirir.

        System.out.println("sayilardan en az birini double'a cast edersek: " + ((double)sayi1/sayi2));
        //Sayilardan herhangi birini double'a cast etmemiz yeterli.--> 4.8


    }
}
