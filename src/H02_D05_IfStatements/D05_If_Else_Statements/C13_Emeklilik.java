package H02_D05_IfStatements.D05_If_Else_Statements;

import java.util.Scanner;

public class C13_Emeklilik {
    public static void main(String[] args) {
        //Soru 3- Kullanicidan yasini isteyin,
        //        65 yas ve uzeri ise ”Emekli olabilirsin” yazdirin,
        //        yoksa emekli olmasi icin calismasi gereken yil sayisini yazdirin.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz...");
        double yas = scanner.nextDouble();


        if (yas >= 65){

            System.out.println("Emekli olabilirsin");
        } else {

            System.out.println("Emekli olmak icin daha "+ (65-yas) + " sene calismaniz gerekli");
        }

    }
}
