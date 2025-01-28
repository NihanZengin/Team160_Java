package H03_D08_StringManipulation;

public class C04_equals {
    public static void main(String[] args) {

        char chr1= 'a';
        char chr2= 'b';

        //chr1 ve chr2 esitse "ayni karakter",
        //esit degillerse "farkli karakter" yazdirin

        if(chr1==chr2){
            System.out.println("ayni karakter");
        }else System.out.println("farkli karakter");

        int sayi1= 20;
        int sayi2= 30;

        //sayi1 ve sayi2 esitse "ayni sayi",
        //esit degillerse "farkli sayi" yazdirin

        if(sayi1==sayi2){
            System.out.println("ayni sayi");
        }else System.out.println("farkli sayi");


        String str1= "Ali";
        String str2= "Ali";
        String str3= new String("Ali");

        //str1 ve str2 esitse "ayni metin",
        //esit degillerse "farkli metin" yazdirin

        if(str1==str2){
            System.out.println("ayni metin");
        }else System.out.println("farkli metin");

        if(str1==str3){
            System.out.println("ayni metin");
        }else System.out.println("farkli metin");

        /** Genel olarak String'lerde metinleri karsilastirmak istedigimizde == (double equal sign) kullanmayiz
         *
         * Cunku == (double equal sign) hem METIN DEGERINE hem de REFERANSA bakar ve
         * metinler birebir ayni da olsa, yukaridaki son ornekte oldugu gibi
         * bazen false verme durumu olabilir.
         */


        String str4 = "Not";
        String str5 = "Not";
        String str6 = new String("Not");
        String str7 = "No"+"t";
        String s = "No";
        String t = "t";
        String str8 = s+ t;
        String k = "n";
        String str9 = k.toUpperCase()+"ot";


        System.out.println(str4 == str5); // Not == Not ==> true
        System.out.println(str4 == str6); /** Not == Not ==> false  --> DIKKAT: burada kelimeler ayni oldugu halde false verdi.
                                          Cunku == (double equal sign) hem METIN DEGERINE hem de REFERANSA bakar */
        System.out.println(str4 == str7); // Not == Not ==> true
        System.out.println(str4 == str8); // Not == Not ==> false
        System.out.println(str4 == str9); // Not == Not ==> false
        System.out.println(str4 == "Not");// Not == Not ==> true

        System.out.println("_______________________________________________________________");

        System.out.println(str4.equals(str5));      /*Goruldugu uzere ayni kelimeler burada hepsi true verdi*/
        System.out.println(str4.equals(str6));
        System.out.println(str4.equals(str7));
        System.out.println(str4.equals(str8));
        System.out.println(str4.equals(str9));
        System.out.println(str4.equals("Not"));

        //equals() sadece METNE odaklanir , metin BIREBIR ayni ise true verir

        System.out.println("_______________________________________________________________");

        // equals() sadece metne odaklanir, metin birebir ayni ise true verir
        // karakter farkliligi, buyuk kucuk harf farkliligi  varsa false olur
        System.out.println(str4.equals("NOt"));
        System.out.println(str4.equals("NOT"));
        System.out.println(str4.equals("Not"));
        System.out.println(str4.equals("Not "));










    }
}
