package H05_D17_ArraysClassMethods;

import java.util.Arrays;

public class C06_MultidimensionalArrays {
    public static void main(String[] args) {

        /*
        Arrayler'de herhangi bir yazdirma islemi yapacagimiz zaman
        ne yazdirdigimizi izi bilmeliyiz..
            - eger bir String veya primitive deger yazdiracaksak direkt sout;
            - eger tek katli bir array ise, Arrays.toString(arr[3]);
            - eger multidimensional bir array ise, Arrays.deepToString(arr);
         */

        int[][] arr= {{2,3,7},{3,5},{4},{1,2,3,6,8}};

        System.out.println(arr[0][2]); //7

        System.out.println(arr[3][3]); //6

        System.out.println(arr[1][0]); //3


        //2 katli bir array'de inner array'i yazdirmak icin;

        System.out.println(Arrays.toString(arr[0])); // [2, 3, 7]

        System.out.println(Arrays.toString(arr[2])); // [4]

        //once yazdirmak istedigimiz elementin int mi zoksa array mi oldugunu bilmeliyiz

        System.out.println(arr[3][1]);//2

        System.out.println(Arrays.toString(arr[1]));

        //{{2,3,7},{3,5},{4},{1,2,3,6,8}}

        System.out.println(arr); // [[I@6a5fc7f7

        System.out.println(Arrays.toString(arr)); //[[I@3b6eb2ec, [I@1e643faf, [I@6e8dacdf, [I@7a79be86]

        System.out.println(Arrays.deepToString(arr)); //[[2, 3, 7], [3, 5], [4], [1, 2, 3, 6, 8]]





    }
}
