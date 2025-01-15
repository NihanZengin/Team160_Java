package D03_DataCasting_WrapperClass;

public class C06_WrapperClasses {
    public static void main(String[] args) {

        String str = "Java Candir";
        int sayi=34;

        System.out.println( str.toUpperCase()); //JAVA CANDIR
        System.out.println(str.charAt(2)); // v

        /*
            Java primitive data turundeki variable'lar icin de
            bazi hazir method'lar kullanabilmemiz icin
            Wrapper Class'lari olusturmustur

            Boolean, Character, Byte, Short, Integer, Long, Float, Double
         */

        int sayi1=5;
        Integer sayi2= sayi1;

        Integer sayi3= 3456;
        int sayi4=sayi3;

        /// Primitive olan int ile Wrapper Class olan Integer arasinda her zaman gecis mumkundur.
        ///Ancak farkli Wrapper Class'larin kendi aralarinda gecisi ve
        ///farkli turdeki primitive data turunden de gecis mumkun olamaz.

        String fiyat1 = "23";
        String fiyat2 = "45";
        // String olarak verilen iki urunun fiyatini toplayin

        System.out.println( fiyat1 + fiyat2 ); // 2345

        //Icinde SADECE sayilar oldugundan emin oldugunuz String'leri
        // Wrapper Class'lari kullanarak sayiya cevirebiliriz.
        // Nutella 23$ ==> "23"

        int fiy1 = Integer.parseInt(fiyat1);
        int fiy2 = Integer.valueOf(fiyat2);

        System.out.println("Iki urunun toplam fiyati : " + (fiy1+fiy2)); // Iki urunun toplam fiyati : 68

        fiyat1= "23.45";
        fiyat2="34.43";

        double f1= Double.parseDouble(fiyat1);
        double f2=Double.valueOf(fiyat2);


        System.out.println(Integer.MAX_VALUE); // 2147483647
        System.out.println(Short.MIN_VALUE); // -32768


        char harf ='s';


        // verilen karakterin Buyuk Harf olup olmadigini yazdirin

        System.out.println(Character.isUpperCase(harf)); // false

        // verilen karakterin Kucuk Harf olup olmadigini yazdirin
        System.out.println( Character.isLowerCase(harf) ); // true

        // verilen karakterin Sayi olup olmadigini yazdirin

        System.out.println(Character.isDigit(harf)); // false

        // verilen karakterin Harf olup olmadigini yazdirin
        System.out.println(Character.isLetter(harf)); // true

        // verilen karakterin Alfabetik olup olmadigini yazdirin
        System.out.println(Character.isAlphabetic(harf)); // true

        // verilen karakteri buyuk harf olarak yazdirin
        System.out.println(Character.toUpperCase(harf)); // S

    }
}
