package H07_D21_StaticKeyword;

public class C03_StaticBlock {

     /*
        static blocklar class calismaya baslarken
        herseyden (hattta main method'dan bile) once calisirlar

        Kullanim amaci class calismaya baslamadan ONCE,
        YAPILMASI gereken ayarlamalar VARSA, onlari yapmaktir.

        static block'larin yeri onemli degildir
        en altda da olsa once onlar calisir

        birden fazla static block varsa kendi iclerinde once ustteki calisir
     */
    /*
        static olmayan bloklar
        obje olusturulmadan once yapilacak ayarlamalar icin kullanilir
        her constructor calismasindan once static olmayan block calisir
     */

    C03_StaticBlock(){
        System.out.println("Constructer calisti"); //obje olusturmadigi icin calismaz
    }

    static{
        System.out.println("Staticblock calisti"); // static blok class'daki her seyden HATTA main methoddan bile once calisir.
                                                   //Amaci class calismadan once atama yapilmasi gereken variable veya yapilmasi
                                                   // gereken ayarlamalar varsa yapmaktir. (Database baglantisi yapmak gibi)
    }
    static{
        System.out.println("Staticblock2 calisti");
    }

    public static void main(String[] args) {

        System.out.println("Main method calisti"); // Java ilk main methoddan baslar calismaya
    }

    public static void method1(){
        System.out.println("Method1 calisti");  // method cagirilmadigi icin cagrilmaz
    }

    {
        System.out.println("static olmayan kod blogu calisti");
    }

    //Static olmayan blok ise constructer caliostirilmasi halinde main methoddan sonra constructerdan once calisir

}
