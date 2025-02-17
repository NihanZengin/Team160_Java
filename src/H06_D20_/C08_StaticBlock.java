package H06_D20_;

public class C08_StaticBlock {

    C08_StaticBlock(){
        System.out.println("Constructer calisti"); //obje olusturmadigi icin calismaz
    }

    static{
        System.out.println("Staticblock calisti"); // static blok class'daki her seyden HATTA main methoddan bile once calisir.
                                                   //Amaci class calismadan once atama yapilmasi gereken variable veya yapilmasi
                                                   // gereken ayarlamalar varsa yapmaktir. (Database baglantisi yapmak gibi)
    }

    public static void main(String[] args) {

        System.out.println("Main method calisti"); // Java ilk main methoddan baslar calismaya
    }

    public static void method1(){
        System.out.println("Method1 calisti");  // method cagirilmadigi icin cagrilmaz
    }
}
