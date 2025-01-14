package D02_KullanicidanDataAlma;

import java.util.Scanner;

public class C06_Swap {
    public static void main(String[] args) {

        //Soru 7 (Interview)- Kullanicidan iki sayi alip ikisinin degerini degistirin (swap)

        Scanner scanner = new Scanner(System.in);

        System.out.println("Birinci tamsayiyi giriniz...");
        int sayi1 = scanner.nextInt();

        System.out.println("Ikinci tamsayiyi giriniz...");
        int sayi2 = scanner.nextInt();

        int temp=0; // bu bos su kovasi islemi gorecek.

        temp= sayi2; // s1=10 s2=20 temp=20
        sayi2=sayi1; // s1=10 s2=10 temp=20
        sayi1=temp; // s1=20 s=10 temp=20


        System.out.println("Sayi1'in yeni degeri : " + sayi1);
        System.out.println("Sayi2'in yeni degeri : " + sayi2);

        //Birinci tamsayiyi giriniz...
        //10
        //Ikinci tamsayiyi giriniz...
        //20
        //Sayi1'in yeni degeri : 20
        //Sayi2'in yeni degeri : 10
    }
}
