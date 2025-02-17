package H05_D19_ForEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_forEachLoop {
    public static void main(String[] args) {

        /*
        1- for loop
           baslangic ve sonuc biliniyorsa, tekrar sayisi biliniyorsa

        2- while loop
           tekrar sayisi belli degilse

        3- do-while loop
           loop body'nin en az bir kere calismasi gereken durumlarda

        4- for each loop
           birden fazla eleman barindiran yapilardaki TUM ELEMENTLERI siralama olmaksizin
           (index kullanmadan) bize getirir.
         */

        int[] arr= {3,4,5,2,3,4,5,1,2,3 };
        List<Integer> sayilar= new ArrayList<>(Arrays.asList(2,8,5,6,7,4,5,6,4,5,4,3));

        //arr'deki elementlerin toplamini yazdirin
        int toplam=0;

        for (int i = 0; i < arr.length; i++) {
            toplam+=arr[i];
        }
        System.out.println("for loop ile toplam: "+toplam);

        toplam=0;

        for (int each:arr){
            toplam+=each;
        }
        System.out.println("For each loop ile toplam: "+toplam);


        //sayilar listesindeki cift sayilarin toplamini yazdirin

        toplam=0;

        for (int i = 0; i < sayilar.size(); i++) {
            if (sayilar.get(i)%2==0){
                toplam+=sayilar.get(i);
            }
        }
        System.out.println("Sayilar listesindeki cift sayilarin toplaminin for loop ile cozumu: "+toplam);

        toplam=0;

        for (int each:sayilar){
            if (each%2==0){
                toplam+=each;
            }
        }

        System.out.println("Sayilar listesindeki cift sayilarin toplaminin for each loop ile cozumu: "+toplam);


        //sayilar listesindeki en buyuk sayiyi yazdirin
        //

        int enBuyukEleman=sayilar.get(0);

        for (int i = 0; i < sayilar.size(); i++) {
            if (sayilar.get(i)>enBuyukEleman){
                enBuyukEleman= sayilar.get(i);
            }

        }
        System.out.println("For loop ile en buyuk eleman: "+enBuyukEleman);

        enBuyukEleman=sayilar.get(0);

        for (int each: sayilar){
            if (each>enBuyukEleman){
                enBuyukEleman= each;
            }
        }
        System.out.println("For each loop ile en buyuk eleman: "+enBuyukEleman);




    }
}
