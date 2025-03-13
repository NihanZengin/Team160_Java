package H09_D25_Maps.VideoDersler.K03_bilgiUpdate;

import H09_D25_Maps.VideoDersler.K02_bilgilereUlasmaVeListeleme.OgrenciMap;

public class C03_YeniOgrenciEkleme extends OgrenciMap {
    public static void main(String[] args) {

        // Kullanicidan numara, isim, soyisim, sinif, sube ve bolum bilgilerini alip
        // ogrenciyi map'e kaydeden bir method olusturun


        OgrenciMap.kullanicidanAlinanBilgilerleOgrenciEkle();

        System.out.println(OgrenciMap.ogrenciMap);

    }
}
