package H05_D18_ArrayList.Sorular;

import java.util.ArrayList;
import java.util.List;

public class C03_TamBolenlerListesi {
    public static void main(String[] args) {

        //Verilen pozitif bir tamsayiyi,
        //tam bolebilen tum pozitif tamsayilari bir liste olarak bize donduren
        // bir method olusturun.

        verilenSayiyiTamBolenlerListesi(40);

    }

    public static List<Integer> verilenSayiyiTamBolenlerListesi ( int verilenSayi){

        List<Integer> tamBolenlerList= new ArrayList<>();
        for (int i = 0; i < verilenSayi; i++) {

            if (verilenSayi%i==0) {
                tamBolenlerList.add(i);

            }
        }

        return tamBolenlerList;
    }
}
