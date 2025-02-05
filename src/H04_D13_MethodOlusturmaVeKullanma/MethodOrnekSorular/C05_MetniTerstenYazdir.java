package H04_D13_MethodOlusturmaVeKullanma.MethodOrnekSorular;

public class C05_MetniTerstenYazdir {
    public static void main(String[] args) {
        // verilen metni tersten yazdiran bir method olusturun

        metniTerstenYazdir("Java bu isi cozmus");

    }

    public static void metniTerstenYazdir(String metin){

        for (int i=metin.length()-1; i>=0 ; i--){
            System.out.print(metin.charAt(i));
        }
    }
}
