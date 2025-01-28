package H03_D08_StringManipulation;

public class C09_startsWith {
    public static void main(String[] args) {

        String str = "Java gun gectikce guzellesiyor";

        System.out.println(str.startsWith("Jav")); // Jav --> 3 harf  // metnin ilk 3 harfi Jav mi diye bakiyor. true
        System.out.println(str.startsWith("Java gu")); // Jav --> 7 harf  // metnin ilk 7 harfi Java gu mi diye bakiyor. true

        System.out.println(str.startsWith("java")); // java --> 4 harf  // metnin ilk 4 harfi java mi diye bakiyor. false


        /**
         * Iki parametreli bir startWith kullanirsak,
         * Ikinci parametre kacinci index'ten baslayacagimizi gosterir.
         * ve bu index ilk parametredeki kelime ile mi baslayip baslamadigini boolean olarak doner.
         *
         * */

        System.out.println(str.startsWith("gun" , 5));
        // burada soru su: 5. index ve sonrasi "gun gectikce guzellesiyor" kismi "gun ile mi basliyor?" --> true

        System.out.println(str.startsWith(" ",8)); // " gectikce guzellesiyor" ==> true

        System.out.println(str.startsWith("a", 10)); // "ectikce guzellesiyor" ==> false





    }
}
