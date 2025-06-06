package H03_D08_StringManipulation;

public class C07_substring_ikiParametre {
    public static void main(String[] args) {

       String str = "Java gercekten cok guzel";

        System.out.println(str.substring(1,3)); //av

        /**Java da genel bir kural olarak baslangic indexleri DAHIL(INCLUSIVE),
         * bitis indexleri HARIC(EXCLUSIVE) olur*/

        System.out.println(str.substring(2,7)); // va ge

        //Bastan 6 karakteri yazdirin
        System.out.println(str.substring(0,6));  // Java g


        System.out.println(str.substring(5,6)); // g 'substring()' call can be replaced with 'charAt()
                                                // aynisini charAt ile de yapabilirdin demis bana.

        System.out.println(str.substring(0,1)); // J

        //11. harfi buyuk harf olarak yazdirin
        System.out.println(str.substring(10,11).toUpperCase()); // K

        System.out.println(str.toUpperCase().charAt(10)); //K //Normalde charAt() String ifadeyi char'a donusturdugu icin
                                                                // ondan sonra tuUpperCase yapamadik ama boyle onune yazinca
                                                            // once tum Stringi buyuk harf yapip sonra istedigimiz indexi cagirinca oldu

        /*
            Bazen bir karakteri alip o karakteri alip
            o karakteri String Manipulation ile kullanmak isteriz

            charAt() bize char bir sonuc getirdiginden charAt'dan sonra String Manipulation yapilamayacagi icin
             subString() ile tek bir harfi almayi tercih edebiliriz.
        * */

        System.out.println(str.substring(5,5)); // hiclik yazdirir
        //Ilk index g'den basla der, 2. index g dahil olmayacak der --> geriye hiclik kalir

        //System.out.println(str.substring(8,5)); //sinirin disinda hatasi
        //Exception in thread "main" java.lang.StringIndexOutOfBoundsException: begin 8, end 5, length 24

        // System.out.println(str.substring(10,40));
        // The call to 'substring' always fails as an argument is out of bounds
        // Exception in thread "main" java.lang.StringIndexOutOfBoundsException: begin 10, end 40, length 24





    }
}
