package H03_D08_StringManipulation;

public class C02_charAt {
    public static void main(String[] args) {

        String str = "Java Candir";

        //str'in ilk harfini yazdirin

        System.out.println(str.charAt(0)); //Ilk karakterin indexi 0'dir

        System.out.println(str.charAt(10)); // r --> dikkat: bosluk da bir karakter olarak sayilir.

        //System.out.println(str.charAt(11)); // StringIndexOutOfBoundsException: --> sinirin disinda hatasi verdi

        //str'in sondan 3. karakterini yazdirin'
        System.out.println(str.charAt(8)); // d

        //str'in karakter sayisinin 11 oldugu biliniyorsa;
        //ve son karakterini yazdirin

        System.out.println(str.charAt(11-1)); //r

        //str'in karakter sayisinin 11 oldugu biliniyorsa;
        //ve sondan 5. karakterini yazdirin

        System.out.println(str.charAt(11-5)); //a

        //






    }
}
