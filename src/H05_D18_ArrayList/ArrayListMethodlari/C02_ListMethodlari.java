package H05_D18_ArrayList.ArrayListMethodlari;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class C02_ListMethodlari {
    public static void main(String[] args) {
        List<Integer> sayilar =new ArrayList<>(Arrays.asList(5,7,2,9,1,2,5,9,3));

        //listede kac eleman oldugunu yazdirin
        System.out.println(sayilar.size()); //9

        //listede element olarak 7'nin olup olmadigini yazdirin
        System.out.println(sayilar.contains(7));//true
        System.out.println(sayilar.contains(10));//false

        //listede varsa 2'nin ilk indexini yazdirin
        System.out.println(sayilar.indexOf(2));//2

        //listede varsa 2'nin son indexini yazdirin
        System.out.println(sayilar.lastIndexOf(2)); //5

        //listede olmayan bir elemanda ise;
        System.out.println(sayilar.indexOf(11)); //-1
        System.out.println(sayilar.lastIndexOf(11)); //-1

        //listede 2 icin asagidaki cumlelerden uygun olani yazdirin
                // listede 2 yok
                // listede  sadece bir tane var
                // listede 2 birden fazla var

        if (sayilar.indexOf(2)==-1){
            System.out.println("listede 2 yok");
        }
        else if (sayilar.indexOf(2)==sayilar.lastIndexOf(2)){
            System.out.println("listede  sadece bir tane var");
        }
        else System.out.println("listede 2 birden fazla var");


        //listedeki tum elementlerin natural order'a uygun olarak siralayin

        Collections.sort(sayilar);

        System.out.println(sayilar);//[1, 2, 2, 3, 5, 5, 7, 9, 9]

        //listedeki tum elementleri silin
        sayilar.clear();

        System.out.println(sayilar);//[]


    }
}
