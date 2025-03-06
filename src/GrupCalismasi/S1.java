package GrupCalismasi;

import java.util.Arrays;
import java.util.Scanner;

public class S1 {
    public static void main(String[] args) {

     /* 4. )
        Kullanıcıdan hasta yaşlarının kayıt altına almasını saglayın
        a)	Kullanıcıdan kayıt edilecek hasta sayisini alınız.
        b)	Kullanıcı eksi yas girer ise yas eksi girilemez kontrol edip tekrar girer misiniz yazdıran yas bilgisini tekrar aldıran
        c)	kullanıcı kayıt işleminden çıkması gerektiginde 0’a basarak kayıt işlemini sonlardırmasını sağlayın.*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kayit isleminden cikis yapmak icin '0' a basiniz \n Kaydedilecek hasta sayisini giriniz: ");

        int hastaSayisi= scanner.nextInt();

        int[] hastaYaslari = new int[hastaSayisi];

        for (int i = 0; i < hastaSayisi; i++) {

            System.out.print("Lutfen kaydedilecek " +(i+1) +". hasta yasini giriniz: ");
            int yas =scanner.nextInt();

            if(yas<0){
                System.out.println("Yas eksi degerde girilemez! \nLutfen kaydedilecek "+(i+1)+ ". hasta yasini giriniz: ");

                yas = scanner.nextInt();
            }
            else if(yas==0){
                break;
            }
            else{
                hastaYaslari[i]=yas;
            }

        }

        System.out.println("Kayit altina alinan hasta yaslari: "+ Arrays.toString(hastaYaslari));





    }
}
