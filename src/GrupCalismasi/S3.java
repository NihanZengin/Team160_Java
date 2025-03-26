package GrupCalismasi;

import java.util.HashMap;
import java.util.Map;

public class S3 {
    public static void main(String[] args) {

      //  Java'da bir Map kullanarak
     //  bir metin içindeki kelimelerin kaç kez tekrarlandığını gosteren bir map yazın.

        String metin = "Java programlama dili java platformunda çalışır Java";

        Map<String,Integer> kelimeSayilari= new HashMap<>();

        String[] kelimeler =metin.split(" ");

//        for(String eachKelime : kelimeler){
//
//            eachKelime=eachKelime.toLowerCase();
//
//            kelimeSayilari.put(eachKelime,kelimeSayilari.getOrDefault(eachKelime,0)+1);
//
//        }

        for (String eachKelime: kelimeler){
            eachKelime=eachKelime.toLowerCase();

            if (kelimeSayilari.containsKey(eachKelime)){
                kelimeSayilari.put(eachKelime, kelimeSayilari.get(eachKelime)+1);
            }
            else kelimeSayilari.put(eachKelime,1);

        }

        System.out.println(kelimeSayilari);






    }

}
