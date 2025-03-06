package GrupCalismasi;

import java.util.Arrays;
import java.util.Scanner;

public class S2 {
    public static void main(String[] args) {


     /* 4. )
        Kullanıcıdan hasta yaşlarının kayıt altına almasını saglayın
        a)	Kullanıcıdan kayıt edilecek hasta sayisini alınız.
        b)	Kullanıcı eksi yas girer ise yas eksi girilemez kontrol edip tekrar girer misiniz yazdıran yas bilgisini tekrar aldıran
        c)	kullanıcı kayıt işleminden çıkması gerektiginde 0’a basarak kayıt işlemini sonlardırmasını sağlayın.*/


        Scanner scanner= new Scanner(System.in);
        System.out.println("Kayit isleminden cikmak icin '0' a basiniz.. \nKaydedilecek hasta sayisini giriniz: ");
        int hastaSayisi= scanner.nextInt();
        int[] hastaYaslari= new int[hastaSayisi]; //[0, 0, 0, 0, 0, 0]


        for (int i = 0; i < hastaSayisi; i++) {

            System.out.println("Lutfen kaydedilecek " + (i+1)+ ". hasta yasini giriniz: ");
            int yas = scanner.nextInt();

            while(yas<0){
                System.out.println("Yas eksi girilemez! \nLutfen kontrol ederek kaydedilecek "+(i+1)+ ". hasta yasini giriniz: ");

                yas= scanner.nextInt();
            }

            if(yas==0){
                System.out.println("Kayit islemini sonlandirniz..");
                break;
            }

            hastaYaslari[i]=yas;
        }

        System.out.println("Kaydedilen hasta yaslari: "+ Arrays.toString(hastaYaslari));

        yazdirKullanimSayisi(hastaYaslari,12);

    }

    // Hastalardan belirtilen yasta kac hasta oldugunu bulmak uzere method olusturun.

    public static void yazdirKullanimSayisi(int[] arr, int arananEleman){

        int sayac=0;

        for (int i = 0; i <arr.length ; i++) {

            if (arr[i]==arananEleman){
                sayac++;
            }
        }

        if (sayac==0){
            System.out.println(arananEleman+ " yasinda listede hasta bulunmamaktadir. ");
        }
        else{
            System.out.println(arananEleman+ " yasinda listede "+ sayac + " hasta bulunmaktadir.");
        }
    }
}
