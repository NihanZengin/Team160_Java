package H05_D18_ArrayList.ArrayListMethodlari;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_IstenenElementiKullanma {
    public static void main(String[] args) {
        int [] arr={3,5,6,8,1};

        //arr'deki tum elementleri toplayin

        int toplam=0;

        for (int i = 0; i < arr.length; i++) {

            toplam+=arr[i];
        }
        System.out.println("Array'deki elementlerin toplami : "+toplam); //23

        List<Integer> sayilar = new ArrayList<>(Arrays.asList(3,6,8,1,4,0));

        //sayilar listesinin 2. index'indeki sayiyi yazdirin

        System.out.println(sayilar.get(2));//8
        System.out.println(sayilar.get(0));//3
        System.out.println(sayilar.get(5));//0
        //System.out.println(sayilar.get(10));//.IndexOutOfBoundsException

        //sayilar listesindeki tum elementleri toplayin
        toplam=0;

        for (int i = 0; i < sayilar.size(); i++) {
            toplam+=sayilar.get(i);

        }
        System.out.println("sayilar listesindeki elementlerin toplami : "+toplam);//22

        System.out.println(sayilar); //[3, 6, 8, 1, 4, 0]

        //2. index'deki elementi 5 yapin

        sayilar.set(2,5);
        System.out.println(sayilar);//[3, 6, 5, 1, 4, 0]

        //4.index'deki elementi yazdirin

        System.out.println(sayilar.get(4));

        //4. index'deki sayiya 23 ekleyin

        sayilar.add(4,23);
    }
}
