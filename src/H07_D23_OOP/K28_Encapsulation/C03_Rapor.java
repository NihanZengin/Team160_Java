package H07_D23_OOP.K28_Encapsulation;

public class C03_Rapor {

      /*
        Gorev ve yetkilendirme :
        1- satis bolumundeki personel rapor’un olusmasi icin
           satis tutari'na deger atayabilmeli (write)
           ancak satisTutari'na atanmis olan degerleri gorememeli ( NO Read)

        2- kullanicilar toplamSatisTutari'ni  goruntuleyebilmeli (Read)
           ancaktoplamSatisTutari'na kimse deger atayamamali (NO write)
     */


/*
        Write ve read yetkilerini kontrol altina almak icin
        1- oncelikle datalara access modifier ile baska class'lardan erisilmesini engelle
           access modifier'lari private yapiyoruz

        2- Baska class'lardan goruntulenmesine
           izin vereceginiz datalara GETTER
           Baska class'lardan deger atanmasina
           izin vereceginiz datalara SETTER method'u olusturun
     */

    private double satisTutari;  // write, no read    setter
    // baska class'lardan deger atamasi yapilabilsin
    // ama atanmis degerleri kimse goremesin

    private double toplamSatisTutari ; // no write , read   getter
    // baska class'lardan deger atamasi YAPILAMASIN
    // ama atanmis degeri GOREBILSIN


    public double getToplamSatisTutari() {
        return toplamSatisTutari;
    }


    public void setSatisTutari(double satisTutari) {

        this.satisTutari = satisTutari;

        toplamSatisTutari += satisTutari;


    }
}
