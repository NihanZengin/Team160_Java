package H09_D25_Maps.VideoDersler.K01_mapOlusturma_temelMapMetodlari;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C01_OgrenciMap {

    public static void main(String[] args) {

        Map< Integer, String> ogrenciMap = new HashMap<>();

        ogrenciMap.put(101,"Ali-Can-11-H-MF");
        ogrenciMap.put(102,"Veli-Cem-10-K-TM");
        ogrenciMap.put(103,"Ali-Cem-11-K-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");
        ogrenciMap.put(105,"Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106,"Sevgi-Can-10-K-MF");
        ogrenciMap.put(107,"Esra-Han-11-M-SOZ");

        System.out.println(ogrenciMap);


        // 103 numarali ogrencinin value'sunu yazdirin

        System.out.println(ogrenciMap.get(103)); // Ali-Cem-11-K-TM
        System.out.println(ogrenciMap.get(105)); // Sevgi-Cem-11-M-TM

        // olmayan bir key ile value'yu yazdirsak
        System.out.println(ogrenciMap.get(111)); // null

        // aranan key yoksa standart bir cevap yazmasini istersek
        System.out.println(ogrenciMap.getOrDefault(103, "Aranan key map'de yok")); // Ali-Cem-11-K-TM
        System.out.println(ogrenciMap.getOrDefault(113, "Aranan key map'de yok")); // Aranan key map'de yok

        // butun key'leri yazdirin
        System.out.println(ogrenciMap.keySet()); //  [101, 102, 103, 104, 105, 106, 107]

        // butun key'leri kaydedin
        Set<Integer> ogrenciKeySeti = ogrenciMap.keySet();

        System.out.println("Ogrenci key seti : " + ogrenciKeySeti);
        // Ogrenci key seti : [101, 102, 103, 104, 105, 106, 107]


        // ogrenci map'inde 107 numarali ogrenci var mi ?
        System.out.println(ogrenciMap.containsKey(107)); // true
        System.out.println(ogrenciMap.containsKey(127)); // false

        // tum value'leri yazdirin

        System.out.println(ogrenciMap.values());
        // [Ali-Can-11-H-MF, Veli-Cem-10-K-TM, Ali-Cem-11-K-TM, Ayse-Can-10-H-MF, Sevgi-Cem-11-M-TM, Sevgi-Can-10-K-MF, Esra-Han-11-M-SOZ]

        // tum value'leri kaydedin
        Collection<String> ogrenciValueCollection = ogrenciMap.values();
        System.out.println("Ogrenci value'leri : " + ogrenciValueCollection);
        // Ogrenci value'leri : [Ali-Can-11-H-MF, Veli-Cem-10-K-TM, Ali-Cem-11-K-TM, Ayse-Can-10-H-MF,
        //                       Sevgi-Cem-11-M-TM, Sevgi-Can-10-K-MF, Esra-Han-11-M-SOZ]


        // value'larda Ali var mi ?
        System.out.println(ogrenciMap.containsValue("Ali")); // false
        System.out.println(ogrenciMap.containsValue("H")); // false
        System.out.println(ogrenciMap.containsValue("Ali-Can-11-H-MF")); // true

        /*
         value'larda Ali var mi ?
         bir loop ile value collection'indaki tum String value'leri kontrol edip
         Ali var mi bilgisine ulasabiliriz
         */


               /*
            {
                101=Ali-Can-11-H-MF,
                102=Veli-Cem-10-K-TM,
                103=Ali-Cem-11-K-TM,
                104=Ayse-Can-10-H-MF,
                105=Sevgi-Cem-11-M-TM,
                106=Sevgi-Can-10-K-MF,
                107=Esra-Han-11-M-SOZ
                }
         */
        System.out.println(ogrenciMap.size()); // 7

        ogrenciMap.replace(101,"Hasan-Can-11-H-MF"); // varsa update eder
        ogrenciMap.replace(110,"Hasan-Can-11-H-MF"); // yoksa eklemez

        ogrenciMap.put(102,"Veli-CEM-10-K-TM"); // varsa update eder
        ogrenciMap.put(110,"Veli-CEM-10-K-TM"); // yoksa ekler


        ogrenciMap.replace(105,"Sevgi-Cem-11-M-TM","Sevgi-HAYAT-11-M-TM");
        ogrenciMap.replace(107,"Sevgi-Cem-11-M-TM","Kemal-Cem-11-M-TM");


       /*
         var olan key'ler icin put ile replace ayni islevi yapar
         olmayan bir key icin replace hicbir islem yapmaz ama put elemani ekler

         3 parametre kullanirsak,
         eski value'yu kontrol eder, verilen eski value ile ayni ise update eder
                                                            ayni degilse update etmez
        */

        ogrenciMap.remove(104);
        ogrenciMap.remove(117);

        ogrenciMap.remove(102,"Veli-CEM-10-K-TM"); // verilen key'e ait value verildigi gibi oldugundan ogrenciyi siler
        ogrenciMap.remove(105,"Veli-CEM-10-K-TM"); // verilen key'e ait value verilenden farkli oldugundan ogrenciyi silmez

        System.out.println(ogrenciMap);



    }
}
