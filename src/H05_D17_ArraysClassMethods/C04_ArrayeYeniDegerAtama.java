package H05_D17_ArraysClassMethods;

import java.util.Arrays;

public class C04_ArrayeYeniDegerAtama {
    public static void main(String[] args) {

        int[] sayilar={3,5,10};

        String[] isimler={"Ali", "Hasan"};


        //sayilar array'ina {3,5,6,8} atayin.

        //sayilar= {3,5,6,8};

        int[] sayilarYeni ={3,5,6,8};

        sayilar = sayilarYeni;
        System.out.println("Sayilar array'ini son hali: "+ Arrays.toString(sayilar));

        String[] isimlerYeni = new String[isimler.length+1]; // [null, null, null]

        isimlerYeni[0]=isimler[0];// [Ali, null, null]

        isimlerYeni[1]=isimler[1];// [Ali, Hasan, null]

        isimlerYeni[2]="Can";

        isimler=isimlerYeni;

        System.out.println("isimler array'inin son hali: "+ Arrays.toString(isimler));

        //isimler array'inin son hali: [Ali, Hasan, Can]


    }
}
