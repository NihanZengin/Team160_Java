package H05_D18_ArrayList.ArrayListMethodlari;

import java.util.*;

public class C07_TekrarEdenSayilariSilme {
    public static void main(String[] args) {

        //Verilen bir arrayde tekrar eden sayilar varsa silip array'i her sayidan bir tane olacak sekilde olusturma..

        int[] arr= {2,3,4,5,2,4,2,2,4,2,4,3,5,1};

        List<Integer> tekrarsizList=new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (! tekrarsizList.contains(arr[i])){
                tekrarsizList.add(arr[i]);
            }
        }

        Collections.sort(tekrarsizList);  // sirali hale getirmek icin

        System.out.println("tekrarsiz listem"+tekrarsizList); //tekrarsiz listem[1, 2, 3, 4, 5]

        System.out.println(Arrays.toString(arr)); //[2, 3, 4, 5, 2, 4, 2, 2, 4, 2, 4, 3, 5, 1]
        //arr hala ayni

        arr=new int[tekrarsizList.size()]; // [0, 0, 0, 0, 0,]

        for (int i = 0; i < arr.length; i++) {
            arr[i]= tekrarsizList.get(i);
        }
        System.out.println(Arrays.toString(arr));// [1, 2, 3, 4, 5]


    }
}
