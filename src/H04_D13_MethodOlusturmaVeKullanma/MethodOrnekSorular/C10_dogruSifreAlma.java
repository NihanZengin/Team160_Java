package H04_D13_MethodOlusturmaVeKullanma.MethodOrnekSorular;

import java.util.Scanner;

public class C10_dogruSifreAlma {
    public static void main(String[] args) {
        //Kullanicidan bir sifre isteyin
        //C09 daki methodu kullanarak sifreyi kontrol edin
        // ve sifre uygun oluncaya kadar islemi tekrar edin
        //sifre uygun oldugunda kac denemede uygun sifre yazabildigini soyleyin

        Scanner scan= new Scanner(System.in);

        String sifre="";
        boolean sifreGecerliMi=false;

        for (int i=1; i<10000; i++){
            System.out.println("Lutfen sifrenizi giriniz...");
            sifre=scan.nextLine();

            //sifrenin gecerli olup olmadigini kontrol edip sonucu kaydedelim.
            sifreGecerliMi=C09_SifreKontrol.sifreGecerliMi(sifre);

            if(sifreGecerliMi==true){
                System.out.println(i + " denemede gecerli sifre girdiniz");
                break;
            }
        }



    }


}
