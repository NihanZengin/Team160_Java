package H07_D23_OOP.K28_Encapsulation;

public class C04_RaporDatalariniKullanma {

    public static void main(String[] args) {

        C03_Rapor obj = new C03_Rapor();

        // satis tutari ve toplam satis tutarini
        // encapsule ettigimiz icin
        // bu datalara direkt erisim MUMKUN DEGILDIR
//        obj.satisTutari = 34 ;
//        System.out.println(obj.satisTutari);
//        obj.toplamSatisTutari = 45;
//        System.out.println(obj.toplamSatisTutari);


        obj.setSatisTutari(100);
        obj.setSatisTutari(300);

        // System.out.println(obj.setSatisTutari(500));
        // Cannot resolve method 'println(void)'

        obj.setSatisTutari(500);
        obj.setSatisTutari(1000);


        System.out.println(obj.getToplamSatisTutari());

        // obj.getToplamSatisTutari() = 5000;

    }
}
