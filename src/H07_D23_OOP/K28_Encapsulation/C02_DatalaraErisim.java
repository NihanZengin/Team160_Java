package H07_D23_OOP.K28_Encapsulation;

public class C02_DatalaraErisim {

      /*
        Access modifier kullanarak
        Write ve Read yetkilerini
        birbirinden AYIRAMAZSINIZ

        Access modifier ile bir dataya ulasabiliyorsak
        o dataya hem deger atayabilir (Write)
                 hem de o datayi goruntuleyebiliri (Read)
     */


    public static void main(String[] args) {


        // C01_Datalar.dataPrivS = 24; // 'dataPrivS' has private access
        // System.out.println(C01_Datalar.dataPrivS);
        // baska class'daki private datalara DIREKT erisim MUMKUN DEGILDIR


        C01_Datalar.dataDefS = true;
        System.out.println(C01_Datalar.dataDefS);
        // Ayni package'da oldugu icin
        // hem deger atamasi yapabiliyorum (Write)
        // hem de goruntuleyebiliyorum (Read)

        C01_Datalar.dataProS = 2.4f;
        System.out.println(C01_Datalar.dataProS);
        // Ayni package'da oldugu icin
        // hem deger atamasi yapabiliyorum (Write)
        // hem de goruntuleyebiliyorum (Read)


        C01_Datalar.dataPubS = 12;
        System.out.println(C01_Datalar.dataPubS);
        // public datalara heryerden ulasilabilir
        // hem deger atamasi yapabiliyorum (Write)
        // hem de goruntuleyebiliyorum (Read)

        C01_Datalar obj = new C01_Datalar();

        // obj.dataPri = "ali"; // 'dataPri' has private access
        // System.out.println(obj.dataPri);
        // baska class'daki private datalara DIREKT erisim MUMKUN DEGILDIR


        obj.dataDef = 'h';
        System.out.println(obj.dataDef);

        obj.dataPro = 23;
        System.out.println(obj.dataPro);

        obj.dataPub = 234;
        System.out.println(obj.dataPub);

    }


    public void method1(){

    }
}
