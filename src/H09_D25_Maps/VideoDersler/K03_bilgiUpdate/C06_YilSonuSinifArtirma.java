package H09_D25_Maps.VideoDersler.K03_bilgiUpdate;

import H09_D25_Maps.VideoDersler.K02_bilgilereUlasmaVeListeleme.OgrenciMap;

public class C06_YilSonuSinifArtirma extends OgrenciMap {

    public static void main(String[] args) {

        // Yil sonu sinif artirma yapin
        // her ogrenciyi bir ust sinifa gecirin
        // sinif 12 ise "mezun" yapin, zaten mezun olanlara dokunmayin

        System.out.println(ogrenciMap);

        yilsonuSinifArtir();

        System.out.println(ogrenciMap);

        yilsonuSinifArtir();

        System.out.println(ogrenciMap);


    }
}
