package H05_D16_arrays;

public class C04_ArrayOlusturma {
    public static void main(String[] args) {
        //int arr1={2,5,7,9};
        //sol taraf simdiye kadar kullandigimiz primitive
        // bir varriable olusturur
        //buna birden fazla eleman ATAYAMAYIZ.

        //arr1'in array oldugunu belirtmek icin []

        int[] arr1={2,5,7,9,10};

        int arr2[]={3,5,6};
        /*
        .
        .
        .
         */
        int[] arr3 = {4,5};
        // arr3'un DATA TURU nedir ?
        // arr3 bir array'dir ve Java bunu [] ile anlar
        // int bu array'e konulacak elemanlarin DATA TURUDUR
        // arr3'e int disinda eleman konulamaz

        //arr1'deki ilk elemani yazdirin
        System.out.println(arr1[0]); //2

        //arr1'deki son elemani yazdirin
        System.out.println(arr1[3]); //9

        //arr1'deki son elemani dinamik olarak yazdirin
        System.out.println(arr1[arr1.length-1]); //5

        //array'deki elementlere yeni deger atamak icin

        arr1[0] = 21;
        arr1[3] = 15;
        arr1[4] = 32;


        arr1[5] = 20; //5 elemanli bir array'e 6. elemani atamak olmaz
        //altini sari cizdi ve calistirsak alttaki hatayi verir.
        //.ArrayIndexOutOfBoundsException

        //Array'den eleman silmek de yoktur





    }
}
