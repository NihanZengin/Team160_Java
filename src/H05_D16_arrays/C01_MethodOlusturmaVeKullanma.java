package H05_D16_arrays;

import java.util.Scanner;

public class C01_MethodOlusturmaVeKullanma {
    public static void main(String[] args) {
        //Kullanicidan ismini ve soyismini alip
        // bu bilgileri ilk harfi buyuk,
        // sonraki harflr kucuk olacak sekilde
        // yazdiran bir method olusturun.

        ismiDuzenleYazdir();

        /*
        yukarda verilen gorev bizden sadece yazdirmamizi istedigi icin
        olusturdugumuz methodu void yapmayi tercih ettik.
        ANNCAKKK gorevin devaminda kullanicinin girdigi
         isim ve siyisme main method icinde ihtiyacimiz olacaksa
         method'da yazdirilan duzenlenmis Isim variable'ini
          main methodda kullanamayiz.

          Bu sorunu iki turlu cozebiliriz:
          1- Method ile cozum
          2- Scope ile cozum
         */

        //GIRILEN ISIM VE SOYISIM uzunlugunu kontrol edip
        //10 harften az ise "gecersiz giris"
        //10 harften az degilse "giris basarili" yazdirin.

    }
    public static void ismiDuzenleYazdir(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Isminiz: ");
        String isim=scanner.nextLine();

        System.out.print("Soyisminiz: ");
        String soyisim=scanner.nextLine();

        String duzenlenmisIsim= isim.substring(0,1).toUpperCase()+
                                isim.substring(1).toLowerCase()+
                                " "+
                                soyisim.substring(0,1).toUpperCase()+
                                soyisim.substring(1).toLowerCase();
        System.out.print("Girilen isim: "+duzenlenmisIsim);


    }

}
