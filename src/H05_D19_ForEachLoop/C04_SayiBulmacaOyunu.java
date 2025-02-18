package H05_D19_ForEachLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C04_SayiBulmacaOyunu {
    public static void main(String[] args) {
        //0 ile 100 arasinda rastgele bir sayi olusturun
        //Kullanicidan herkesin bir sayi tahmin etmesini isteyin
        //girilen sayilari bir liste olarak kaydedein
        //Kullanicilar negatif sayi girs=diginde
        //-olusturulan rastgele sayiyi
        //-yapilan tahminleri
        //-rastgele sayiya en yakin tahmini yazdirin

        Random random=new Random();
        int rastgeleSayi= random.nextInt(100);

        List<Integer> tahminler=new ArrayList<>();



        Scanner scanner=new Scanner(System.in);
        int girilenSayi=0;
        do{
            System.out.print("Tahminleri alalim: ");
            girilenSayi=scanner.nextInt();
            if (girilenSayi>0){
            tahminler.add(girilenSayi);}
            System.out.println("Sonucu gormek icin negatif bir sayi giriniz");
        }while(girilenSayi>=0);

        int enYakinTahmin=tahminler.get(0);
        int tutulanSayiIleEnYakinSayininFarki;

        if (enYakinTahmin<rastgeleSayi){
            tutulanSayiIleEnYakinSayininFarki=rastgeleSayi-enYakinTahmin;
        }else {
            tutulanSayiIleEnYakinSayininFarki=enYakinTahmin-rastgeleSayi;
        }

        for (int each:tahminler){
            int fark;
            if (each>rastgeleSayi){
                fark=each-rastgeleSayi;
            }else {
                fark=rastgeleSayi-each;
            }
            if(fark<tutulanSayiIleEnYakinSayininFarki){
                enYakinTahmin=each;
            }

        }


        System.out.println("Rastgele sayi: "+rastgeleSayi+"\nYapilan tahminler: "+tahminler+"\nEn yakin tahmin: "+enYakinTahmin);
    }
}
