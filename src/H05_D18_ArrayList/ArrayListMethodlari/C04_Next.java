package H05_D18_ArrayList.ArrayListMethodlari;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_Next {
    public static void main(String[] args) {
        //Verilen Integer bir Listedeki tum elementleri istenen miktarda artirip donduren bir method olusturun.

        List<Integer> sayilar1 =new ArrayList<>(Arrays.asList(4,6,1,9,3));
        elementleriArtir(sayilar1,4);
        System.out.println(sayilar1);//[8, 10, 5, 13, 7]
    }
    public static List<Integer> elementleriArtir(List<Integer> sayilar, int artisMiktari){
        for (int i = 0; i < sayilar.size(); i++) {
            sayilar.set(i,sayilar.get(i)+artisMiktari);
        }
        return sayilar;
    }
}
