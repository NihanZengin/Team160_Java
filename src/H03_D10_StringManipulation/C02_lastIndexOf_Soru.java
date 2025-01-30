package H03_D10_StringManipulation;

import java.util.Scanner;

public class C02_lastIndexOf_Soru {
    public static void main(String[] args) {

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


        if(cumle.contains(metin)) System.out.println("Cumle aranan metni icermiyor");
        else if(cumle.indexOf(metin)==cumle.lastIndexOf(metin)) System.out.println("Cumlede aranan metin sadece bir adet var.");
        else System.out.println("Cumlede aranan metin birden fazla var");






//        int metinIlkIndex = cumle.indexOf(metin);
//        int metinSonIndex = cumle.lastIndexOf(metin);
//
//        if (metinIlkIndex == -1){
//            System.out.println("cumle aranan metni icermiyor");
//        } else if (metinIlkIndex == metinSonIndex) {
//            System.out.println("cumle aranan metni sadece 1 adet iceriyor");
//        } else{
//            System.out.println("cumle aranan metni 1'den fazla iceriyor");
//        }
    }
}
