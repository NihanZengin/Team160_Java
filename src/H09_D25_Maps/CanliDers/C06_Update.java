package H09_D25_Maps.CanliDers;

import java.util.Set;

public class C06_Update extends OgrenciMapClass {

    public static void main(String[] args) {


        //ogrenciMap'teki 101 nolu ogrencinin bilgilerini
        // "Fadime-Cem-11-L-Say" olarak guncelleyin

        //eger tum value verilirse guncelleme icin put veya replace kullanabiliriz

        ogrenciMap.replace(101, "Fadime-Cem-11-L-Say");

        System.out.println(ogrenciMap);


        //10/K sinifindaki ogrencilerin siniflarini 10/Z olarak guncelleyin

        // 1.adim : tum key'leri elde edelim
        Set<Integer> ogrenciKeySeti = ogrenciMap.keySet();  // [101, 102, 103, 104, 105, 106, 107]

        // 2.adim : tum key'leri tek tek ele alip,
        //          o key'e ait value'yu incelemek icin bir loop olusturalim

        System.out.println("11 / K subesindeki ogrenci listesi");

        for (Integer eachKey : ogrenciKeySeti
        ) {

            // 3.adim :  eachKey bize tek tek herbir ogrenci numarasini getirir
            //           bizim o ogrenci numarasina ait value'yu kaydetmemiz gerekir

            String eachValue = ogrenciMap.get(eachKey); // "Ali-Can-10-H-MF"

            // 4.adim : value'yu bir butun olarak kaydettik
            //          ismi kontrol edebilmemiz icin once - ile split edip
            //          bir array olarak kaydedebiliriz

            String[] eachValueArr = eachValue.split("-"); // [Ali, Can, 10, H, MF]

            // 5.adim : ARTIK istenen islemi yapabiliriz
            //10/K sinifindaki ogrencilerin siniflarini 10/Z olarak guncelleyin

            if(eachValueArr[2].equals("10")&& eachValueArr[3].equals("K")){
                eachValueArr[3]="Z";
            }

            //DIKKAT: Update sorularinda 5. adima kadar her sey ayni
            //Ancak bu adimdan sonra Array'de yaptigimiz bu Update'i Map'e islememiz gerek
            //Bunun icin iki yeni adim eklemek gerek


            ///6. adim: array'i yeniden bir String haline getireleim

            String yeniValue= String.join("-",eachValueArr);


            ///7. adim: eachKey ve yeniValue ile map'i update edelim

            ogrenciMap.replace(eachKey,yeniValue);

        }
    }
}
