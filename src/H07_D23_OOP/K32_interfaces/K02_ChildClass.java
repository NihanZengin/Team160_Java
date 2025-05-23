package H07_D23_OOP.K32_interfaces;

public class K02_ChildClass extends K01_ParentAbstractClass
                            implements I03_ParentInterface1,I04_ParentInterface2 {

    /*
       Java'da class'lar arasinda
       multiple inheritance YOKTUR
       multiLevel inheritance VARDIR

       Interface'in EN BUYUK AVANTAJI
       multiple inheritance'a IMKAN TANIMASIDIR
       bir child class 1 tane class'a extends edip
       istedigi kadar Interface'i de IMPLEMENT edebilir
   */

    @Override
    public double gramaj() {
         /*
         Eger farkli 2 parent interface'de
         ayni isim ama farkli return type'a sahip method'lar varsa
         iki parent'in dedigini ayni anda yapma sansimiz olmaz
         Bu durumda
         Ya interface'e mudahale edip degistirmek gerekir (tavsiye edilmez)
         ya da iki interface'den birini implement etmekten vazgeceriz
         */
        return 0;
    }

    @Override
    public void boyut() {

         /*
         3 parent'da da abstract void boyut method'u var
         3'u de abstract oldugundan
         child class concrete boyut method'u olusturdugunda
         3 parent'in da boyut() beklentisini karsilamis olur
         */

    }

    @Override
    public String isim() {
         /*
         Her ne kadar Abstract class'da isim method'u concrete olsa da
         abstract class interface'lerin child'i degil
         interface'lerden sonra gelen ilk concrete class
         parent interface'lerdeki abstract kalmis method'lari
         concrete'lestirmelidir
         */
        return "";
    }

    public static void main(String[] args) {

        System.out.println(I03_ParentInterface1.sayi1);
        // I04_ParentInterface2.sayi1 = 24;
        // Cannot assign a value to final variable 'sayi1'


    }

}
