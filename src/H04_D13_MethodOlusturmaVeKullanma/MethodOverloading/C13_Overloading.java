package H04_D13_MethodOlusturmaVeKullanma.MethodOverloading;

public class C13_Overloading {
    public static void main(String[] args) {

        topla(5,6); //Iki int'in toplami : 11

        topla(5.3,6.6); //Iki double'in toplami : 11.899999999999999

        topla(2.6,5); // AutoWidening yapar ve int'i Casting yapar ve double olarak kabul eder

        topla('a', 6); //Iki int'in toplami : 103

        /*
        Java method call'daki signature'a %100 uyumlu olan method bulamazsa
         auto-widening kullanarak calistirabilecegi method var mi diye kontrol eder ve varsa calistirir.
         */
    }
    public static void topla (int a, int b){
        System.out.println("Iki int'in toplami : "+(a+b));
    }

    public static void topla (double a, double b){
        System.out.println("Iki double'in toplami : "+(a+b));
    }


}
