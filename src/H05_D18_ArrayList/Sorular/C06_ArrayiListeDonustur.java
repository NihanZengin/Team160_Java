package H05_D18_ArrayList.Sorular;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C06_ArrayiListeDonustur {
    public static void main(String[] args) {


        int[] arr = {3, 5, 6, 7, 8, 9, 2, 3, 5, 3, 4, 6, 2, 7};

        //arr array'ini bir list olarak kaydedin

        //bos bir list olusturup
        //for loop ile arraydeki elementleri listeye ekleyelim

        List<Integer> sayilar = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            sayilar.add(arr[i]);
        }

        System.out.println("For loop ile olusan liste" + sayilar); //[3, 5, 6, 7, 8, 9, 2, 3, 5, 3, 4, 6, 2, 7]


        // Arrays class'inda bu isi yapan hazir method vardir
        //ANNCAKK bu method'un olumsuz yonleri oldugundan tercih edilmez

        /// 1- liste ekleme cikarma yapamayiz
        /// 2- array'de yapilan degisiklikler listede de olur .

        Integer[] arr1 = {3, 5, 6, 7, 8, 9, 2, 3, 5, 3, 4, 6, 2, 7};
        List<Integer> yeniList= Arrays.asList(arr1);

        System.out.println(yeniList);// [3, 5, 6, 7, 8, 9, 2, 3, 5, 3, 4, 6, 2, 7]
        //yazdirdigimizda sorun yok ancak bu yeni liste eleman eklemek cikarmak istedigimizde sorunla karsilasiriz.

        //yeniList.add(11); //UnsupportedOperationException
       // yeniList.remove(5); //UnsupportedOperationException

        arr1[0]=10;
        arr1[1]=20;

        System.out.println(yeniList); //[10, 20, 6, 7, 8, 9, 2, 3, 5, 3, 4, 6, 2, 7]
        //array'e atama yaptiktan sonra liste de degisiyor

    }

}
