package H04_D14_WhileLoop;

import H04_D13_MethodOlusturmaVeKullanma.MethodOrnekSorular.C09_SifreKontrol;

import java.util.Scanner;

public class C04_BasariliSifreAlma {
    public static void main(String[] args) {

        //Daha once yaptigimiz sifre kontrolu method'unu kullanarak
        //kullanici haasiz bir sifre girinceye kadar tekrar tekrar sifre isteyin
        //kabul edilebilir bir sifre girdiginde "Sifreniz basariyla kazdedildi" yazdirin.

        Scanner scanner=new Scanner(System.in);
        boolean tekrarSorayimMi=true;
        String girilenSifre="";

        while (tekrarSorayimMi){
            System.out.println("Lutfen sifrenizi giriniz...");

            girilenSifre=scanner.nextLine();

            tekrarSorayimMi=!C09_SifreKontrol.sifreGecerliMi(girilenSifre);
        }
        System.out.println("Sifreniz basariyla kazdedildi");
    }

}
