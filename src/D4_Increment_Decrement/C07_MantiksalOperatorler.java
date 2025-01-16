package D4_Increment_Decrement;

public class C07_MantiksalOperatorler {
    public static void main(String[] args) {


        // Eger bir degerin verilen aralikta olup olmadigina bakmak istersek
        // && / & operatoru tercih edilir

        int verilenSayi = 190;

        // verilen sayinin 2 basamakli oldugunu kontrol edin

        System.out.println( verilenSayi >= 10  && verilenSayi <=99  ); // false


        // verilen sayinin 100 ile 200 arasinda (sinirlar dahil) oldugunu kontrol edin

        System.out.println( verilenSayi >= 100 & verilenSayi <=200 ); // true



        char verilenHarf = 'k';


        // verilen harfin kucuk harf oldugunu kontrol edin

        System.out.println( verilenHarf >= 'a'  && verilenHarf <= 'z' ); // true


        // verilen harfin a ile k arasinda (sinirlar dahil degil) oldugunu kontrol edin

        System.out.println( verilenHarf > 'a' && verilenHarf < 'k' ); // false





        // Eger bir degerin verilen araligin disinda oldugunu kontrol etmek istersek
        // || operatoru kullanilmalidir

        verilenHarf = 'y';


        // verilen harfin kucuk harf olmadigini kontrol edin

        System.out.println( verilenHarf < 'a' || verilenHarf > 'z'); // false

        // verilen harfin a ile t arasinda (a veya t olabilir) olmadigini kontrol edin

        System.out.println( verilenHarf <= 'a' || verilenHarf>= 't' ); // true



        verilenSayi = 425;

        // verilen sayinin 3 basamakli olmadigini kontrol edin
        System.out.println(  verilenSayi < 100  || verilenSayi > 999    ); // false

        // verilen sayinin 100 ile 200 arasinda (sinirlar dahil) olmadigini kontrol edin

        System.out.println( verilenSayi < 100   || verilenSayi > 200); // true




    }
}
