package H05_D16_arrays;

import java.util.Scanner;

public class C03_ScopeKullanarak {
    static String duzenlenmisIsim="";


    public static void main(String[] args) {
        //Kullanicidan ismini ve soyismini alip
        // bu bilgileri ilk harfi buyuk,
        // sonraki harflr kucuk olacak sekilde
        // duzenleyip donduren bir method olusturun.

        //GIRILEN ISIM VE SOYISIM uzunlugunu kontrol edip
        //10 harften az ise "gecersiz giris"
        //10 harften az degilse "giris basarili" yazdirin.

        ismiDuzenleYazdir();
        if (duzenlenmisIsim.length()<10) {
            System.out.println("gecersiz giris");
        }else System.out.println("giris basarili");
    }
    public static void ismiDuzenleYazdir(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Isminiz: ");
        String isim=scanner.nextLine();

        System.out.print("Soyisminiz: ");
        String soyisim=scanner.nextLine();

         duzenlenmisIsim= isim.substring(0,1).toUpperCase()+
                          isim.substring(1).toLowerCase()+
                          " "+
                          soyisim.substring(0,1).toUpperCase()+
                          soyisim.substring(1).toLowerCase();
        System.out.print("Girilen isim: "+duzenlenmisIsim);


    }
}
