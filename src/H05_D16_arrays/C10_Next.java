package H05_D16_arrays;

import java.util.Arrays;

public class C10_Next {
    public static void main(String[] args) {
        //Verilen bir array’e istenen bir elemani ekleyip
        // bize donduren bir method yazin, eski array’e yeni degeri atayin

        int[] arr={3,6,9};
        int eklenecekSayi=1;

        arr=arrayElemanEkle(arr,eklenecekSayi);
        System.out.println("arr'in yeni hali : "+Arrays.toString(arr));

        arr = arrayElemanEkle(arr,5);
        arr = arrayElemanEkle(arr,8);
        System.out.println("arr'nin yeni hali : " + Arrays.toString(arr));

    }

    public static int[] arrayElemanEkle(int[] arr, int eklenecekSayi){
        int[] yeniArr= Arrays.copyOf(arr, arr.length+1);
        yeniArr[yeniArr.length-1]=eklenecekSayi;
        arr=yeniArr;
        return arr;
    }
}
