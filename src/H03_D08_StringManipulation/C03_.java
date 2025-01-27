package H03_D08_StringManipulation;

public class C03_ {
    public static void main(String[] args) {

        String str="Ali Uzunkavaklaraltindayataruyumazoglu";

        //metnin son karakterini yazdirin

        System.out.println(str.length()); //38

        System.out.println(str.charAt(37)); // u

        //bu kod calisir ama dinamik olmaz
        //yani str'de degisiklik olursa , hatali bir sonuc verebilir
        //Kodu dinamik yapmak demek,
        //bize verilen input ne olursa olsun, kodun dogru sonuc vermesidir.


        System.out.println(str.charAt(str.length()-1)); // u



    }
}
