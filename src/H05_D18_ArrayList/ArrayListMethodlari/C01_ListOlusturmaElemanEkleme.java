package H05_D18_ArrayList.ArrayListMethodlari;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_ListOlusturmaElemanEkleme {
    public static void main(String[] args) {

        //Icinde String elemanlar olan bir ArrayList olusturun

        String[]arr= {"ali", "veli"}; //arr'nin data turu Array'dir
                                      //String array iicine konulacak elementlerin data turu

        //List<String> isimler = new List<>();
        //'List' ist abstract; cannot be instantiated
        //List soyut bir yapi oldugundan obje olusturulamaz

        List<String> isimler =new ArrayList<>();
        List<String> isimler1=new ArrayList<String>();
        ArrayList<String>isimler2=new ArrayList<>();

        System.out.println(isimler1); //[]

        //icine int elementler koyabileceginiz sayilar isminde bir ArrayList olusturun.

        List<Integer> sayilar = new ArrayList<>();

        //Type argument cannot be of primitive type
        // icine konulaak elementlerin data turu primitive OLAMAZ

        //Listeye 3,6,8,9 ekleyin
       // List<Integer> sayilar1={3,6,8,9}; boyle ekleyemeyiz

        sayilar.add(3);
        sayilar.add(6);
        sayilar.add(8);
        sayilar.add(9);

        System.out.println(sayilar);

        //3.Indexe 2ekleyin
        sayilar.add(3,2);

        System.out.println(sayilar);//[3, 6, 8, 2, 9]

        //element olarak 3,4,5,6,2,3,4,2,3,4,5,4,7,8,9 bulunduran bir arrayList olusturun

        List<Integer> yeniList =new ArrayList<>(Arrays.asList(3,4,5,6,2,3,4,2,3,4,5,4,7,8,9));

        System.out.println(yeniList);

        /*
        eger tum elemanlari birden eklemek istiyorsak
        Arrays class'indan asList() ile yapabiliriz
         */

        //icinde 10,20,30 olan yeni bir liste olusturun

        List<Integer> ekList=new ArrayList<>(Arrays.asList(10,20,30));

        System.out.println(ekList);//[10, 20, 30]

        //yukarda olusturdugumuz sayilar listesine yeni listenin tamamini ekleyin

        sayilar.addAll(ekList); //index soylemeyince en sonuna ekleriz

        System.out.println(sayilar); //[3, 6, 8, 2, 9, 10, 20, 30]

        sayilar.addAll(2,ekList);

        System.out.println(sayilar); //[3, 6, 10, 20, 30, 8, 2, 9, 10, 20, 30]

        /*
        String'de method ile yapilan degisiklikler
        atama olmazsa kalici degisiklik OLMAZ

        ama Array ve ArrayList icin method ile yapilan degisiklikler KALICI olur
        atama yapmaya gerek kalmaz.
         */


    }
}
