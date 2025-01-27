package H03_D08_StringManipulation;

public class C06_ {
    public static void main(String[] args) {

        String str = "Java Candir";

        //Metnin belirli bir kismini almak icin substring kullanilir
        //sub alt anlamina gelir ve bu metnin bir alt metni anlamindadir.

        System.out.println(str.substring(2)); //va Candir

        // 2. karakterden baslayacak, end index olmadigi icin sona kadar yazdirir.

        System.out.println(str.substring(10)); // r //son indexi yazdirir

        System.out.println(str.substring(11)); // bos bir satir birakti yani hicligi yazdiriyor
        System.out.println(str.substring(str.length()));
        //  System.out.println(str.charAt(11)); // burda hata veriyordu
        //  System.out.println(str.substring(12)); // burada da ayni hatayi aliriz

        //son uc karakteri yazdirin

        System.out.println(str.substring(str.length()-3)); //dir
    }
}
