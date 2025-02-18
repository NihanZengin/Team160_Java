package H06_D20_Constructor.ObjelereDegerAtamaVeParametreliConstructor;

public class C11_CarRunner_toString {
    public static void main(String[] args) {

        //C10_Car class'indan bir obje olusturup tum ozelliklerini yazdirin

        C10_Car car1= new C10_Car();

        System.out.println(car1.toString());
        //C10_Car: marka='marka atanmamis', model='model atanmamis', renk='renk atanmamis', yil=1900, fiyat=0

        System.out.println(car1); //Sadece toString'e ozel olarak onu yazmadan da olur.
        //C10_Car: marka='marka atanmamis', model='model atanmamis', renk='renk atanmamis', yil=1900, fiyat=0



        //olusturdugunuz objeye kendi istediginiz degerleri atayin ve tum ozellikleri tekrar yazdirin

        car1.marka="Audi";
        car1.model="A4";
        car1.renk="Siyah";
        car1.yil=2014;
        car1.fiyat=10000;

        System.out.println(car1);
    }
}
