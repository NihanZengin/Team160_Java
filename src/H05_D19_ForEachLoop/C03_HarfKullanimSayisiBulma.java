package H05_D19_ForEachLoop;

import java.util.Scanner;

public class C03_HarfKullanimSayisiBulma {
    public static void main(String[] args) {
        //Kullanicidan bir cumle ve bir harf ali, harf cumlede kullanilmissa kac kere kullanildigini yazdirin
        //kullanilmamissa harf cumlede kullanilmamis yazdirin.

        Scanner scanner=new Scanner(System.in);
        System.out.print("Lutfen bir cumle giriniz: ");
        String cumle= scanner.nextLine();
        System.out.print("Lutfen aranacak harfi giriniz: ");
        String aranacakHarf= scanner.nextLine().substring(0,1);

        String[] karakterlerArr=cumle.split(""); //cumledeki tum karakterleri array'e eleman olarak aliyorum

        //System.out.println(Arrays.toString(karakterlerArr));
        //[J, a, v, a,  , b, i, z, i,  , d, u, s, u, n, u, r]

        int sayac=0;
        for (String each : karakterlerArr){
            if(each.equalsIgnoreCase(aranacakHarf)){
                sayac++;
            }
        }

        if (sayac==0){
            System.out.println("Harf cumlede bulunmamaktadir");
        }else System.out.println("Aranan "+aranacakHarf+" harfi cumlede "+sayac+" adet bulunmaktadir.");




    }
}
