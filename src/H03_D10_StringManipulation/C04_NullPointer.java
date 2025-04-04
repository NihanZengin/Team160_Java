package H03_D10_StringManipulation;

public class C04_NullPointer {
    public static void main(String[] args) {

        String isim1 = ""; // hiclik degeri atanmis
        String isim2;
        String isim3 = null; // null olarak isaretlenmis

        // isim1' i yazdirin
        System.out.println(isim1); // bos bir satir yazdirir

        // isim1'in length'ini yazdirin
        System.out.println(isim1.length()); // 0

        /*
                isim1'e bir deger atanmistir,
                Java acisindan atanan degerin Ali, Veli olmasi ile "" olmasi arasinda bir fark yoktur

                EGER Java'dan deger atanmayan variable'lari istersek
                isim 1'i bize getirmez, cunku onun bir degeri var
         */




        // isim2' i yazdirin
        // System.out.println(isim2);  // Variable 'isim2' might not have been initialized
        // isim2'ye deger atanmamis olabilir


        // isim2'in length'ini yazdirin
        // System.out.println(isim2.length());  // atama yapilmadigindan kullanmamiza izin vermez

        /*
                Bir method icerisinde(local) deger atamadan variable deklare edebiliriz,
                AMMA deger atamadan kullanmak istersek
                Java altini kirmizi cizer ve kullanmamiza izin vermez (Compile Time Error, CTE)
         */




        // isim3' i yazdirin
        System.out.println(isim3); // null
        System.out.println("ogrenci ismi : " + isim3); // ogrenci ismi : null
        // isim3'in length'ini yazdirin
        System.out.println(isim3.length()); // NullPointerException

        /*
                null pointer bir deger degil ISARETCIDIR
                her ne kadar = isareti ile kullanilsa da
                Java null'un bir deger degil isaretci oldugunu bilir

                - deger atanmayanlari istemek icin null olarak isaretlenenleri getir diyebiliriz
                - yazdirmak istersek YAZDIRABILIRIZ
                - AMMA baska hic bir islemde KULLANAMAYIZ.
                  kullanmaya kalkarsaniz Java altini cizmez ama calistirinca NullPointerException verir
         */
    }
}
