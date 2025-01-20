package H01_D03_DataCasting_WrapperClass;

public class C09_Concatenation {
    public static void main(String[] args) {

        // Bir String ile herhangi bir primitive data turundeki degeri + toplarsak
        // Java String'in yanina geleni de String'lestirir

        System.out.println( "Java" + 4);  // "Java4"

        System.out.println( "Java" + 4 + 5); // "Java4" + 5 ==> Java45

        System.out.println( 4 + 5 + "Java"); // 9 + "Java" ==> "9Java"

        System.out.println( "Java" + 4 * 5 ); // "Java" + 20 ==> "Java20"


        // String'de + islemi CONCATENATION (birlestirme) demektir
        // + disinda hicbir matematiksel islem String ile kullanilamaz

//        System.out.println( "Java" * 5); // Operator '*' cannot be applied to String
//        System.out.println( "Java" - 3);
//        System.out.println( "Java" / 5);

        System.out.println("A" + true + 'd' + 45.6 + 34.5F); // Atrued45.634.5

        System.out.println(3 + 'a' + "Ali"); //100Ali

        /// Soru1: 3 ve 4 kullanarak 34 yazdirin
        System.out.println(3+ ""+4); //Hiclik kullanarak String hale getirmis olduk.


        // Sadece verilen variable'lari kullanarak
        // istenen String'leri yazdirin

        String s1 = "Java";
        String s2 = " ";
        String s3 = "Candir";
        String s4 = "";

        int a = 3;
        int b = 4;

        // 12 Java Candir
        System.out.println( a*b+s2+s1+s2+s3); // 12 Java Candir

        // 7 Java
        System.out.println( a+b+s2+s1); // 7 Java

        // 34 Candir
        // 3 ve 4'un toplama yerine birlestirilmesini istiyor
        // birlestirme olmasi icin bu sayilari String'lestirmeliyiz

        System.out.println( a + b + s2 + s3); // 7 Candir
        System.out.println( a +s2+ b + s2 + s3); // "3 " + 4 ==> 3 4 Candir
        System.out.println( a +s4+ b + s2 + s3); // 34 Candir

        // Java7

        System.out.println(s1 + (a+b));



        String str3 = 5 + "";

        String str4 = "" + true;

        String str5 = 's' + "";

        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str5);

    }
}
