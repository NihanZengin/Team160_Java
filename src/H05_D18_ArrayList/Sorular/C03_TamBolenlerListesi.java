package H05_D18_ArrayList.Sorular;

import java.util.ArrayList;
import java.util.List;

public class C03_TamBolenlerListesi {
    public static void main(String[] args) {

        //Verilen pozitif bir tamsayiyi,
        //tam bolebilen tum pozitif tamsayilari bir liste olarak bize donduren
        // bir method olusturun.

        System.out.println(verilenSayiyiTamBolenlerListesi(40)); //[1, 2, 4, 5, 8, 10, 20, 40]

        /*
        Tam bolenler listesi methodunu kullanarak 2 basamakli asal sayilari yazdirin
         */

        for (int i = 10; i <100 ; i++) {
            int tamBolenSayisi= verilenSayiyiTamBolenlerListesi(i).size(); //asal sayilarin tam bolen sayisi 2 dir

            if (tamBolenSayisi==2){
                System.out.print(i+" "); //11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97
            }
        }

    }

    public static List<Integer> verilenSayiyiTamBolenlerListesi ( int verilenSayi){

        List<Integer> tamBolenlerList= new ArrayList<>();
        for (int i = 1; i <= verilenSayi; i++) {

            if (verilenSayi%i==0) {
                tamBolenlerList.add(i);

            }
        }

        return tamBolenlerList;
    }
}
