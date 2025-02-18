package H06_D20_Constructor.Giris;

public class C06_Araba {


        String marka = "marka atanmamis";
        String model = "model atanmamis";
        String renk = "renk atanmamis";
        int yil = 1900;
        int fiyat;

        C06_Araba(){

        }

        /*
        bir kod blogunun constructor olmasi icin
        MUTLAKA 2 sarti karsilamasi gerekir
            1- ismi class ismi ile ayni olmalidir
            (buyuk harfle baslar)
            2- return type olmamalidir
         */

        public static void method1(){}

        public static int maxHiz(String marka, String model, int yil, String yakitTuru){
                int maxHiz=140;
                return maxHiz;
        }

        /*

         */
        public  void C06_Araba(){} //Method ismini Class ismi ile ayni yaparsak
                                   // Java bunu sari cizer
         ///Method name 'C06_Araba' is the same as its class name

        /*
        method isimleri ortak kabul olarak
                - kucuk harfle baslar
                -ismi class ismi ile ayni olmaz

        ANNCAAKKK
                ismi buyuk harfle baslarsa,
                hatta class ismi ile de ayni olursa
                Java altini kirmizi cizmez,
                sadece uygun bir isimlendirme olmadigini gostermek icin
                sari hale getirir.

         */

      //public c06_Araba(){}

        /*
        52 deki kod blogu Constructor OLAMAZ --> cunku ismi class ismi ile ayni degil
                            method da olamaz --> return type yok
        Java buna izin vermez CTE olusur, kod calismaz
         */

}
