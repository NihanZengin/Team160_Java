package H05_D18_ArrayList.Sorular;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C04_FibonacciSayilariniYazdir {
    public static void main(String[] args) {

        //kullanicidan pozitif bir n tamsayisini alip,
        //ilk n tane Fibonacci sayisini bir liste olarak yazdirin
        // 0 1 1 2 3 5 8 13 21 34 55 89 144 233

        Scanner scanner= new Scanner(System.in);

        System.out.println("Lutfen kac tane fibonacci sayisi istediginizi giriniz...");

        int n=scanner.nextInt();

        //n<= 0 hata versin
        //n==1 {0}
        //n==2 {0,1}
        //n>2 {0 ,1 , .....}

        List<Integer> fibonacciSerisi= new ArrayList<>();

        if (n<= 0){
            System.out.println("Pozitif bir deger girmelisiniz");
        }
        else if (n==1){
            fibonacciSerisi.add(0);
        }
        else if (n==2){
            fibonacciSerisi.add(0);
            fibonacciSerisi.add(1);
        }
        else{
            fibonacciSerisi.add(0);
            fibonacciSerisi.add(1);
            for (int i = 2; i < n; i++) {
                fibonacciSerisi.add(fibonacciSerisi.get(i-2)+ fibonacciSerisi.get(i-1));
            }
        }
        System.out.println(fibonacciSerisi);

    }
}
