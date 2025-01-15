package D03_dataCasting;

public class C01_DataCasting_AutoWidening {
    public static void main(String[] args) {

        boolean bl = true;
        char chr = 'a';
        byte byt = 24;
        short shrt = 23;
        int sayiInt= 30;
        long lng = 40;
        float flt= 3.5F;
        double dbl= 4.5;
        String str = "Java guzeldir.";

        int sayi2 = sayiInt;
        //int data turundeki bir degeri yine int data turundeki bir variable'a atama yaparsak
        // bu data casting olmaz, ATAMA olur.

        // bir variable'a baska data turundeki bir deger ATANABILIR MI?

//         bl = chr; // 'a'
//         bl = byt; // 24
//         bl = shrt; // 23
//         bl = sayiInt; // 30
//         bl = str; // "Java Candir"

                // bloean data turu sadece true veya false kabul eder
                // baska hicbir data turundeki degeri kabul etmez

//         str = bl; // true
//         str = byt; // 24
//         str = chr; // 'a'
//         str = shrt; // 23
//         str = lng; // 40

                // String data turu sadece metin degerler kabul eder
                // atanan degerler  "" icinde olmalidir
                // baska hicbir dataturundeki deger DIREK olarak String variable'a atanamaz

//         chr = bl; // true
//         chr = flt; // 3.5F
//         chr = dbl; // 4.5
//         chr = str; // "Java Candir";
//         chr = sayiInt;
//         chr = byt;
//         chr = shrt;

                // char data turu OZEL bir kullanima sahiptir
                // tamsayi degeri barindiran data turleri ile ozel durumlarda casting yapabilir
                // ama double, float, boolean veya String ile casting olmaz

//        byt = shrt; // 23
//        byt = sayiInt; // 30
//        byt = lng; // 40
//        byt = flt; // 3.5F
//        byt = dbl; // 4.5

          shrt = byt;
//        shrt = sayiInt;
//        shrt = lng;
//        shrt = flt;
//        shrt = dbl;

          sayiInt = byt;
          sayiInt = shrt;
//        sayiInt = lng;
//        sayiInt = flt;
//        sayiInt = dbl;

        lng = byt;
        lng = shrt;
        lng = sayiInt;
//        lng = flt;
//        lng = dbl;

        flt = byt;
        flt = shrt;
        flt = sayiInt;
        flt = lng;
//        flt = dbl;

        dbl = byt;
        dbl = shrt;
        dbl = sayiInt;
        dbl = lng;
        dbl = flt;

        //Sayi degeri alan byte, short. int, long, float ve double variable'lar icin;
        //Bir variable'a kendisinden daha genis data turundeki bir deger ATANABILIR MI|?
        //Bu islemi Java otomatik olarak yapmaz.
        //Java sorumlulugu sizin almanizi ister.
        //Esitligin sagina parantez icinde cevirmek istediginiz data turunu yazariz.
        //Buna Explicit Narrowing (Zorlayarak daraltma) denir.

        byt = (byte) shrt; // 23
        byt = (byte) sayiInt; // 30
        byt = (byte) lng; //40
        byt = (byte)flt; // 3.5F
        byt = (byte) dbl; // 4.5


        shrt = byt;
        shrt = (short) sayiInt;
        shrt = (short)lng;
        shrt = (short)flt;
        shrt =(short) dbl;

        sayiInt = byt;
        sayiInt = shrt;
        sayiInt =(int) lng;
        sayiInt = (int)flt;
        sayiInt = (int)dbl;

        lng = byt;
        lng = shrt;
        lng = sayiInt;
        lng = (long)flt;
        lng = (long) dbl;

        flt = byt;
        flt = shrt;
        flt = sayiInt;
        flt = lng;
        flt =(float) dbl;

        dbl = byt;
        dbl = shrt;
        dbl = sayiInt;
        dbl = lng;
        dbl = flt;

        //boolean veya String data turundeki bir variable'a
        //baska data turundeki degerleri ATAYAMAYIZ.



    }
}
