package H4_D12_ForLoop;

import java.util.Scanner;

public class C07 {
    public static void main(String[] args) {

        // Kullanicidan pozitif bir tamsayi isteyip,
        // sayinin asal sayi olup olmadigini kontrol edin ve sonucu yazdirin.

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen  pozitif bir tamsayi giriniz...");
        int girilenSayi=scan.nextInt();

        for (int i = 2; i < girilenSayi ; i++) {
            if(girilenSayi%i==0){
                System.out.println("Girilen sayi asal sayi degildir");
                break;
            }
            if (i == girilenSayi - 1) {

                System.out.println("Girilen sayi asal sayidir");
            }


        }
        //bagimsiz if'ler ile yaptik CUNKU; else ile yapinca
        // for dongusune giren her sayi if sarti saglamiyorsa else de tek tek yazdirir.
        //bu sebeple bagimsiz if'ler yapmak mantikli.
    }
}
