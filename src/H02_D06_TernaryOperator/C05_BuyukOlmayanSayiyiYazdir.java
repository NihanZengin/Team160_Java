package H02_D06_TernaryOperator;

import java.util.Scanner;

public class C05_BuyukOlmayanSayiyiYazdir {
    public static void main(String[] args) {

        // Kullanicidan iki sayi alin ve buyuk olmayan sayiyi yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen iki tamsayi giriniz...");

        int sayi1=scanner.nextInt();
        int sayi2=scanner.nextInt();

        System.out.println(sayi1<sayi2 ? sayi1 : sayi2); //sayilarin esit olma durumu ihtimali
                                                         // gozardi edilmis gibi gorunse de; esit sayilar girdigimizde
                                                        // yine de sayilardan birini yazdirir ve problem yoktur aslinda.

    }
}
