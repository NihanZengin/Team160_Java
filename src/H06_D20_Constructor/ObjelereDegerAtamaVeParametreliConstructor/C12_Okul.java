package H06_D20_Constructor.ObjelereDegerAtamaVeParametreliConstructor;

public class C12_Okul {

    String ogrIsim="isim atanmamis";
    String ogrAdres="adres atanmamis";
    String ogrTel="tel atanmamis";
   String ogrSube="sube atanmamis";

    @Override
    public String toString() {
        return "C12_Okul{" +
                "ogrIsim='" + ogrIsim + '\'' +
                ", ogrAdres='" + ogrAdres + '\'' +
                ", ogrTel='" + ogrTel + '\'' +
                ", ogrSube='" + ogrSube + '\'' +
                '}';
    }

    C12_Okul(){
       //bu constructeri, asagida parametreli yazdigimiz constructor sebebiyle
       // default constructor java tarafindan otomatik silindigi icin
       //Runner clasinda default constructer kullanilarak
       // bir obje olusturabilmek icin ihtiyac duydugumuz
       // parametresiz ve body'sinde kod olmayan default constructer yerine gecmesi icin
       // yazmak durumunda kaliyoruz..
   }

   C12_Okul(String isim, String adres,String tel){
       ogrIsim=isim;
       ogrAdres=adres;
       ogrTel=tel;


       //bunu her bir ogrenci icin yeni bir obje olusturup
       // her bir degeri tek tek girmemek icin
       // direk objenin parantezinde yazabilmek icin olusturduk.
       //Ama bu parametreli constructor'i olusturdugumuz icin
       // Java gorunmeyen default constructor'i siliyor.
       //Default constructer olmadan diger class'ta
       // default constructer'li bir obje olusturamadigimiz icin
       // yukarda default constructor yerine gececek
       // body'si bos ve parametresiz bir constructer olusturduk
   }

    C12_Okul(String isim, String adres,String tel,String sube){
        ogrIsim=isim;
        ogrAdres=adres;
        ogrTel=tel;
        ogrSube=sube;
   }


}
