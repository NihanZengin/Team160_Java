package H02_D06_TernaryOperator;

import java.util.Scanner;

public class C03_IfElse_Ternary {
    public static void main(String[] args) {
        // Kullanicidan uc basamakli pozitif bir tamsayi isteyin
        // sayi 500 veya daha buyukse rakamlar toplamini hesaplayip yazdirin
        // sayi 500'den kucukse sayinin 10'lar basamagindaki rakamin karesini yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println( "Lutfen 3 basamakli bir tamsayi giriniz...");
        int sayi = scanner.nextInt();


        if (sayi>500){  // 675

            // rakamlar toplamini hesaplayip yazdirin

            int rakamlarToplami = sayi%10; // 5

            sayi /= 10;  // 67

            rakamlarToplami+= sayi%10; // 5+7 =12

            sayi /= 10; // 6

            rakamlarToplami += sayi ;

            System.out.println("Sayinin rakamlari toplami : " + rakamlarToplami);


        }else { // 345
            //sayinin 10'lar basamagindaki rakamin karesini yazdirin

            sayi /= 10 ; // 34 10'lar basamagindaki 4'e ulasmak icin birler basamagini yok ettik

            int onlarBasamagindakiRakam = sayi % 10 ; // 4

            System.out.println( "Onlar basamagindaki rakamin karesi : " +
                    onlarBasamagindakiRakam*onlarBasamagindakiRakam );

        }

        /// Yukaridaki ornekte oldugu gibi, uzun islem gerektiren durumlari Ternary ile YAPAMAYIZ.
    }
}
