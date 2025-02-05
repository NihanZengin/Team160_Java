package H04_D13_MethodOlusturmaVeKullanma.MethodOrnekSorular;

public class C09_SifreKontrol {
    public static void main(String[] args) {

        //Verilen sifre icin asagidaki sartlari kontrol edip
        //kullaniciya duzeltmesi gereken tum eksiklikleri yazdiran,
        //tum sartlari kontrol ettikten sonra sifrede hata yoksa true,
        //hata varsa false donduren bir method olusturun
        // - ilk harf kucuk harf olmali
        // - son karakter rakam olmali
        // - sifre bosluk icermemeli
        // - uzunlugu en az on karakter olmali


        System.out.println(sifreGecerliMi("Adfd fdf")); /*ilk harf kucuk harf olmali
                                                         son karakter rakam olmali
                                                         sifre bosluk icermemeli
                                                         uzunlugu en az 10 karakter olmali
                                                          false
        */

        System.out.println(sifreGecerliMi("fddkjinklidfgdfd1")); // true
    }
    public static boolean sifreGecerliMi(String sifre){
        int sayac =0;

        //         - ilk harf kucuk harf olmali
        char ilkHarf = sifre.charAt(0);

        if ( ! Character.isLowerCase(ilkHarf) ){
            System.out.println("ilk harf kucuk harf olmali");
            sayac++;
        }

        //         - son karakter rakam olmali
        char sonKarakter = sifre.charAt( sifre.length()-1 );

        if ( ! Character.isDigit(sonKarakter) ){
            System.out.println("son karakter rakam olmali");
            sayac++;
        }

        //         - sifre bosluk icermemeli
        if ( sifre.contains(" ") ){
            System.out.println("sifre bosluk icermemeli");
            sayac++;
        }

        //         - uzunlugu en az 10 karakter olmali
        if (  !(sifre.length() > 10) ){
            System.out.println("uzunlugu en az 10 karakter olmali");
            sayac++;
        }

        // basta sayac olarak olusturdugumuz variable degeri 0 idi
        // sona geldiginde sayac 0-1-2-3-4
        //         eger tum sartlari saglarsa, "sifre basariyla kaydedildi" yazdirin


        if (sayac == 0){
           return  true;
        }
        else {
            return false;
        }
    }
}
