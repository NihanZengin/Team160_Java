package H4_D12_ForLoop;

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
  */

       Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen satir ve sutun sayisini giriniz");


        System.out.println("Satir sayisi: ");
        int satir=scan.nextInt();

        System.out.println("Sutun sayisi: ");
        int sutun=scan.nextInt();

        for (int i = 1; i <=satir ; i++) {
            for (int j = 1; j <=sutun ; j++) {
                System.out.print(i+j-1+" ");

            }
            System.out.println("");

        }


    }
}
