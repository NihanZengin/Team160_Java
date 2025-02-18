package H06_D20_Constructor.ObjelereDegerAtamaVeParametreliConstructor;

public class C13_OkulRunner_ParametreliConstructor {
    public static void main(String[] args) {

        C12_Okul ogr1= new C12_Okul();

        System.out.println(ogr1);
        //C12_Okul{ogrIsim='isim atanmamis', ogrAdres='adres atanmamis', ogrTel='tel atanmamis', ogrSube='sube atanmamis'}

        ogr1.ogrIsim="Ali Can";
        ogr1.ogrAdres="Cankaya";
        ogr1.ogrTel="5324554545";
        ogr1.ogrSube="5-C";

        System.out.println(ogr1);
        //C12_Okul{ogrIsim='Ali Can', ogrAdres='Cankaya', ogrTel='5324554545', ogrSube='5-C'}

        //argument olarak gonderilen isim, adres ve telefon ile obje olusturan bir constructor
        //olusturdugunuz yeni constructor ile bir obje olusturun ve tum ozellikleri yazdirin

        C12_Okul ogr2= new C12_Okul("Veli Cem","Balgat" , "54345656565");
        System.out.println(ogr2);
        //C12_Okul{ogrIsim='Veli Cem', ogrAdres='Balgat', ogrTel='54345656565', ogrSube='sube atanmamis'}



        C12_Okul ogr3= new C12_Okul("Melih Yan","Kizilay" , "5354561212","9-D");
        System.out.println(ogr3);
        //C12_Okul{ogrIsim='Melih Yan', ogrAdres='Kizilay', ogrTel='5354561212', ogrSube='9-D'}



        C12_Okul ogr4= new C12_Okul("Ayse Han","Yildiz","5553697878");
        System.out.println(ogr4);
        //C12_Okul{ogrIsim='Ayse Han', ogrAdres='Yildiz', ogrTel='5553697878', ogrSube='sube atanmamis'}




    }
}
