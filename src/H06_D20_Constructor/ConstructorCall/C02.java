package H06_D20_Constructor.ConstructorCall;

public class C02 {

    /*
    Bir class'da signature'lari farkli olmak sartiyla birden fazla constructor olabilir

    Ayni sekilde signature'lari farkli olmak sartiyla ayni isimde birden fazla method olabilir

    Method isimleri icin genel kural : kucuk harfle baslar ve class ismi ile ayni olmaz
    ancak class ismi ile ayni olsa da java CTE vermez
     */

    C02() {
        System.out.println("parametresiz constructor calisti");
    }

    C02(int a) {
        System.out.println("int parametreli constructor calisti");
    }

    C02(String b) {
        System.out.println("String parametreli constructor calisti");
    }

    C02(boolean bl) {
        System.out.println("boolean parametreli constructor calisti");
    }

    void C02() {//Method name 'C02' is the same as its class name
        System.out.println("parametresiz method calisti");
        C02(3);
    }

    void C02(int sayi) {
        System.out.println("int parametreli  method calisti");
    }

    void C02(String str) {
        System.out.println("String parametreli method calisti");
    }


    public static void main(String[] args) {
        C02 obj = new C02(); // parametresiz constructor calisti
        // new gorunce direk constructer der

        obj.C02(); //parametresiz method calisti
        // new kullanilmadiginda bunu direk method olarak algilar
    }


    public void method1() {
        System.out.println("method1 calisti"); // method1 calisti
        new C02(3); // int parametreli constructor calisti

        C02("Ali"); // String parametreli method calisti

        // C02(true);  // direkt method call olarak algilar ve
        // boolean parametreli method olmadigindan CTE verir

        /*
            Bir class icersisinde new C02();  kullanildiginda
            Java bunun constructor olacagini bilir


            new keyword olmadan C02();
            method call olur
         */

    }
}
