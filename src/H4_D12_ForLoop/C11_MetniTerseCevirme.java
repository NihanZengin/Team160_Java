package H4_D12_ForLoop;

import java.util.Scanner;

public class C11_MetniTerseCevirme {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz...");
        String metin=scan.nextLine();

        String tersMetin="";

        for (int i = metin.length()-1; i >=0 ; i--) {
            tersMetin+=metin.charAt(i);

        }
        System.out.println("Metnin ters hali: "+tersMetin);

        //Girilen metnin palindrom olup olmadigini yazdirin

        if(metin.equalsIgnoreCase(tersMetin)){
            System.out.println("Girdiginiz metin ~ "+metin+" ~ palindrom'dur");
        }
        else{
            System.out.println("Girdiginiz metin ~ "+metin+" ~ palindrom degildir");
        }
    }
}
