package H03_D08_StringManipulation;

import java.util.Scanner;

public class C13_IndexOfSoru {
    public static void main(String[] args) {

        //Kullanicidan icinde en az 3 tane "e" olan bir metin isteyin
        //metindeki 3. e'nin indexini yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen icinde en az 3 adet e bulunan bir metin giriniz...");
        String metin= scanner.nextLine();

        int ilkIndex = metin.indexOf("e");

        int ikinciIndex = metin.indexOf("e", ilkIndex+1);

        int ucuncuIndex = metin.indexOf("e",ikinciIndex+1);

        System.out.println("3. e'nin index'i : " + ucuncuIndex);

    }
}
