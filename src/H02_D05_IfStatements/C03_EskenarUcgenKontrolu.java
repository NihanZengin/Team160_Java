package H02_D05_IfStatements;

import java.util.Scanner;

public class C03_EskenarUcgenKontrolu {
    public static void main(String[] args) {

        //kullanicidan bir ucgenin kenar uzunluklarini alin;
        // kenar uzunliklari birbirine esit ise "Eskenar ucgen" yazdirin.
        //not:kenar uzunluklari pozitif olmalidir.


        Scanner scanner= new Scanner(System.in);
        System.out.println("Lutfen ucgenin kenar uzunluklarini giriniz...");

        double kenar1 = scanner.nextDouble();
        double kenar2= scanner.nextDouble();
        double kenar3= scanner.nextDouble();

        if(kenar1==kenar2 && kenar1==kenar3 && kenar1>0){
            System.out.println("Eskenar Ucgen");

        }
        //Lutfen ucgenin kenar uzunluklarini giriniz...
        //6
        //6
        //6
        //Eskenar Ucgen


    }
}
