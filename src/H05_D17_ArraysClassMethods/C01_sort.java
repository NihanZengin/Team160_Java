package H05_D17_ArraysClassMethods;

import java.util.Arrays;

public class C01_sort {
    public static void main(String[] args) {
String[] isimler={"Ali", "Mustafa", "Nihan", "Omer", "Metin", "mustafa", "adem"};

        Arrays.sort(isimler);
        System.out.println(Arrays.toString(isimler)); //[Ali, Metin, Mustafa, Nihan, Omer, adem, mustafa]
                                                      // ASCII table'daki degerlerine gore siralar

        /// DIKKAT : String'teki ozellik burda yok.
        /// Array'de Atama yapilmasa dahi asil degeri degistirir.


    }
}
