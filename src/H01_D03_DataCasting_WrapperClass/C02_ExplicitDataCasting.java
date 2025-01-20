package H01_D03_DataCasting_WrapperClass;

public class C02_ExplicitDataCasting {
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
