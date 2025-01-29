package H03_D10_StringManipulation;

public class C01_lastIndexOf {
    public static void main(String[] args) {

        String str = "ali topu tut, tut ali tut";

        // cumlede "tut" un ilk kullanim index'i
        System.out.println(str.indexOf("tut")); // 9

        // cumlede "tut" un ikinci kullanim index'i
        System.out.println(str.indexOf("tut", 10)); // 14

        // cumlede "tut" un ucuncu kullanim index'i
        System.out.println(str.indexOf("tut", 15)); // 22

        // cumlede "tut" un son kullanim index'i
        System.out.println(str.lastIndexOf("tut")); // 22


        // cumlede "ali" nin ilk kullanim index'i
        System.out.println(str.indexOf("ali")); // 0

        // cumlede "ali" nin son kullanim index'i
        System.out.println(str.lastIndexOf("ali")); // 18


        // "ali topu tut, tut ali tut";

        // cumlede "top" un ilk kullanim index'i
        System.out.println(str.indexOf("top")); // 4

        // cumlede "top" un son kullanim index'i
        System.out.println(str.lastIndexOf("top")); // 4

        /*

            top icin ilk kullanim indexi = 4, son kullanim indexi = 4 ==> 1 kere kullanilmis

            tut icin ilk kullanim indexi = 9, son kullanim indexi = 22 ==> 1'den fazla kullanilmis

            java icin ilk kullanim indexi = -1, son kullanim indexi = -1 ==> yok

         */


        // "ali topu tut, tut ali  ut";
        // tut kelimesinin son kullanim index'i nedir?
        System.out.println(str.lastIndexOf("tut")); // 22

        // tut kelimesinin sondan ikinci kullaniminin index'i nedir?
        System.out.println(str.lastIndexOf("tut", 22)); // 22
        System.out.println(str.lastIndexOf("tut", 21)); // 14

        // tut kelimesinin sondan ucuncu kullaniminin index'i nedir?
        System.out.println(str.lastIndexOf("tut", 13)); // 9

    }
}
