package H05_D18_ArrayList.ArrayListMethodlari;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_Remove {
    public static void main(String[] args) {
        List<Integer> sayilar=new ArrayList<>(Arrays.asList(4,6,1,9,3));

        List<String> isimler=new ArrayList<>(Arrays.asList("Ali","Veli", "Cemil","Ayse","Fatma","Hatice"));

        //isimler listesinden Ali'yi silin

        isimler.remove("Ali");

        System.out.println(isimler); //[Veli, Cemil, Ayse, Fatma, Hatice]



        //isimler listesindeki 2. elementi silin

        isimler.remove(1);

        System.out.println(isimler); //[Veli, Ayse, Fatma, Hatice]



        //sayilar listesindeki 2. elementi silin

        sayilar.remove(1);

        System.out.println(sayilar);//[4, 1, 9, 3]



        //sayilar listesinden 9'u silin

        Integer silinecek=9;

        sayilar.remove(silinecek);

        System.out.println(sayilar);//[4, 1, 3]


        /*
        String bir listeden hem silmek istedigim elemani yazarak , hem de istersem sadece indexini vererek silebilirim.
        ANCAK Integer bir listeden sadece indexini verebilirim. direkt istedigim elemani silmek icin;
         once bir silinecek objesi olusturup bu objeyi sil diyebilirim.
         */


    }
}
