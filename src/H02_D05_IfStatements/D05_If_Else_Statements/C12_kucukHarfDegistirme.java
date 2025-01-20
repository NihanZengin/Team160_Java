package H02_D05_IfStatements.D05_If_Else_Statements;

import java.util.Scanner;

public class C12_kucukHarfDegistirme {
    public static void main(String[] args) {
        ////Soru 5- Kullanicidan bir karakter isteyin,
        //        girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin,
        //        yoksa girilen karakteri girildigi gibi yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.print("Lutfen bir karakter giriniz: ");
        char karakter=scan.next().charAt(0);

        if(karakter>='a'&& karakter<='z'){
            System.out.println((char)(karakter-32)); //Casting yapmazsam sadece rakam verir
        }
        else System.out.println(karakter);
    }
}
