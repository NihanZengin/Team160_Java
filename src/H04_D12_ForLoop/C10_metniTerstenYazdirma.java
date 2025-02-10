package H04_D12_ForLoop;

import java.util.Scanner;

public class C10_metniTerstenYazdirma {
    public static void main(String[] args) {
        // Kullanicidan bir String isteyin ve String’i tersten yazdirin.
        // orn input : Sabri output : irbaS

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz...");
        String metin=scan.nextLine();

        for (int i = metin.length()-1; i >=0 ; i--) {
            System.out.print(metin.charAt(i));  // ln olursa alt alta yazdiriyor

        }

        //palindrom:
        //ey edip adanada pide ye :)

    }
}
