package H05_D18_ArrayList.Sorular;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_ElementleriSilme {
    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>(Arrays.asList("Ali", "Veli", "Cemil", "Ayse", "Fatma", "Hatice"));

        //isimler listesinde "e" harfi iceren elementleri silin

        System.out.println(isimler); //[Ali, Veli, 'Cemil, Ayse, Fatma, Hatice]

        for (int i = 0; i < isimler.size(); i++) {
            if (isimler.get(i).contains("e")){
                isimler.remove(isimler.get(i));
                i--;
            }
        }
        System.out.println(isimler);// [Ali, Fatma]
    }

}
