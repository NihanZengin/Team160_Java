package H09_D25_Maps.VideoDersler.K03_bilgiUpdate;

import H09_D25_Maps.VideoDersler.K02_bilgilereUlasmaVeListeleme.OgrenciMap;

public class C02_SoyisimUpdate extends OgrenciMap {

    public static void main(String[] args) {

        // ogrenci map'inde numarasi ve yeni soyismi verilen ogrencinin
        // eski soyisminin yerine yeni soyismi kaydedin

        int ogrenciNo = 102;
        String yeniSoyisim = "Kaya";


        numaraIleSoyisimUpdate(102,"Kaya");
        numaraIleSoyisimUpdate(103,"Gunes");
        numaraIleSoyisimUpdate(104,"Celik");


        System.out.println(ogrenciMap);

    }
}
