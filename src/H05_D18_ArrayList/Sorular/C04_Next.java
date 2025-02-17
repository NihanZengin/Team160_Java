package H05_D18_ArrayList.Sorular;

import java.util.ArrayList;
import java.util.List;

public class C04_Next {
    public static void main(String[] args) {


        //Verilen pozitif bir n tamsayisi adedince bize fibonacci sayisi yazdiran bir method yaziniz

        fibonacciSerisiOlusturma(10); //[0, 1, 1, 2, 3, 5, 8, 13, 21, 34]

    }

    public static void fibonacciSerisiOlusturma(int seridekiElemanSayisi){
        List<Integer> fibonacciSerisi= new ArrayList<>();

        if (seridekiElemanSayisi<= 0){
            System.out.println("Pozitif bir deger girmelisiniz");
        }
        else if (seridekiElemanSayisi==1){
            fibonacciSerisi.add(0);
        }
        else if (seridekiElemanSayisi==2){
            fibonacciSerisi.add(0);
            fibonacciSerisi.add(1);
        }
        else{
            fibonacciSerisi.add(0);
            fibonacciSerisi.add(1);
            for (int i = 2; i < seridekiElemanSayisi; i++) {
                fibonacciSerisi.add(fibonacciSerisi.get(i-2)+ fibonacciSerisi.get(i-1));
            }
        }
        System.out.println(fibonacciSerisi);
    }
}
