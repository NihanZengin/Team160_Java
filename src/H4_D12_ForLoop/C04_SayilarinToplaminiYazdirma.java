package H4_D12_ForLoop;

import java.util.Scanner;

public class C04_SayilarinToplaminiYazdirma {
    public static void main(String[] args) {

        //  Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        //  sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        //  Bitis degeri baslangic degerinden kucuk OLSA DA program calissin

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen baslangic degeri olarak pozitif bir tamsayi giriniz...");
        int baslangic = scanner.nextInt();

        System.out.println("Lutfen bitis degeri olarak pozitif bir tamsayi giriniz...");
        int bitis = scanner.nextInt();

        int toplam = 0;

        if ( bitis >= baslangic ){

            for (int i = baslangic; i <=bitis ; i++) {

                toplam += i;
            }

            System.out.println("Verilen araliktaki sayilarin toplami : " + toplam);

        } else { // yukardaki if body calismadiysa
            // bitis olarak girilen deger daha kucuk demektir
            // kucukten buyuge gitmek icin kodu asagidaki gibi degistirdik

            for (int i = bitis; i <=baslangic ; i++) {

                toplam += i;
            }

            System.out.println("Verilen araliktaki sayilarin toplami : " + toplam);


        }



    }
}
