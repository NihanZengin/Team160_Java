package H4_D12_ForLoop;

import java.util.Scanner;

public class C03 {
    public static void main(String[] args) {

        //Soru 3- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        //        sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        //        Bitis degeri baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin

      Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen baslangic degeri olarak pozitif bir tamsayi giriniz...");
        int baslangic=scan.nextInt();
        System.out.println("Lutfen bitis degeri olarak pozotof bir tamsayi giriniz...");
        int bitis=scan.nextInt();

        int toplam=0;

        for (int i = baslangic; i <= bitis; i++) {

            if(baslangic>bitis){
                System.out.println("DIKKAT: bitis degeri baslangictan buyuk olmali!!");
            } else if (i<0) {
                System.out.println("Lutfen pozitif baslangic ve bitis degeri giriniz");

            }
            else {
                toplam+=i;
                System.out.println(toplam);
            }

        }
    }
}
