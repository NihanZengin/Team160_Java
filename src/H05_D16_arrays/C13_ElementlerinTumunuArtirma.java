package H05_D16_arrays;

import java.util.Arrays;

public class C13_ElementlerinTumunuArtirma {
    public static void main(String[] args) {
        //Verilen bir Array'in tum elemanlarini 2 artirin

        int[] arr={3,7,0,2,4,6};

        for (int i = 0; i < arr.length; i++) {
            arr[i]=arr[i]+2;
        }
        System.out.println("elemanlarin 2 artirilmis hali: " + Arrays.toString(arr));
        //elemanlarin 2 artirilmis hali: [5, 9, 2, 4, 6, 8]
    }
}
