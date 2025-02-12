package H05_D17_ArraysClassMethods;

import H05_D16_arrays.C09_Next;

import java.util.Arrays;

public class C03_split {
    public static void main(String[] args) {

        String str="Java gun gectikce daha da guzellesiyor.";

        //cumledeki en kisa ve en uzun kelimeyi yazdirin

        String[] kelimeler=str.split(" ");
        System.out.println(Arrays.toString(kelimeler));
        //[Java, gun, gectikce, daha, da, guzellesiyor.]

        C09_Next.printEnKisaEnUzunKelime(kelimeler);
        //En kisa kelime : da
        //En uzun kelime : guzellesiyor.


    }
}
