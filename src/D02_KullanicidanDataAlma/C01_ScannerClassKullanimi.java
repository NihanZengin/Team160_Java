package D02_KullanicidanDataAlma;

import java.util.Scanner;

public class C01_ScannerClassKullanimi {

    public static void main(String[] args) {

        // Kullanicidan bir double, bir de int sayi alip bunlarin toplmaini ve carpimini yazdirin.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen ondalikli sayi giriniz...");

        double ondalikliSayi = scanner.nextDouble();

        System.out.println("Lutfen bir tam sayi giriniz...");

        int tamSayi = scanner.nextInt();

        System.out.println("Sayilarin toplami : " + (ondalikliSayi + tamSayi));

        System.out.println("Sayilarin carpimi : " + (ondalikliSayi * tamSayi));

        //Lutfen ondalikli sayi giriniz...
        //2.5
        //Lutfen bir tam sayi giriniz...
        //5
        //Sayilarin toplami : 7.5
        //Sayilarin carpimi : 12.5

    }
}
