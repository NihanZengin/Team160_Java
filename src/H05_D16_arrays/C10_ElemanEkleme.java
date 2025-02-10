package H05_D16_arrays;

import java.util.Arrays;

public class C10_ElemanEkleme {
    public static void main(String[] args) {

        //Verilen bir array’e istenen bir elemani ekleyip yazdirin

        int[] arr={3,6,9};
        int eklenecekSayi=1;

       // int[] yeniArr= new int[arr.length+1]; //[0, 0, 0, 0]

        int[] yeniArr= Arrays.copyOf(arr, arr.length+1);
        yeniArr[yeniArr.length-1]=eklenecekSayi;

        System.out.println("yeni arr: "+Arrays.toString(yeniArr));
        System.out.println("eski arr: "+Arrays.toString(arr));

        //eski array'in yeni arr olarak hazirladigimiz
        // degere sahip olmasi icin atama yapabiliriz
        arr=yeniArr;
        System.out.println("arr yeni hali: "+Arrays.toString(arr));


    }


}
