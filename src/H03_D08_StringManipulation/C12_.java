package H03_D08_StringManipulation;

public class C12_ {
    public static void main(String[] args) {
        /// strinye MAIL=S  CAMER
        ///
        String str = "Java zamanla guzellesir";

        System.out.println(str.contains("a")); //true
        System.out.println(str.startsWith("a"));//false
        System.out.println(str.endsWith("a")); //false

        //peki bu "a" nerde

        System.out.println(str.indexOf("a")); //1 buldugu ilk a'nin indezini getirir
        System.out.println(str.indexOf("v")); //2

        System.out.println(str.indexOf("aman")); // 6

        System.out.println(str.indexOf("la gu")); //10

        // istenirse belirlenen index'den sonra da arama yapilabilir


    }
}
