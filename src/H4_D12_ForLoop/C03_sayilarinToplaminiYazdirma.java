package H4_D12_ForLoop;

import java.util.Scanner;

public class C03_sayilarinToplaminiYazdirma {
    public static void main(String[] args) {

        //Soru 3- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        //        sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        //        Bitis degeri baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin

      Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen baslangic degeri olarak pozitif bir tamsayi giriniz...");
        int baslangic=scan.nextInt();

        System.out.println("Lutfen bitis degeri olarak pozitif bir tamsayi giriniz...");
        int bitis=scan.nextInt();

        int toplam=0;



            if(baslangic>bitis){
                System.out.println("DIKKAT: bitis degeri baslangictan BUYUK olmali!!");
            }
            else {
                for (int i = baslangic; i <= bitis; i++) {
                    toplam += i;

                }
                System.out.println("Verilen sayilarin toplami: "+toplam);
            }


    }
}
