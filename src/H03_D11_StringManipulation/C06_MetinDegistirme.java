package H03_D11_StringManipulation;

import java.util.Scanner;

public class C06_MetinDegistirme {
    public static void main(String[] args) {

        // Kullanicidan ismini alin
        // Kullanici 3 isimli olsa da
        // isimlerin ilk harfi buyuk harf, kalanlar * olacak sekilde yazdirin
        // Ornek input  : ali mert can
        //       output : A** M*** C**


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen isminizi giriniz...");
        String isim = scanner.nextLine();



        int ilkBoslukIndex=isim.indexOf(" ");
        int ikinciBoslukIndex=isim.indexOf(" ",ilkBoslukIndex+1);

        System.out.println(
                isim.substring(0, 1).toUpperCase() + isim.substring(1,ilkBoslukIndex).replaceAll("\\w","*")+

                " "+isim.substring(ilkBoslukIndex + 1, ilkBoslukIndex + 2).toUpperCase() +
                        isim.substring(ilkBoslukIndex+2,ikinciBoslukIndex).replaceAll("\\w","*")+


                " "+isim.substring(ikinciBoslukIndex + 1, ikinciBoslukIndex + 2).toUpperCase()+
                        isim.substring(ikinciBoslukIndex+2,isim.length()-1).replaceAll("\\w","*"));


/** Yukaridaki cozum kullanicinin yalnizca uc isim girdigi halde calisiyor.
 *  daha kapsamli bir cozum icin asagidaki ogretmenin cozumune bakiniz*/




//
//        int ilkSpaceIndex = isim.indexOf(" "); // space yoksa (tek isim) ==> -1
//        // space varsa (birden fazla isim) != -1
//
//        int ikinciSpaceIndex = isim.indexOf( " " , ilkSpaceIndex+1 );
//
//
//        // space'lerin index'lerini inceleyerek
//        // ismin 1,2 veya 3 kelimeden olustuguna karar verelim
//
//        int isimSayisi = 0;
//
//        if (ilkSpaceIndex == -1){ // hic space yok
//            isimSayisi = 1;
//        } else if ( ikinciSpaceIndex == -1 ) { // ilk space var, ikinci space yok
//            isimSayisi = 2;
//        }else{
//            isimSayisi = 3;
//        }
//
//
//        switch (isimSayisi){
//
//            case 1 :  // tek isim    ornek : cemil
//
//                System.out.println(
//                        isim.substring(0,1).toUpperCase()+
//                                isim.substring(1).replaceAll("\\w","*")
//                );
//
//                break;
//            case 2 :  // iki isim ornek :  mert can
//
//                System.out.println(
//
//                        isim.substring(0,1).toUpperCase()+
//                                isim.substring(1,ilkSpaceIndex).replaceAll("\\w","*")   +
//                                " "+
//                                isim.substring(ilkSpaceIndex+1,ilkSpaceIndex+2).toUpperCase()+
//                                isim.substring(ilkSpaceIndex+2).replaceAll("\\w","*")
//
//                );
//
//
//
//                break;
//
//            default:  // 3 isimli   ornek :  ali mert can
//                System.out.println(
//
//                        isim.substring(0,1).toUpperCase()+
//                                isim.substring(1,ilkSpaceIndex).replaceAll("\\w","*")   +
//                                " "+
//                                isim.substring(ilkSpaceIndex+1,ilkSpaceIndex+2).toUpperCase()+
//                                isim.substring(ilkSpaceIndex+2,ikinciSpaceIndex).replaceAll("\\w","*")+
//                                " "+
//                                isim.substring(ikinciSpaceIndex+1,ikinciSpaceIndex+2)  .toUpperCase()+
//                                isim.substring(ikinciSpaceIndex+2).replaceAll("\\w","*")
//
//                );
//
//        }

    }
}
