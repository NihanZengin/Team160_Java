package H09_D25_Maps.VideoDersler.K03_bilgiUpdate;

import H09_D25_Maps.VideoDersler.K02_bilgilereUlasmaVeListeleme.OgrenciMap;

public class C05_BolumUpdate extends OgrenciMap {

    public static void main(String[] args) {
        // ogrenci map'inde tum ogrencileri gozden gecirip
        // verilen eskiBolum bilgisine sahip olanlari
        // yeniBolum olarak update edin


        String eskiBolum = "TM";
        String yeniBolum = "EA";

        System.out.println(ogrenciMap);

        bolumUpdate(eskiBolum,yeniBolum);
        bolumUpdate("MF","Say");

        System.out.println(ogrenciMap);


    }
}
