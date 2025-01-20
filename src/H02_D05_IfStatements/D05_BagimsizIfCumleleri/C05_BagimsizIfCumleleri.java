package H02_D05_IfStatements.D05_BagimsizIfCumleleri;

import java.util.Scanner;

public class C05_BagimsizIfCumleleri {
    public static void main(String[] args) {
         /*
            BAGIMSIZ if cumleleri adindan da anlasilacagi gibi
            kodun geri kalanindan bagimsizdir

            Kendisine verilen sarta odaklanir
            ve o sart true olursa if body'sine yazilan kodu calistirir

            Birden fazla bagimsiz if cumlesi varsa
            hepsinin if body'leri calisabilecegi gibi
            hic birinin if body'si calismayabilir de

            Bu kod calistirildiginda
            tum bagimsiz if cumleleri kendi sartlarini kontrol eder
            sart saglanirsa kendi body'sindeki kodlari calistirir
            sart saglanmazsa if cumlesi calisir
            ama if body'si devreye girmemis olur
         */

        //kullanicidan iki tamsayi alin

        Scanner scanner= new Scanner(System.in);
        System.out.println("Lutfen iki tamsayi giriniz...");
        int sayi1= scanner.nextInt();
        int sayi2=scanner.nextInt();

        // 1- sayi1 < sayi2 ise "birinci sayi daha kucuk" yazdirin
        if (sayi1 < sayi2)
            System.out.println("birinci sayi daha kucuk");



        // 2- sayi1 pozitif ise "birinci sayi sifirdan buyuk" yazdirin
        if (sayi1 > 0)
            System.out.println("birinci sayi sifirdan buyuk");



        // 3- sayi2 50'den buyuk ise "ikinci sayi 50'den buyuk" yazdirin
        if (sayi2>50)
            System.out.println("ikinci sayi 50'den buyuk");


        // 4- sayi2 5 ile bolunebiliyorsa "ikinci sayi 5'in tam kati" yazdirin
        if (sayi2 % 5 == 0)
            System.out.println("ikinci sayi 5'in tam kati");

    }
}
