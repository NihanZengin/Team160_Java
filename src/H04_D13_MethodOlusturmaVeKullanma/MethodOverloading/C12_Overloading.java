package H04_D13_MethodOlusturmaVeKullanma.MethodOverloading;

public class C12_Overloading {

    /*
    Java'da bir class icerisinde ayni isim ve ayni parametrelere sahip
    birden fazla method OLUSTURULAMAZ.

    Java'da AYNI CLASS icerisinde AYNI ISIMDE method olusturmak istersek
    bu methodlarin SIGNATURE'lari farkli olmalidir.

    Method Signature = method adi + parametrelerin data turleri ve dizilisi

    Bir class'da ISMI AYNI ama SIGNATURE farkli methodlar olusturulmasina OVERLOADING denir.

    Ismi farkli olan methodlar icin OVERLOADING'ten soz edilemez.

    Eger method call'daki argumentler icin UYGUN bir method yoksa CTE olusur, Java kodu kirmizi cizer ve kod calismaz.

    Bir method call'in calismasi icin method call'da yazdigimiz argumentler ile method'daki parametreler uyumlu olmalidir
     */

    public static void topla(int sayi1, int sayi2){
        System.out.println("iki int sayinin toplami : "+ (sayi1+sayi2));
    }

    public static void topla(int sayi1, int sayi2 , int sayi3){
        System.out.println("iki int sayinin toplami : "+ (sayi1+sayi2));
    }

    public static void topla(int sayi1){
        System.out.println("iki int sayinin toplami : "+ (sayi1));
    }

    public static void carpim(int sayi1, int sayi2){
        System.out.println("iki int sayinin toplami : "+ (sayi1+sayi2)); //method adi farkliysa oveloading'ten soz edilemez
    }

    public static void topla(double sayi1, int sayi2){
        System.out.println("iki int sayinin toplami : "+ (sayi1+sayi2));
    }
    public static void topla(int sayi1, double sayi2){
        System.out.println("iki int sayinin toplami : "+ (sayi1+sayi2));
    }


}
