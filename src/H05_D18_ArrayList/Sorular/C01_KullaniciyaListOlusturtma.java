package H05_D18_ArrayList.Sorular;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C01_KullaniciyaListOlusturtma {
    public static void main(String[] args) {
        //Kullanicidan istedigi kadar isim alip, Q ya bastiginda girdigi isimleri bize list olarak dondurecek bir method olusturun

        List<String> isimList = StringListeOlustur();
        System.out.println(isimList);

    }

    public static List<String> StringListeOlustur(){

        List<String> isimler = new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        String girilenIsim="";
        do {
            System.out.println("Listeye eklemek icin Isim giriniz.. " +
                    "\n Bitirmek icin Q'ya basiniz");
            girilenIsim=scanner.nextLine();

            if (! girilenIsim.equalsIgnoreCase("Q")){
                isimler.add(girilenIsim);
            }

        } while (! girilenIsim.equalsIgnoreCase("q"));
        return isimler;
    }
}
