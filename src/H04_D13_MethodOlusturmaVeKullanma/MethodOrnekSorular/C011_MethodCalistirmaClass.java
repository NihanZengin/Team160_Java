package H04_D13_MethodOlusturmaVeKullanma.MethodOrnekSorular;

public class C011_MethodCalistirmaClass {
    public static void main(String[] args) {


        C03_AsalMiYazdir.asalMiYazdir(101);

        C03_AsalMiYazdir.asalMiYazdir(55);

        C04_KucukOlmayaniYazdirma.kucukOlaniYazdirma(55,34);

        C05_MetniTerstenYazdir.metniTerstenYazdir("Java candir"); //ridnac avaJ
        System.out.println("\n-------------------------------------------------");


        //asagida verilen metnin palindrom olup olmadigini yazdirin

        String metin ="Java cok guzel";

        String tersMetin=C07_MetniTerseCevirme.metninTersiniDondur("metin"); //konsolda gormeyiz

        if(metin.equalsIgnoreCase(tersMetin)){
            System.out.println("Verilen  metin palinrome");

        }else {
            System.out.println("Verilen  metin palinrome degil");
        }

    }
}
