package H09_D25_Maps.CanliDers;

public class C05_HazirlananMethodlariKullanma {

    public static void main(String[] args) {

        // ismi sevgi olan ogrencilerin
        // isim, soyisim ve siniflarini liste olarak yazdirin

        OgrenciMapClass.isimListesiYazdir("sevgi");
        // Sevgi Cem 11
        // Sevgi Can 10

        OgrenciMapClass.isimListesiYazdir("veli");
        // Veli Cem 10


        OgrenciMapClass.isimListesiYazdir("ali");
        // Ali Can 10
        // Ali Cem 11

        OgrenciMapClass.sinifSubeOgrenciListesiYazdirma("10","K");
        //10/K subesindeki ogrenci listesi
        //102 Veli Cem
        //106 Sevgi Can

        OgrenciMapClass.soyisimdenOgrenciBilgiYAzdirma("can");
        //Soyadi can olan ogrenci listesi
        //101 10 H Ali
        //104 10 H Ayse
        //106 10 K Sevgi
    }
}
