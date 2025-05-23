package H07_D23_OOP.K29_Inheritance.D04_classUyeleriniKullanma;

public class C02_Child extends C01_Parent {
/*
    Java bir variable'in degerini bulmak icin
     - once bulundugu scope'a bakar
     - scope'da yoksa class level'a bakar
     - class level'da da yoksa parent class(lar)'a bakar
     ve ilk buldugu degeri (en guncel degeri) kullanir

     this. ve super. kullanildi ise
     Java aramaya baslama noktasini degistirir
     this. denilmisse aramaya class level'dan,
     super. denilmisse aramaya parent class'dan baslar
     ve ilk buldugunu kullanir

     Java aramaya basladiktan sonra hep yukari dogru cikar
     bulursa kullanir bulamazsa CTE verir (geriye donuk arama yapmaz)
 */
String str = "Child class";
    String t = "Hamza";
    String k = "Ahmet";

    public void method2(){
        System.out.println("Child method2");
    }
    public void method4(){
        System.out.println("Child method4");
    }

    public static void main(String[] args) {
        C02_Child obj = new C02_Child();
        obj.method1();
    }

    public void method1(){

        String str = "Child class method str";
        String t = "Cansu";
        String z = "Oguzhan";

        System.out.println(s); // Anil                     ==> scope'ta (icinde bulundugumuz method1) yok
                                                              // ClassLevel'da yok
                                                              // Parent'da var
        System.out.println(this.s); // Anil                ==> once direk classLevel'a bakar yok. Parentta var
        System.out.println(super.s);// Anil                ==> once direk parent'a bakar

        System.out.println(str); // Child Class method str ==> scope'ta var
        System.out.println(this.str); // Child class       ==> once direk classLevel'a bakar yok. ClassLevel'da var
        System.out.println(super.str); // Java candir      ==> once direk parent'a bakar, onu alir

        System.out.println(t); // Cansu                    ==> scope'ta var
        System.out.println(this.t); // Hamza               ==> once direk classLevel'a bakar yok.
        //System.out.println(super.t); //CTE               ==>Parent class'da yok CTE

        System.out.println(z); // Oguzhan
        //System.out.println(this.z); // class level'da ve parent'da yok CTE
        // System.out.println(super.z); // parent'da yok CTE

        System.out.println(k); // Ahmet
        System.out.println(this.k);  // Ahmet
        // System.out.println(super.k); // parent'da yok CTE

        method2(); // Child method2
        super.method2(); // Parent method2
        this.method2(); // Child method2

        method3(); // Parent method3
        super.method3(); // Parent method3
        this.method3(); // Parent method3

        method4(); // Child method4
        // super.method4(); // parent'da yok CTE
        this.method4(); // Child method4


    }
}
