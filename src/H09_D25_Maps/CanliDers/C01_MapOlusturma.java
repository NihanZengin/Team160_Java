package H09_D25_Maps.CanliDers;

import java.util.HashMap;
import java.util.Map;

public class C01_MapOlusturma {

    public static void main(String[] args) {
        /*
        Bir map olusturmadan once
        icine koyacagimiz datalari inceleyip
        bazi kararlar vermeliyiz

        1- Tum elemanlar hangi ortak ozellikleri tasiyor
            no, isim , soyisim , sinif , sube , bolum

        2- Tutacagimiz bilgilerden hangileri Unique ve
           hangisi key olarak belirlenecek.
           key olarak no kullanilacak

        3- key haric geriye kalan bilgileri
           hangi java data turunu kullanarak
           tek bir value haline getirecegiz
           Tek bir String olarak birlestirecegiz

        4-Value icinde bilgi birden fazla olacagi icin
          bu bilgilere sonradan erisebilmek adina
          bu bilgileri birbirinden ayirabilecegimiz
          bir yontem belirlemek
          aralarinda -  kullanacagiz
         */

        Map<Integer,String> ogrenciMap= new HashMap<>(); //HashMap'in parent'i olan Map interfacetir.

        ogrenciMap.put(101,"Ali-Can-10-H-MF");
        ogrenciMap.put(102,"Veli-Cem-10-K-TM");
        ogrenciMap.put(103,"Ali-Cem-11-K-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");
        ogrenciMap.put(105,"Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106,"Sevgi-Can-10-K-MF");
        ogrenciMap.put(107,"Esra-Han-11-M-SOZ");

        System.out.println(ogrenciMap);
        //{101=Ali-Can-10-H-MF,
        // 102=Veli-Cem-10-K-TM,
        // 103=Ali-Cem-11-K-TM,
        // 104=Ayse-Can-10-H-MF,
        // 105=Sevgi-Cem-11-M-TM,
        // 106=Sevgi-Can-10-K-MF,
        // 107=Esra-Han-11-M-SOZ}

        //map key ve value'leri ayri ayri tutar

        // butun keyleri yazdirin

        System.out.println(ogrenciMap.keySet()); //Bir set olarak butun key'leri getirir
        //[101, 102, 103, 104, 105, 106, 107]



        //butun valueleri yazdirin

        System.out.println(ogrenciMap.values());//Bir Collection olarak butun valueleri getirir.
//[Ali-Can-10-H-MF, Veli-Cem-10-K-TM, Ali-Cem-11-K-TM, Ayse-Can-10-H-MF, Sevgi-Cem-11-M-TM, Sevgi-Can-10-K-MF, Esra-Han-11-M-SOZ]


        //103 nolu ogrencinin value'sunu getirin
        System.out.println(ogrenciMap.get(103)); //Ali-Cem-11-K-TM


        //Olmayan bir key no yazarsak
        System.out.println(ogrenciMap.get(110)); //null


        //Eger istersek, eleman yoksa standart bir yazi getirmesini saglayabiliriz.
        System.out.println(ogrenciMap.getOrDefault(104, "Bu ogrenci yok"));
        //Ayse-Can-10-H-MF

        System.out.println(ogrenciMap.getOrDefault(114, "Bu ogrenci yok"));
        //Bu ogrenci yok

        /**
         getOrDefault methodu verilen key varsa value'sunu , key yoksa belirlenen default degerini getirir.
         */


        //numarasi 106 olan ogrenci var mi?
        System.out.println(ogrenciMap.containsKey(106)); //true
        System.out.println(ogrenciMap.containsKey(116)); //false


        //ismi Ali olan ogrenci var mi?
        System.out.println(ogrenciMap.containsValue("Ali")); // false
        //containsValue() verilen degeri bir butun olarak value'lerle karsilastirir.
        //Sadece "Ali" olan bir kayit olmadigi icin false doner
        //Bunu bulmak icin detayli bir kod yazmamiz gerekecek


        //value'su "Sevgi-Cem-11-M-TM" olan bir ogrenci var mi?
        System.out.println(ogrenciMap.containsValue("Sevgi-Cem-11-M-TM")); //true


        //Ogrenci map'ine var olan bir key ile yeni deger eklersek
        ogrenciMap.put(101,"Nihan-Turna-11-K-TM");

        System.out.println(ogrenciMap);
        /*
        {101=Nihan-Turna-11-K-TM,  //onceki degeri silip yenisini ekledi
        102=Veli-Cem-10-K-TM,
         103=Ali-Cem-11-K-TM,
         104=Ayse-Can-10-H-MF,
          105=Sevgi-Cem-11-M-TM,
          106=Sevgi-Can-10-K-MF,
          107=Esra-Han-11-M-SOZ}
          */


        ogrenciMap.putIfAbsent(101,"Nazli-Yilmaz-110-L-Say");
        ogrenciMap.putIfAbsent(110, "Haydar-Turna-12-H-Say");

        System.out.println(ogrenciMap);
        /*
        {101=Nihan-Turna-11-K-TM, //Yoksa ekle dedigimiz icin bunu eklemedi
         102=Veli-Cem-10-K-TM,
         103=Ali-Cem-11-K-TM,
         104=Ayse-Can-10-H-MF,
         105=Sevgi-Cem-11-M-TM,
         106=Sevgi-Can-10-K-MF,
         107=Esra-Han-11-M-SOZ,
         110=Haydar-Turna-12-H-Say} //Yoksa ekle dedigimiz icin bunu ekledi

         */

        ogrenciMap.replace(102,"Fadime-Oncu-11-S-Say");
        ogrenciMap.replace(103, "Emin-Cem-11-K-TM");
        //varolan bir key icin replace() ve put() ayni islevi yapar
        //ANCAKK var olmayanda ise farkli islevleri vardir

        ogrenciMap.replace(111,"Ramazan-Aslan-10-K-TM");
        ogrenciMap.put(112,"Ramazan-Yilmaz-11-K-TM");

        System.out.println(ogrenciMap);

        /*

        {112=Ramazan-Yilmaz-11-K-TM,  //En basa eklemis, siralama garantisi yok
        101=Nihan-Turna-11-K-TM,
        102=Fadime-Oncu-11-S-Say,
        103=Emin-Cem-11-K-TM,
        104=Ayse-Can-10-H-MF,
        105=Sevgi-Cem-11-M-TM,
        106=Sevgi-Can-10-K-MF,
        107=Esra-Han-11-M-SOZ,
        110=Haydar-Turna-12-H-Say}

         */


        //eger verdigimiz key'in value'su spesifik bir deger ise guncelle demek isterseniz

        ogrenciMap.replace(101,"Mehmet-Turna-11-K-TM", "Ayse-Turna-11-K-TM");
        System.out.println(ogrenciMap);
        //oldValue dogru olmadigi icin degistirmedi


        System.out.println(ogrenciMap.size()); //9
        //Map'te kac eleman oldugunu verir


        //map'ten kayit silmek istersek

        ogrenciMap.remove(102);
        ogrenciMap.remove(104,"Sevgi");
        ogrenciMap.remove(104, "Ayse-Can-10-H-MF");




    }
}
