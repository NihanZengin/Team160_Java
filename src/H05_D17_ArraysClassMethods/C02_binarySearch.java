package H05_D17_ArraysClassMethods;

import H05_D16_arrays.C14_ElemanArama;
import H05_D16_arrays.C14_Next;

import java.util.Arrays;

public class C02_binarySearch {
    public static void main(String[] args) {

        String[] harfler={"d","t","p","k","z"};

        //verilen arr'de a harfinin var olup o,madigini yazdirin

        C14_Next.StringElemanArama(harfler,"t");//t harfi array'de 1 adet var.
        C14_Next.StringElemanArama(harfler,"a");//a harfi array'de 0 adet var.

        System.out.println(Arrays.binarySearch(harfler,"d"));//0
        System.out.println(Arrays.binarySearch(harfler,"t"));//-5
        System.out.println(Arrays.binarySearch(harfler,"p"));//2
        System.out.println(Arrays.binarySearch(harfler,"k"));//-2
        System.out.println(Arrays.binarySearch(harfler,"z"));//4
        System.out.println(Arrays.binarySearch(harfler,"a"));//-1
        System.out.println(Arrays.binarySearch(harfler,"x"));//-5

        /// Goruldugu gibi bu sekilde aradigimizda her zaman dogru sonucu vermiyor
        /// Bu sorunu asmak icin java once sort ile duzenleyip sonra aramak gerekir!!!

        Arrays.sort(harfler);

        System.out.println(Arrays.binarySearch(harfler,"d"));//0
        System.out.println(Arrays.binarySearch(harfler,"t"));//3
        System.out.println(Arrays.binarySearch(harfler,"p"));//2
        System.out.println(Arrays.binarySearch(harfler,"k"));//1
        System.out.println(Arrays.binarySearch(harfler,"z"));//4
        System.out.println(Arrays.binarySearch(harfler,"a"));//-1 //olmayanlari olsaydi hangi sirada olurdu onun negatif halini verir
        System.out.println(Arrays.binarySearch(harfler,"x"));//-5


    }
}
