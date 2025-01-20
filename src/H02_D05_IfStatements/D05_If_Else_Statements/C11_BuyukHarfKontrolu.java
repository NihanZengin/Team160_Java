package H02_D05_IfStatements.D05_If_Else_Statements;

import java.util.Scanner;

public class C11_BuyukHarfKontrolu {
    public static void main(String[] args) {
        //Soru 4- Kullanicidan bir karakter girmesini isteyin,
        //        //        girilen karakterin buyuk harf olup olmadigini yazdirin.

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz..");
        char harf=scan.next().charAt(0);

        //ASCII Tablosuna gore

        if(harf>='A' && harf<='Z' ){
            System.out.println("Girdiginiz karakter buyuk harf");
        }
        else{
            System.out.println("Girdiginiz harf buyuk harf degildir");
        }

        //Wrapper Class
        if(Character.isUpperCase(harf)){
            System.out.println("Girdiginiz karakter buyuk harf");
        }
        else{ System.out.println("Girdiginiz harf buyuk harf degildir");
        }

    }
}
