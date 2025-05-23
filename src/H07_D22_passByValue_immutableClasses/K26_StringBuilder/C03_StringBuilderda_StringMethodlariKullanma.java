package H07_D22_passByValue_immutableClasses.K26_StringBuilder;

public class C03_StringBuilderda_StringMethodlariKullanma {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java candir");

        // sb "a" icerir mi ?

        /*
            NOT 1 : stringBuilder'da olmayan ama String'de olan method'lari kullanmak isterseniz
                    toString() ile String'e donusturup istedigimiz method'lari kullanabiliriz
         */

        System.out.println(sb.toString().contains("a")); // true


        /*
            NOT 2 : StringBuilder method'larindan return type'i StringBuilder olanlar
                    kalici degisiklik yaparlar
                    AMMA return type'i StringBuilder OLMAYANLAR
                    kalici degisiklik YAPMAZ
         */

        /// substring bize String dondurdugu icin bu method kalici degisiklik yapmaz
        System.out.println(sb.substring(0, 4)); // Java

        System.out.println(sb); // Java candir

        System.out.println(sb.length()); // 11

        System.out.println(sb); // Java candir

    }
}
