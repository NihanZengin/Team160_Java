package H03_D09_StringManipulation;

import java.util.Scanner;

public class C04_Soru4 {
    public static void main(String[] args) {

        /// KULLANIM SAYISINI BULMA

        // Kullanicidan bir cumle ve cumlede aratilacak bir metin isteyin
        // girilen cumle ve metin'e gore asagidaki 3 sonucdan uygun olani yazdirin
        // 1- cumle aranan metni icermiyor
        // 2- cumle aranan metni sadece 1 adet iceriyor
        // 3- cumle aranan metni 1'den fazla iceriyor



        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz..");
        String cumle=scan.nextLine();
        System.out.println("Lutfen cumlenizde aramak istediginiz bir metin giriniz..");
        String metin=scan.nextLine();

        int indexMetin1=cumle.indexOf(metin);
        int indexMetin2=cumle.indexOf(metin,indexMetin1+1);

        if(!(cumle.contains(metin))) System.out.println("Cumle aranan metni icermiyor");
        else if(indexMetin2==-1) System.out.println("Cumlede aranan metin sadece bir adet var.");
        else System.out.println("Cumlede aranan metin birden fazla var");




//
//        if (metin1nciIndex == -1){
//            System.out.println("cumle aranan metni icermiyor");
//        } else if ( metin2nciIndex == -1 ) { // ilk kullanim -1 degil , 2.kullanim -1 mi?
//            System.out.println("cumle aranan metni sadece 1 adet iceriyor");
//        } else { // geriye
//            System.out.println("cumle aranan metni 1'den fazla iceriyor");
//        }
    }
}
