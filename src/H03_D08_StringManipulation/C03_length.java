package H03_D08_StringManipulation;

public class C03_length {
    public static void main(String[] args) {

        String str="Ali Uzunkavaklaraltindayataruyumazoglu";

        //metnin son karakterini yazdirin

        System.out.println(str.length()); //38

        System.out.println(str.charAt(37)); // u

        //bu kod calisir ama dinamik olmaz
        //yani str'de degisiklik olursa , hatali bir sonuc verebilir
        //Kodu dinamik yapmak demek,
        //bize verilen input ne olursa olsun, kodun dogru sonuc vermesidir.


        // 37 ==> 38 -1 ==> str.length()-1
        System.out.println(str.charAt(str.length()-1)); // u


        // sondan 5.karakteri yazdirin

        System.out.println(str.charAt(str.length()-5)); // z



    }
}
