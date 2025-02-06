package H04_D14_WhileLoop;

import java.util.Scanner;

public class C05_RakamlarToplaminiBulma {
    public static void main(String[] args) {

        //While  Loop kullanarak girilen sayinin rakamlar toplamini yazdirin

        Scanner scanner=new Scanner(System.in);
        System.out.println("Rakamlar toplamini bulmak icin lutfen bir tamsayi giriniz...");
        int girilenSAyi=scanner.nextInt();

        int sayi=girilenSAyi;

        int rakamlarToplami=0;

        while(sayi>0){
            rakamlarToplami+=sayi%10;
            sayi/=10;
        }
        System.out.println("Girilen "+girilenSAyi+" sayisinin rakamlar toplami : "+rakamlarToplami);
    }
}
