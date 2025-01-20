package H02_D05_IfStatements;

import java.util.Scanner;

public class C16_TopluIndirim {
    public static void main(String[] args) {

        // Kullanicidan aldigi urun adedini ve indirimsiz fiyatini alin,
        // kullaniciya musteri karti olup olmadigini sorun.
        // Musteri karti varsa 10 urunden fazla alirsa %20,
        //                        az alirsa %15 indirim yapin,
        // Musteri karti yoksa 10 urunden fazla alirsa %15,
        //                        az alirsa %10 indirim yapin

        Scanner scan=new Scanner(System.in);
        System.out.println("Aldiginiz Urun adedini ve fiyatini giriniz... ");
        System.out.print("Urun adedi: ");
        int adet=scan.nextInt();
        System.out.print("Urun fiyati: ");
        double fiyat =scan.nextDouble();
        System.out.print("Musteri Kartiniz var mi?(E/H)");
        char kart=scan.next().toUpperCase().charAt(0);

        if(kart=='E' && adet>10){
            System.out.println("Indirimli Fiyat: "+(fiyat*0.80));
        }
        else if(kart=='E' ){
            System.out.println("Indirimli Fiyat: "+(fiyat*0.85));
        }
        else if(kart=='H' && adet>10){
            System.out.println("Indirimli Fiyat: "+(fiyat*0.85));
        }
        else if(kart=='H'){
            System.out.println("Indirimli Fiyat: "+(fiyat*0.90));
        }
        //Burada tum durumlari yazdigimiz icin else yazmak zorunda degilim,
        //else yazilmazsa bazi ihtimallerin sorgulanmamasi durumu ortaya cikabilir. Bu sebeple dikkat etmek gerek.
    }
}
