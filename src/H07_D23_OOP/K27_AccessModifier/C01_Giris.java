package H07_D23_OOP.K27_AccessModifier;

public class C01_Giris {
    /*
    Class level'da olusturulan HER variable ve HER method'un MUTLAKA access modifier'i vardir.

    java'da 4 access modifier vardir
    en dardan genise dogru
    1- private                      --> class'in ozeli, disardan kimse ulasamaz
    2- default access modifier      --> sadece icinde bulundugu package
    3- protected                    --> (aile) default'a ek olarak baska package'daki child class'lar da ulasir
    4- public                       --> halka acik

    *  default access modifier GORUNUR OLMAZ. Eger gorunur olarak digerlerinin ismi yazilmadiysa
    Java otomatik olarak default access modifier olarak kabul eder.
     */


    String isim; // default degeri null
    public int sayi; // default degeri 0
    /// DEFAULT KELIMESINI jAVA'DA 4 fARKLI TERIM OLARAK KULLANDIK
    /// 1- Swich Case'lerin sonunda default ile hicbir case'e girmeyenleri belirtiyorduk
    /// 2- Class level variable'lar deger atanmadiysa Java default deger atar demistik
    /// 3- Bir Class'da constructer olusturulmamissa gorunmez bir Default Constructer vardir demistik
    /// 4- Default Access Modifier



    private double dbl;
    //default int sayi2; // default yazilmaz. Digerleri yazilmadiginda defaulttur.
    protected short shrt;
    public static boolean guzelMi;


    public static void main(String[] args) {

    }
    public static void method1(){};

    static void method2(){};

    void method3(){};

}
