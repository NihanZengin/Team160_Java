package H02_D05_IfStatements;

import java.util.Scanner;

public class C02_DersGecme {
    public static void main(String[] args) {

        //kullanicidan notunu alin notu 50 veya daha buyukse "sinifi gectin" yazdirin

        Scanner scanner=new Scanner(System.in);
        System.out.print("Lutfen notunuzu giriniz...");

        double girilenNot= scanner.nextDouble();

        if(girilenNot>=50){
            System.out.println("Sinifi Gectiniz");
        }

        //Dikkat: Calisirken bize gorevi boyle eksik verirseler toplantida uyarmamiz gerek;
        // eger gorevi boyle verirseniz kullanici 120 de yazsa sinifi gectin yazar.
    }
}
