package H04_D14_WhileLoop;

import java.util.Scanner;

public class C10_DoWhile {
    public static void main(String[] args) {
        /*
        Kullanicidan baslangic ve bitis harflerini alip
        o harfleri ve aralarindaki harfleri yazdirin.
        kullanici bir harf degil metin girerse uyari verip
        yeniden bir harf girmesini isteyin.
        Kullanici harf girinceye kadar tekrar isteyin
         */

        Scanner scanner =new Scanner(System.in);

        char baslangic='a';
        char bitis='s';
        String girilenBaslangic="";
        String girilenBitis="";


        do{
            System.out.println("Lutfen baslangic icin bir harf giriniz...");
            girilenBaslangic =scanner.nextLine();
            baslangic=girilenBaslangic.charAt(0);

            System.out.println("Lutfen bitis icin bir harf giriniz...");
            girilenBitis =scanner.nextLine();
            bitis=girilenBitis.charAt(0);

            if(girilenBaslangic.length()>1 || girilenBitis.length()>1){
                System.out.println("Baslangic degeri olarak harf girmelisiniz");
            }
            else if (!Character.isLetter(baslangic) || !Character.isLetter(bitis)){
                System.out.println("Girdiginiz karakter harf olmalidir");
            }
            else{ // kullanici tek karakter girdi ve girilen karakter de harf

                while (baslangic<= bitis){
                    System.out.print(baslangic+ " ");
                    baslangic++;
                }
            }

        }while(girilenBaslangic.length()>1 || girilenBitis.length()>1 || !Character.isLetter(baslangic) || !Character.isLetter(bitis));
    }
}
