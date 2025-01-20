package H02_D05_IfStatements.D05_If_ElseIf_Statements;

import java.util.Scanner;

public class C13_Ucgen {
    public static void main(String[] args) {
        /*
        ikiden fazla ihtimalin bulundugu durumlarda;
         if ile ilk durumu,
         else if ile ikinci ve diger durumlari
         tum ihtimaller bitince
         else durumu kullanilir.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen ucgenin kenar uzunluklarini giriniz..");
        System.out.print("1.kenar: ");
        double kenar1 = scan.nextDouble();
        System.out.print("2.Kenar: ");
        double kenar2 = scan.nextDouble();
        System.out.print("3.Kenar: ");
        double kenar3 = scan.nextDouble();


        if (kenar1 == kenar2 && kenar1 == kenar3) {
            System.out.println("Olcularini girdiginiz ucgen bir eskenar ucgendir...");
        }
        else if (kenar1==kenar2 || kenar1==kenar3 || kenar2==kenar3){
            System.out.println("Olcularini girdiginiz ucgen bir eskenar ucgendir...");
        }
        else {
            System.out.println("Olcularini girdiginiz ucgen bir eskenar ucgen degildir...");
        }

    }
}
