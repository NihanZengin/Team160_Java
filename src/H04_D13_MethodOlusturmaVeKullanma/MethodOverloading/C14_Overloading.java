package H04_D13_MethodOlusturmaVeKullanma.MethodOverloading;

public class C14_Overloading {
    public static void main(String[] args) {

       /*
       Eger kullanilan argumanlar icinde auto-widening kullanarak calistirilabilecek birden fazla method varsa,
       java en az casting yapani tercih eder.
        */
        topla(5); //Tek integer: 5

        topla(2.3,3.5); // double  double: 5.8

        topla(2.4,'b'); //  double  integer: 100.4


    }

    public static void topla(int sayi){
        System.out.println("Tek integer: "+sayi);
    }

    public static void topla(int a, int b){
        System.out.println("integer integer: "+(a+b));
    }

    public static void topla(double c, int  d){
        System.out.println(" double  integer: "+(c+d));
    }

    public static void topla(float c, int d){
        System.out.println(" float integer: "+(c+d));
    }

    public static void topla(double c, double d){
        System.out.println("double double: "+(c+d));
    }

}
