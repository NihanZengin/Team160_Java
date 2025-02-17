package H05_D18_ArrayList.ArrayListMethodlari;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C06_SonucVsReturn {
    public static void main(String[] args) {

        List<Integer> sayilar=new ArrayList<>(Arrays.asList(4,6,1,9,3));

        List<String> isimler= new ArrayList<>(Arrays.asList("Ali", "Veli" , "Cemil", "Ayse", "Fatma" ,"Hatice"));


        //sayilar listesindeki 2. index'deki elementi 5 yapin

        System.out.println(sayilar.set(2, 5));//1

        System.out.println(sayilar);//[4, 6, 5, 9, 3]

        /**
         * asil is 2. index'deki elementi 5 yapmak
         * asil isini yapti, delil olarak da eski elementi getirdi*/


        //isimler listesinden Ali silin

        System.out.println(isimler.remove("Ali"));// true

        System.out.println(isimler);

        //isimler listesinde olmayan Mert silmeye calisirsak

        System.out.println(isimler.remove("Mert"));//false

        System.out.println(isimler);


        //2. index'deki elementi silin
        System.out.println(isimler.remove(2)); //Ayse

        //sayilardaki 2. index'i silin

        System.out.println(sayilar.remove(2));//5

        Integer silinecek=9;
        System.out.println(sayilar.remove(silinecek));//true


    }
}
