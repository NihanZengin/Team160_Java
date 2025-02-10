package H05_D16_arrays;

import java.util.Scanner;

public class C02_ReturnKullanarak {
    public static void main(String[] args) {
//Kullanicidan ismini ve soyismini alip
        // bu bilgileri ilk harfi buyuk,
        // sonraki harflr kucuk olacak sekilde
        // duzenleyip donduren bir method olusturun.

        //GIRILEN ISIM VE SOYISIM uzunlugunu kontrol edip
        //10 harften az ise "gecersiz giris"
        //10 harften az degilse "giris basarili" yazdirin.

        /*
        Bize bir sonuc donduren method'lar kullanirken
        dondurulen sonucu 2 sekilde kullanmayi tercih edebiliriz

        1- EGER hemen konsolda gormek istiyorsan methodCall'u sout icinde
        yapabiliriz.Bu tercihi yaptiginizda kodun ilerleyen kisminda
         dondurulen bilgiyi kullanamazsiniz
         System.out.println(ismiDuzenleDondur());

        2- EGER dondurulen bilgiyi ...........
        bir variable'a kaydedebiliriz

         */
        String girilenIsim =ismiDuzenleDondur(); //Konsolda gormek icin simdi sout yapilabilir

        if (girilenIsim.length()<10){
            System.out.println("gecersiz giris");

        }else System.out.println("giris basarili");
    }
    public static String ismiDuzenleDondur(){
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

        return duzenlenmisIsim;


    }
}
