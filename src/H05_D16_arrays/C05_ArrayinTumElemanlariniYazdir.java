package H05_D16_arrays;

import java.util.Arrays;

public class C05_ArrayinTumElemanlariniYazdir {
    public static void main(String[] args) {

    int[] arr={2,5,7,4,1,6,9};

    /// Array'in tum elemanlarini yazdirin
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");

        }
        //2 5 7 4 1 6 9
        System.out.println();

        //ama bu zahmetli bir sey


    ///Array'i yazdirin

        System.out.println(arr); //[I@13969fbe
        //non-primiitive data turundeki variable'lar direkt yazdirilamayabilir
        //bir array'i direkt yazdirmak isterseniz array'i degil
        //stack memory'deki referansini yazdirir


        //array'in referansini  degil, kendisini yazdirmak istediginizde
        //Arrays class'indan hazir method kullaniriz

        System.out.println(Arrays.toString(arr));
        //[2, 5, 7, 4, 1, 6, 9]
        //array'i yazdirirken standart olarak
        //elemanlarin arasinda ", " virgul ve bosluk birakir.

        String[] arrStr = {"ali", "veli", "can"};
        System.out.println(Arrays.toString(arrStr));
        //[ali, veli, can]




    }
}
