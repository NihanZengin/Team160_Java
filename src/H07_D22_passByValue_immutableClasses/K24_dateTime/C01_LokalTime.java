package H07_D22_passByValue_immutableClasses.K24_dateTime;

import java.time.Duration;
import java.time.LocalTime;

public class C01_LokalTime   {
    public static void main(String[] args) {
        // bilgisayarinizdaki zamani yazdirin

        // LocalTime saat = new LocalTime();
        /*
            Time ve date ile ilgili objeler olustururken
            Java sifirdan bir obje olusturmamiza izin vermez
            zamani ve tarihi bilgisayarimizdan alacagi icin bazi on ayarlari yapmasi gerekir

            Java kendisi bize tarihi veya zamani return edecek
            method'lar hazirlamistir

            biz de class'imizda zaman veya tarih objesi olusturdugumuzda
            degeri o method'lardan alip kullaniriz
         */

        LocalTime saat = LocalTime.now();

        System.out.println(saat); // 08:17:00.001934

        // .get..()  localTime degerindeki saat,dakika,saniye veya nanosaniyeyi bize getirir

        System.out.println(saat.getHour()); // 8


        // Bir loop olusturup
        // Loop'un calismaya basladigi zaman ile bittigi zaman arasindaki farki bulun
        /*
        Bu soruyu cozmek icin for loop'un basinda ve sonunda  saat'i yazdirdigimda
        (for dongusuyle aradan uzun zaman gecse dahi)
         nano saniyasine kadar ayni degeri yazdiriyor.
        Bunun sebebi 23. satirda saati aliyor ve hep ayni degeri kullaniyor.
        Bu sebeple bu soruyu cozmek icin baslangic ve bitis degerlerini
        ayri ayri alarak asagidaki gibi yapiyoruz

         */

        LocalTime baslangic = LocalTime.now();

        String str = "";

        for (int i = 0; i <100000 ; i++) {

            str+= i;
        }

        LocalTime bitis = LocalTime.now();


        System.out.println("saat : "+saat);
        System.out.println("baslangic : "+baslangic);
        System.out.println("bitis : " + bitis);

        /**
            LocalTime class'i obje olusturdugumuz satir calistiginda
            calistigi sistemdeki zaman bilgisini alir

            olusturulan localTime objesi bir kronometre degil
            olusturuldugu andaki degeri saklayan basit bir variable'dir

            Eger koddaki 2 satirin calismasi arasinda gecen zamani bulmak isterseniz
            o iki satirda 2 adet localTime objesi olusturup
            bu zamanlar arasindaki farki bulmaliyiz

         */

        // 1- get method'lari ile zaman arasindaki farki bulabiliriz

        System.out.println(bitis.getSecond() - baslangic.getSecond());
        //Sonuc cok saglikli degil cunku nanosaniye isin icinde
        // tam sureyi belirlemek icin
        // saat, dakika, saniye ve nanosaniye degisimlerini dikkate alan, bir kod yazmaliydik.
        //Bunun yerine Java bize method olusturmus.
        /// Duration.between():


        // 2- Duration.between() ile baslangic ve bitis degerlerini bulabiliriz

        System.out.println("Duration : "+ Duration.between(baslangic, bitis)); //



        // 3- toSecondOfDay() veya toNanoOfDay() ile aradaki farki bulabiliriz
        //Gunun basindan suana kadarki saniyeyi -->toSecondOfDay()
        //Gunun basindan su ana kadar nanosaniyeyi --> toNanoOfDay()

        System.out.println(baslangic.toSecondOfDay()); // 30834
        System.out.println(baslangic.toNanoOfDay()); //   30834744350000

        System.out.println(bitis.toNanoOfDay() - baslangic.toNanoOfDay());
        //Bunlarin arasindaki farki yazdirarak  da bulabiliriz





        // .with..()  localTime degerindeki saat,dakika,saniye veya nanosaniyeyi
        // istedigimiz deger olarak ayarlar

        System.out.println(saat.withHour(10)); // 10:37:10.215615
        System.out.println(saat.withSecond(0).withNano(0)); // 08:38
        //saniye ve nona ile isimiz yok diyorsak boyle yapmak mantikli olur




        // .plus..() veya .minus..()  localTime degerindeki saat,dakika,saniye veya nanosaniyeyi
        // istedgimiz deger kadar ileri veya geriye alir.

        System.out.println(saat.plusHours(5).plusMinutes(12).plusSeconds(10));

        System.out.println(saat.minusHours(3).minusMinutes(5));

        System.out.println(saat.isBefore(baslangic)); // true
        //Saat degeri baslangictan once mi?

        System.out.println(bitis.isAfter(baslangic)); // true
        //bitis degeri baslangic degerinden sonra mi?

        System.out.println(saat.isAfter(bitis)); // false

    }
}
