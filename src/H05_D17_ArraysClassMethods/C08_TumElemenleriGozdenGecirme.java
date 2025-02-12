package H05_D17_ArraysClassMethods;

import java.util.Arrays;

public class C08_TumElemenleriGozdenGecirme {
    public static void main(String[] args) {

        int[][] arr = {{2, 3, 7}, {3, 5}, {4}, {1, 2, 3, 6, 8}};

        //arr'deki cift sayilarin toplamini yazdirin

        int toplam = 0;

        for (int i = 0; i < arr.length; i++) {            //outer array'i kontrol eder
            for (int j = 0; j < arr[i].length; j++) {     //her bir innerdekileri kontrol eder
                if (arr[i][j] % 2 == 0) {
                    toplam += arr[i][j];
                }
            }
        }

        System.out.println("arr array'indaki cift sayilarin toplami : " + toplam); // 22


        // arr'deki tek sayilardan en buyuk olani yazdirin

        int enBuyukTekSAyi = Integer.MIN_VALUE; // oyle bir sayi olmali ki en kucuk ve tek olsun

        for (int i = 0; i < arr.length; i++) {            //outer array'i kontrol eder
            for (int j = 0; j < arr[i].length; j++) {     //her bir innerdekileri kontrol eder
                if (arr[i][j] % 2 != 0 && enBuyukTekSAyi < arr[i][j]) {
                    enBuyukTekSAyi = arr[i][j];
                }
            }
        }
        System.out.println("arr array'indaki tek sayilardan en buyuk olani : " + enBuyukTekSAyi); //7



        //arr'deki tum sayilari 1 artirin

        for (int i = 0; i < arr.length; i++) {            //outer array'i kontrol eder
            for (int j = 0; j < arr[i].length; j++) {     //her bir innerdekileri kontrol eder
                arr[i][j]++;
            }
        }
        System.out.println("arr'deki tum sayilarin bir artirilmis hali:"+ Arrays.deepToString(arr));
        //[[3, 4, 8], [4, 6], [5], [2, 3, 4, 7, 9]]





        //arr'deki tum tek sayilari ve cift sayilari ayri ayri toplayip
        //ciftSayilarToplami-tekSayilarToplami yazdirin

        int ciftSayilarToplami=0;
        int tekSayilarToplami=0;

        for (int i = 0; i < arr.length; i++) {            //outer array'i kontrol eder
            for (int j = 0; j < arr[i].length; j++) {     //her bir innerdekileri kontrol eder
                if (arr[i][j] % 2 == 0) {
                    ciftSayilarToplami += arr[i][j];
                }
                if (arr[i][j] % 2 != 0) {
                    tekSayilarToplami += arr[i][j];
                }
            }
        }
        System.out.println("ciftSayilarToplami-tekSayilarToplami:"+ (ciftSayilarToplami-tekSayilarToplami));//1
        //[[3, 4, 8], [4, 6], [5], [2, 3, 4, 7, 9]]


    }
}
