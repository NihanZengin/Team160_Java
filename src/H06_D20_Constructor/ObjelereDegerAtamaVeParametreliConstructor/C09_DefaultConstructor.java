package H06_D20_Constructor.ObjelereDegerAtamaVeParametreliConstructor;

public class C09_DefaultConstructor {
    public static void main(String[] args) {



    /*
    Bir class'ta default constructor kullaniliyorsa
    olusturulan TUM objeler class'ta atanmis olan ilk degerlere sahip olur

     */


       // C08_Araba() class'dan bir obje olusturup ozelliklerini yazdirin

        C08_Araba araba1= new C08_Araba();

        System.out.println(araba1.marka);//Toyota
        System.out.println(araba1.model);//Corola
        System.out.println(araba1.renk);//Siyah
        System.out.println(araba1.yil);//2012
        System.out.println(araba1.fiyat);//3000

        araba1.marka="Audi";
        araba1.model="A6";
        araba1.renk="gri";
        araba1.yil=2012;
        araba1.fiyat=6000;

    }
}
