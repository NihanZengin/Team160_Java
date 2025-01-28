package H03_D08_StringManipulation;

public class C06_substring {
    public static void main(String[] args) {

        String str = "Java Candir";

        //Metnin belirli bir kismini almak icin substring kullanilir
        //sub alt anlamina gelir ve bu metnin bir alt metni anlamindadir.

        System.out.println(str.substring(2)); //va Candir

        // 2. karakterden baslayacak, end index olmadigi icin sona kadar yazdirir.

        System.out.println(str.substring(10)); // r //son indexi yazdirir

        System.out.println(str.substring(11)); // bos bir satir birakti yani hicligi yazdiriyor
        System.out.println(str.substring(str.length())); // son index numarasinin bir fazlasini verdigi icin bu da ayni hicligi yazdirir.
        //  System.out.println(str.charAt(11)); // burda hata veriyordu hatirlayin.
        //  System.out.println(str.substring(12)); // burada da ayni hatayi aliriz. Hiclikten sonra sinirin disina cikmis olduk.

        //son uc karakteri yazdirin
        // 8'i manuel hesaplamak yerine sondan 3.karakterin index'i olarak str.length() -3

        System.out.println(str.substring(str.length()-3)); //dir

        // son 5 karakteri yazdirin

        System.out.println(str.substring( str.length()-5  )); // andir
    }
}
