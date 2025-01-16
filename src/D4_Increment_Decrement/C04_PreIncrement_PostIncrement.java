package D4_Increment_Decrement;

public class C04_PreIncrement_PostIncrement {
    public static void main(String[] args) {

         /*
            ++ ve --'nin ozel bir kullanimi vardir
            EGER bir satirda sadece ++a veya a++ varsa,
            ikisi de ayni islevi gorur, a'nin degerini bir artirirlar.

            ayni sekilde bir satirda sadece --a veya a-- varsa
            ayni islevi yapip a'yi bir azaltirlar.

            Farklari ++ ve -- kullanilan satirda
            baska bir islem daha yapilirsa ortaya cikar

            ++ veya -- 'nin diger islemden once mi sonra mi yapilacagina
            ++ veya -- 'nin variable'dan once veya sonra yazilmasina
            gore karar veririz.

            --a , ++b   ++ veya -- variable'dan once yazilmissa
                        once artirma veya azaltma yapilir, sonra diger islem yapilir

            a++ , b--   ++ veya -- variable'dan sonra yazilmissa
                        artirma veya azaltma sonra yapilir, once diger islem yapilir

         */

        int a = 20;
        int b = 40;

        a++;
        b--;


        System.out.println("36.satirda a : " + a + ", b : " + b); // 21 - 39

        ++a;
        --b;

        System.out.println("41.satirda a : " + a + ", b : " + b); // 22 - 38





        System.out.println(a++);// 22 Once 22'yi yazdirdi, sonra a'yi 23 yapti.



        System.out.println("51.satirda a : " + a + ", b : " + b); // 23 - 38







        System.out.println(++a);// 24 // once a'nin degerini bir arttirdi, sonra yazdirdi


        System.out.println("62.satirda a : " + a + ", b : " + b); // 24 - 38





        System.out.println(b--);// 38 // once b'nin degerini yazdirdi, sonra bir eksiltti.

        System.out.println("70.satirda a : " + a + ", b : " + b); // 70.satirda a : 24, b : 37


        System.out.println(--b);//once b'nin degerini bir azaltti, sonra yazdirdi

        System.out.println("75.satirda a : " + a + ", b : " + b); //75.satirda a : 24, b : 36






        a = b++;



        System.out.println("86.satirda a : " + a + ", b : " + b); // 86.satirda a : 36, b : 37



        a= ++b;


        System.out.println("93.satirda a : " + a + ", b : " + b); // 93.satirda a : 38, b : 38




        b = a++ / 2 ;



        System.out.println("102.satirda a : " + a + ", b : " + b); // 102.satirda a : 39, b : 19







        b = ++a / 2 ;

        System.out.println("84.satirda a : " + a + ", b : " + b); //


    }
}
