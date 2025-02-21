package H07_D22_passByValue_immutableClasses.K24_dateTime;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;

public class C03_LokalDate {
    public static void main(String[] args) {
           /*
            Localdate Class'i da LocalTime class'i ile benzer ozelliklere sahiptir

            - herhangi bir andaki local tarihi kaydedebiliriz
            - herhangi bir anda her hangi bir saat dilimideki(ZoneId) tarihi kaydedebiliriz
            - Verilen iki localDate arasindaki zaman dilimini bulabiliriz
            - localDate'den
                - get() ile tarihin istenen bolumu alinabilir
                - with() ile tarihin belirli bir bolumunu istenen deger ile degistirilebilir
                - plus() ile tarih istenen kadar ileri alinabilir
                - minus() ile tarih istenen kadar geri alinabilir
            - farkli tarihleri isAfter veya isBefore ile karsilastirabiliriz
         */


        // Japanyo'daki tarihi yazdirin
        LocalDate tarihJapan = LocalDate.now(ZoneId.of("Japan"));
        System.out.println("Japan : "+tarihJapan); // Japan : 2025-02-21

        // Hawai'deki tarihi yazdirin (Pacific/Honolulu)
        LocalDate tarihHawai = LocalDate.now(ZoneId.of("Pacific/Honolulu"));
        System.out.println("hawaii tarih : " + tarihHawai ); // hawaii tarih : 2025-02-21


        // 18 Temmuz 1990 icin bir tarih olusturun

        LocalDate dogumTarihi = LocalDate.of(1990,7,18);
        System.out.println(dogumTarihi);  //1990-07-18

        // 1990-07-18'da dogan birinin su an kac yasinda oldugunu yazdirin

        System.out.println(Period.between(dogumTarihi, tarihJapan)); // P 34Y 7M 3D


        // kullanicidan alinan iki dogum tarihini karsilastirarak
        // hangisinin daha once dogdugunu yazdirin

        LocalDate dogumTarihi2 = LocalDate.of(1990,9,8);


        if (dogumTarihi2.isBefore(dogumTarihi)){
            System.out.println("Esin daha once dogmus");
        } else if (dogumTarihi2.isAfter(dogumTarihi)) {
            System.out.println("Esin daha sonra dogmus");
        }else {
            System.out.println("Esin ayni gun dogmus");
        }


        // 1900 yilinin artik yil olup olmadigini yazdirin

        LocalDate yil1900 = LocalDate.of(1900,1,1);

        System.out.println(yil1900.isLeapYear()); // false



        // Bugun yilin kacinci gunu oldugunu gosterir
        System.out.println(tarihJapan.getDayOfYear()); // 52

        //Su anki ayi verir.
        System.out.println(tarihJapan.getMonth()); // FEBRUARY

    }
}
