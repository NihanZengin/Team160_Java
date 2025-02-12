package H05_D16_arrays;

import java.util.Arrays;

public class C13_Next {
    public static void main(String[] args) {


        //bunu method olarak nasil yaparim
        //Verilen bir Array'in tum elemanlarini 2 artirin

        int[] arr = {3, 7, 0, 2, 4, 6};
        elemanalriArtir(arr ,2); //arr yeni hali: [5, 9, 2, 4, 6, 8]

    }
    public static void elemanalriArtir(int[] arr, int artisMiktari){
        for (int i = 0; i < arr.length; i++) {
            arr[i]+=artisMiktari;
        }
        System.out.println("arr yeni hali: "+ Arrays.toString(arr));
    }




}

