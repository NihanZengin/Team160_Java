package H02_D05_IfStatements;

import java.util.Scanner;

public class C04_BagimsizIfCumleleri {
    public static void main(String[] args) {
        //kullanicidan iki tamsayi alin

        Scanner scanner= new Scanner(System.in);
        System.out.println("Lutfen iki tamsayi giriniz...");
        int sayi1= scanner.nextInt();
        int sayi2=scanner.nextInt();

        // 1- sayi1 < sayi2 ise "birinci sayi daha kucuk" yazdirin
        if (sayi1 < sayi2){
            System.out.println("birinci sayi daha kucuk");
        }


        // 2- sayi1 pozitif ise "birinci sayi sifirdan buyuk" yazdirin
        if (sayi1 > 0){
            System.out.println("birinci sayi sifirdan buyuk");
        }


        // 3- sayi2 50'den buyuk ise "ikinci sayi 50'den buyuk" yazdirin
        if (sayi2>50){
            System.out.println("ikinci sayi 50'den buyuk");
        }

        // 4- sayi2 5 ile bolunebiliyorsa "ikinci sayi 5'in tam kati" yazdirin
        if (sayi2 % 5 == 0){
            System.out.println("ikinci sayi 5'in tam kati");
        }
    }
}