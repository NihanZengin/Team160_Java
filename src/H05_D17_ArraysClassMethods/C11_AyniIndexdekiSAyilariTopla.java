package H05_D17_ArraysClassMethods;

import java.util.Arrays;

public class C11_AyniIndexdekiSAyilariTopla {
    public static void main(String[] args) {
        //Iki katli arraydeki ayni indexteki elementleri toplayip yeni olusturdugunuz tek katli arraye atayin

        int [][] arr ={{3,4,5,7,9},{2,3,6,7}};

        int ortakIndexSayisi=arr[0].length<arr[1].length?arr[0].length:arr[1].length;

        int[] ortakIndexdekiSAyilarinToplamiArr= new int[ortakIndexSayisi];

        for (int i = 0; i <ortakIndexdekiSAyilarinToplamiArr.length ; i++) {
            ortakIndexdekiSAyilarinToplamiArr[i]=arr[0][i]+arr[1][i];
        }
        System.out.println(Arrays.toString(ortakIndexdekiSAyilarinToplamiArr));//[5, 7, 11, 14]


    }
}
