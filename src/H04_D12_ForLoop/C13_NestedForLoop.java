package H04_D12_ForLoop;

import java.util.Scanner;

public class C13_NestedForLoop {
    public static void main(String[] args) {


    /*
    *
    * kullanicidan satir ve sutun sayisi alip asagidaki sekli olusturun.

    1 2 3 4 5
    2 3 4 5 6
    3 4 5 6 7

   3 adet satir, her satirda da 5 adet sayi var

     eger bizden istenen yazdirma gorevinde
    satir ve sutun varsa ic ice (nested) for loop kullanmaliyiz
  */

       Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen satir ve sutun sayisini, yani her satirdaki eleman sayisini giriniz");


        System.out.println("Satir sayisi: ");
        int satir=scan.nextInt();

        System.out.println("Sutun sayisi: ");
        int sutun=scan.nextInt();

        for (int i = 1; i <=satir ; i++) {               /// satirlar
            for (int j = 1; j <=sutun ; j++) {           /// her satirdaki sutunlar

            }
            System.out.println("");

        }


    }
}
