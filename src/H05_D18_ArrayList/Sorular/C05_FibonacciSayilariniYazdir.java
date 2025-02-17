package H05_D18_ArrayList.Sorular;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C05_FibonacciSayilariniYazdir {
    public static void main(String[] args) {

        //Kullanicidan pozitif bir tamsayi alip,
        //o tamsayidan kucuk Fibonacci sayilarini bir liste olarak yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen Fibonacci sayilarini yazdirmak icin ust sayi sinirini giriniz");
        int maxSayi = scanner.nextInt();

        List<Integer> fibonacciSerisi = new ArrayList<>();

        if (maxSayi < 0) {
            System.out.println("Ust sinir negatif olamaz");
        } else if (maxSayi == 0) {
            fibonacciSerisi.add(0);
        } else if (maxSayi == 1) {
            fibonacciSerisi.add(0);
            fibonacciSerisi.add(1);
            fibonacciSerisi.add(1);
        } else {
            fibonacciSerisi.add(0);
            fibonacciSerisi.add(1);
            fibonacciSerisi.add(1);

            int i = 3;
            int birOncekiSayi=fibonacciSerisi.get(i - 1);
            int ikiOncekiSayi=fibonacciSerisi.get(i - 2);


            while (birOncekiSayi+ikiOncekiSayi <= maxSayi) {
                fibonacciSerisi.add( birOncekiSayi+ikiOncekiSayi );
                i++;
                birOncekiSayi=fibonacciSerisi.get(i - 1);
                ikiOncekiSayi=fibonacciSerisi.get(i - 2);

            }
            System.out.println(fibonacciSerisi);  //[0, 1, 1, 2, 3, 5, 8]
        }
    }
}
