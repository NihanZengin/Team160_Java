package H02_D05_IfStatements.D05_BagimsizIfCumleleri;

import java.util.Scanner;

public class C04_SusluParantezKullanma {

    public static void main(String[] args) {

        /// Soru - Kullanicidan bir sayi alin,
        //        //         sayi 3 ile bolunuyorsa ”Uc ile bolunebilen sayi”,
        //        //         5 ile bolunebiliyorsa “Bes ile bolunebilen sayi” yazdirin.
        //        Scanner scanner = new Scanner(System.in);
        //        System.out.println("Lutfen bir tamsayi giriniz...");
        //        int sayi = scanner.nextInt();

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz..");
        int sayi= scanner.nextInt();

        if (sayi%3==0){
            System.out.println("Uc ile bolunebilen sayi");
            System.out.println("3 ile bolunme ekstra satir"); //Suslu parantez yazdigimizda sart sagladiginda ikisini de yazdirir.
        }

        if (sayi%5==0){
            System.out.println("Bes ile bolunebilen sayi");
            System.out.println("5 ile bolunme ekstra satir");
        }

        //eger suslu parantez kullanmazsak if body olarak sadece ilk ; e kadar olan kismi alir
        // geriye kalan kodlar if ile ilgili olmaz.

        if (sayi%4==0)
            System.out.println("Dort ile bolunebilen sayi"); // Ilk ; isaretine kadar if body icinde sayar. Bu sebeple burayi sart saglarsa yazdirir.
            System.out.println("4 ile bolunme ekstra satir"); // Sart saglasa da, saglamasa da calisir.

        // EGER if body'si tek bir satir ise
        // {} kullanmayabiliriz
        // AMMMMAAA if body'sine birden fazla satir kod yazmamiz gerekiyorsa
        // MUTLAKA {} kullanmaliyiz

    }
}
