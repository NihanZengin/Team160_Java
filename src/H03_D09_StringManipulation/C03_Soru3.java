package H03_D09_StringManipulation;

import java.util.Scanner;

public class C03_Soru3 {
    public static void main(String[] args) {

        // Kullanicidan bir metin isteyin
        // girilen metin'de 2. a'nin index'ini yazdirin
        // eger 2. a yoksa "metin 2 a icermeli" yazdirin

        Scanner in=new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz..");
        String metin=in.nextLine();

        int indexA= metin.indexOf("a");

        int indexA2=metin.indexOf("a",indexA+1);

        if(indexA2<0){
            System.out.println("metin 2 a icermeli");
        }
        else System.out.println(indexA2);




    }
}
