package H01_D04_Increment_Decrement;

public class C03_PreIncrement_PostIncrement {
    public static void main(String[] args) {



        int a = 20;

        // a'nin degerini olusturdugunuz bir b variable'ina atayin
        // sonra a'yi bir artirin

        int b = a ;

        a++;

        System.out.println("17.satirda a: " + a + " , b : " + b ); // 17.satirda a: 21 , b : 20



        int c = 20;

        // once c'yi 1 artirin
        // sonra c'nin degerini olusturdugunuz bir d variable'ina atayin

        c++;

        int d = c;


        System.out.println("31.satirda c: " + c + " , d : " + d ); // 31.satirda c: 21 , d : 21


        // Ayni islemleri ++ ile yapalim

        a = 20;

        // a'nin degerini b variable'ina atayin
        // sonra a'yi bir artirin

        b = a++; //++ variable'dan sonra yazildigi icin once b'ye a'nin degeri atanir, sonra a variable'i bir artar.


         System.out.println("44.satirda a: " + a + " , b : " + b ); //44.satirda a: 21 , b : 20



        c = 20;

        // once c'yi 1 artirin
        // sonra c'nin degerini d variable'ina atayin


        d = ++c; // Burda ise ++ variable'dan once yazildigi icin,once c'nin degeri bir artar,
                 // daha sonra artmis haliyle d'ye atanir.


         System.out.println("58.satirda c: " + c + " , d : " + d ); //58.satirda c: 21 , d : 21

    }
}
