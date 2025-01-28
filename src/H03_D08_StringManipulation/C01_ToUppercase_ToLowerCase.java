package H03_D08_StringManipulation;

import java.util.Locale;

public class C01_ToUppercase_ToLowerCase {
    public static void main(String[] args) {


        String str=" Java Candir";


        str.toUpperCase(); //Result of 'String. toUpperCase()' is ignored , yani yaptigin islem bir ise yaramadi.

        //9.satirdaki islem calismadi demeyiz. Calisir ama biz sonucu yazdirmadigimiz icin konsolda goremeyiz.



        System.out.println(str); // Java Candir

        //Ayrica str'a atama yapmadigimiz icin str degeri degismez.



        //str;i kucuk harflerle yazdirin
        System.out.println("str'a atama yapmadan kucuk harflerle yazdirdi: "+str.toLowerCase());// java candir

        System.out.println("Atama yapilmadigi icin str hala--> "+str); // Java Candir
        // Atama yapmadigimiz icin degisiklik kalici olmaz.



        //str'i buyuk harflerle yazilmis sekilde kaydedin.
        // Kalici degisiklik yapmak istedigimizde ATAMA yapmaliyiz
        str=str.toUpperCase();
        System.out.println("Atamadan sonra str: "+str);



        //str'i kucuk harfe cevirirken turkce karakter ile "java candır" yazdirmak istersek;
        // // ingilizce de i -> I     Turkce ı -> I
        //i ve ı arasındakı fark lokale kullanılarak cozulur
        //bunun dısındakı ş,ö,ü,ğ gıbı harfler dırekt toUpperCase ve toLowerCase ıle buyuk kucuk harfe cevırılır.



        System.out.println(str.toLowerCase()); // java candir

        System.out.println(str.toLowerCase(Locale.CHINA)); // java candir

        System.out.println(str.toLowerCase(Locale.forLanguageTag("Tr"))); // java candır

         /*
         Eger bir dilde herhangi bir harfin buyuk/kucuk harf degisimi
            latin alfabesinden farkli ise toUpperCase() veya toLowerCase() kullanirken
            Localle tercihi kullanilabilir.

            ornegin str'i kucuk harfe cevirirsek,
            ingilizce alfabe kullandigi icin CANDIR ==> candir olur
            Eger I'yi toLowerCase() yaptigimizda turkce kucuk ı olmasini istersek
            Locale tercihi kullanabiliriz
        * */


    }

}
