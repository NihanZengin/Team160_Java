package H04_D12_ForLoop;

import java.util.Scanner;

public class C05_FaktoryelHesabi {

    public static void main(String[] args) {


        // Kullanicidan 17’den kucuk bir pozitif tamsayi alip,
        // bu sayinin faktoryel degerini hesaplayin.
        // Konsolda faktoryel hesabinin yapilisini da yazdirin.
        //	Or : 6! = 6 * 5 * 4 * 3 * 2 * 1 = 720

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen baslangic degeri olarak 17'den kucuk pozitif bir tamsayi giriniz...");
        int sayi = scan.nextInt();


        int faktorielSonuc = 1;


        if (sayi > 16) {
            System.out.println("Lutfen sayi 17'dan kucuk olsun");

        } else {
            System.out.print(sayi + "! = ");
            for (int i = sayi; i >= 1; i--) {
                faktorielSonuc *= i;


                if (i > 1) {

                    System.out.print(i + " * ");

                } else System.out.print(i);
            }

            System.out.println( " = "+ faktorielSonuc);
        }
        //        //NEDEN 17 den kucuk sayi istedik: javada int belli bir degere kadar alabilir,
        //Bu degerin ustune ciktiginda eksilere gecer ve alakasiz - bir sayi yazdirir.
    }



   }

