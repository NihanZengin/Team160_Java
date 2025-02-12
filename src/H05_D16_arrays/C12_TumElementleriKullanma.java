package H05_D16_arrays;

import java.util.Arrays;

public class C12_TumElementleriKullanma {
    public static void main(String[] args) {
        int[] sayilar={4,7,1,3,4,4,5,1};

        //sayilar arrayini yazdirin

        System.out.println(Arrays.toString(sayilar)); //[4, 7, 1, 3, 4, 8, 0, 1]

        //sayilar array'indaki tum elementleri yanyana yazdirin

        for (int i = 0; i < sayilar.length; i++) {
            System.out.print(sayilar[i]); //47134801
        }
        System.out.println();

        //sayilar array'indaki tum elementleri toplamini yazdirin

        int toplam=0;
        for (int i = 0; i < sayilar.length; i++) {

            toplam+=sayilar[i];
        }
        System.out.println("Toplam : "+toplam); //Toplam : 28


        //Sayilar arrayindaki cift sayilarin carpimixni yazdirin

        int carpim =1;
        for (int i = 0; i <sayilar.length ; i++) {
            if (sayilar[i]%2==0){
                carpim*=sayilar[i];
            }
        }
        System.out.println("Cift sayilarin carpimi: "+ carpim);
    }
}
