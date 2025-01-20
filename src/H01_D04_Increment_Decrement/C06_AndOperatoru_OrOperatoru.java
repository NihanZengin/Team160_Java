package H01_D04_Increment_Decrement;

public class C06_AndOperatoru_OrOperatoru {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        // && Operatoru : Eger sonuca odakli bir islem yapiyorsak
        // ilk false bulundugunda genel sonuc false olacagindan
        // geriye kalan islemleri yapmaya gerek KALMAZ
        // boylece islem HIZLI yapilmis olur

        boolean genelSonuc1 = a>=b     &&   a<b     &&      a>b-8 ; // ilk false gordugunde devamina bakmaz

        System.out.println(genelSonuc1); //false


        boolean genelSonuc2 = a>=b     &   a<b     &      a>b-8 ;// tum hepsini kontrol eder

        System.out.println(genelSonuc2); // false



        // bazen 2. ve 3.islemlerde atamalar olabilir
        // eger o islemler yapilmazsa atamalar da yapilmamis olur
        // bu durumda sonuc yine false olsa da
        // tum islemlerin yapilmasini isteriz
        // bunun icin & kullanmayi tercih ederiz


        boolean sonuc1=true;
        boolean sonuc2=true;
        boolean sonuc3=true;

        boolean genelSonuc =  (sonuc1= a>=b)     &  (sonuc2 = a<b)     &      (sonuc3=a>b-8) ;// false & true & false

        System.out.println(genelSonuc); // false
        System.out.println(sonuc1); // false
        System.out.println(sonuc2); // true
        System.out.println(sonuc3); // false




        boolean sonuc4=true;
        boolean sonuc5=true;
        boolean sonuc6=true;

        boolean genelSonuc3 =  (sonuc4= a>=b)     &&  (sonuc5 = a<b)     &&      (sonuc6=a>b-8) ;// false && XXX

        System.out.println(genelSonuc3); // false
        System.out.println(sonuc4); // false
        System.out.println(sonuc5); // atama olmadi eski deger true
        System.out.println(sonuc6); // atama olmadi eski deger true

    //Or (veya ) Operatoru ||
        //Birlestirdigi iki boolean ifadenin ikisi de false ise sonuc false olur diger her durumda sonuc true doner.

        a=10;
        b=15;

        System.out.println(a>b || b>0);// true

        System.out.println(a<=b-5 || a>b-8); // true

        boolean d;

        System.out.println(d=15>=b || a<0);// true

        d= a>=b || 3*a<4*b;

        System.out.println(d); // true

    }
}
