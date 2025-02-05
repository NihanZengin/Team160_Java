package H04_D13_MethodOlusturmaVeKullanma.MethodNicinKullanilir;

public class C01_KendiSubstringMethodumuz {
    public static void main(String[] args) {


        /*
        Kullanicidan alinan bir metinden
        kullanicinin girdigi baslangic ve bitis indexleri arasindaki kismi yazdirin.

        Kurallar:
        1- eger baslangic veya bitis index'i negatif veya metnin sinirlari disinda ise hata verin
        2- baslangic index'i bitis index'inden buyukse hata mesaji verin
        3- baslangic index'indeki karakter dahil, bitis index'indeki karakter haric olmalidir.


         */

        String str = "Java candir";

        int basIndex=2;
        int bitIndex=6;

        if (basIndex<0 || bitIndex<0 || basIndex>=str.length() || bitIndex>=str.length()){
            System.out.println("Girilen baslangic ve bitis degerleri gecersiz");
        }
        else if (basIndex>bitIndex){
            System.out.println("Baslangic index'i bitis index'inden buyuk olamaz");
        }
        else{
            for (int i = basIndex; i <bitIndex ; i++) {
                System.out.println(str.charAt(i));

            }
        }

        System.out.println(str.substring(basIndex,bitIndex)); // bu islem hata kodlarini yazdirmaz. Hata oldugunda Exeption verir
        /*
        Ama bu kadar kod yazmak yerine, Hazir method'u kullanmak her zaman tercih ederiz
         */
    }
}
