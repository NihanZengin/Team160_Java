package H05_D18_ArrayList.Sorular;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_Next {
    public static void main(String[] args) {


    //Verilen String bir listede
    //istenmeyen harfi iceren elementleri silip,
    //kalan kismini list olarak bize donduren bir method olusturun

        List<String> isimler = new ArrayList<>(Arrays.asList("Ali", "Veli", "Cemil", "Ayse", "Fatma", "Hatice"));

        System.out.println(istenmeyenElementiSil(isimler, "a"));//[Ali, Veli, Cemil, Ayse]

    }
    public static List<String> istenmeyenElementiSil (List<String> isimler , String istenmeyenHarf){

        for (int i = 0; i < isimler.size(); i++) {
        if (isimler.get(i).contains(istenmeyenHarf)){
            isimler.remove(isimler.get(i));
            i--;
        }
         }
        return isimler;

    }

}
