package H05_D17_ArraysClassMethods;

import java.util.Arrays;

public class C04_Next {
    public static void main(String[] args) {
//sayilar array'ina 8 ekle
        int[] sayilar={3,5,6,2,1};

        sayilar=arrayElemanEkle(sayilar,8);
        System.out.println(Arrays.toString(sayilar));
    }
    public static int[] arrayElemanEkle(int[] arr, int eklenecekSayi){
        int[] yeniArr =new int[arr.length+1]; //[0,0,0,0,0,0,]


        for (int i = 0; i < arr.length; i++) {
            yeniArr[i]=arr[i];
        }
        yeniArr[yeniArr.length-1]=eklenecekSayi;

        arr= yeniArr;

        return arr;

    }
}
