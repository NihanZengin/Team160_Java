package H06_D20_Constructor.Giris;

public class C03_OkulRunner {
    public static void main(String[] args) {

        //C02_Okul class'indan bir obje olusturup; objeyi kullanalim

        C02_Okul ogrenci1=new C02_Okul(); //obje

        System.out.println(ogrenci1.ogrIsim); // isim atanmamis

        ogrenci1.ogrIsim= "Ali";
        ogrenci1.ogrAdres="Cankaya";
        ogrenci1.ogrTel="05322343434";

        System.out.println(ogrenci1.ogrIsim);
        System.out.println(ogrenci1.ogrAdres);
        System.out.println(ogrenci1.ogrTel);






        //C02_Okul class'indan bir obje deklare edip deger atamasi yapmayalim
        //ve objeyi kullanmaya calisalim

        C02_Okul ogrenci2;

        //System.out.println(ogrenci2); // kirmizi cizdi
        //bir obje icin constructor calismazsa
        //o obje olusturulup ilk deger atamasi (initialiye) YAPILAMAZ
        // ogrenci2'ye deger atanmadigi icin
        //kullanmamiza Java izin vermez CTE olusur

        C02_Okul ogrenci3=null;
        //System.out.println(ogrenci3.ogrIsim); //NullPointerException
        //burada kirmizi cizmedi ama yine obje olusmadi. Yazdiramayiz







        //C02_Okul class'indan deklare etmeden bir obje olusturup kullanalim

        System.out.println(new C02_Okul().ogrIsim); //isim atanmamis

        new C02_Okul().ogrIsim="Mehmet"; //bunu bir obje ismiyle kaydetmedigimiz icin
                                        //sadece bu satirda kullansak bile daha sonra kullanamayiz


        /*

                obje deklare edilip, constructor calisirsa
                obje sorunsuz kullanilir.(ogrenci1)


                obje deklare edilip, constructor calismazsa,
                obje olusturulmus olmaz,
                dolayisiyla objenin hic bir ozelligi kullanilamaz.(ogrenci2)


                obje dejlare edilmeden, constructor calisirsa
                objenin bir ismi olmaz,
                SADECE olusturuldugu satirda kullanilabilir,
                sonraki satira gecildiginde obje cop olur.
         */

    }
}
