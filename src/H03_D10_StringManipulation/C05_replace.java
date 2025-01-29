package H03_D10_StringManipulation;

import java.util.Scanner;

public class C05_replace {
    public static void main(String[] args) {

        String str = "Java ogrenmek cok guzel";

        // metni "a" yerine "A" olacak sekilde yazdirin
        System.out.println(str.replace("a", "A")); // JAvA ogrenmek cok guzel

        // metni 'e' yerine 'E' olacak sekilde yazdirin
        System.out.println(str.replace('e','E')); // Java ogrEnmEk cok guzEl

        // "ogrenmek" kelimesini "bilmek" olarak degistirin
        str = str.replace("ogrenmek","bilmek");
        // System.out.println(str); // Java bilmek cok guzel

        // tum bosluklari silip, metni bosluk olmadan yazdirin
        System.out.println(str.replace(" ", "")); // Javabilmekcokguzel


        // kullanicidan cumledeki degistirmek istedigi kismi
        // ve yerine koymak istedigi metni alin
        // cumleyi yeni haliyle yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Cumledeki degistirmek istediginiz kismi yaziniz...");
        String eskiMetin = scanner.nextLine();

        System.out.println("Yerine yazmak istediginiz metni soyleyin...");
        String yeniMetin = scanner.nextLine();

        System.out.println(str.replace(eskiMetin,yeniMetin));
    }
}
