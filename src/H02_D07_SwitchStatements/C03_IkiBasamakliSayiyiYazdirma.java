package H02_D07_SwitchStatements;

import java.util.Scanner;

public class C03_IkiBasamakliSayiyiYazdirma {
    public static void main(String[] args) {

     // Kullanicidan 100'den kucuk pozitif bir tamsayi alip, girilen sayiyi yazi ile yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 100'den kucuk pozitif bir tamsayi giriniz...");
        int sayi = scanner.nextInt();


        //29 --> yirmi dokuz
        //87 --> seksen yedi
        // 37 ==> onlar basamagi 3  ==> otuz, birler basamagini ekleriz

        int birlerbasamagi= sayi%10;
        int onlarbasamagi= sayi/10;

        if (sayi>0 && sayi<100) {
            switch (onlarbasamagi) {
                case 0:
                    break;
                case 1:
                    System.out.print("on");
                    break;
                case 2:
                    System.out.print("yirmi");
                    break;
                case 3:
                    System.out.print("otuz");
                    break;
                case 4:
                    System.out.print("kirk");
                    break;
                case 5:
                    System.out.print("elli");
                    break;
                case 6:
                    System.out.print("altmis");
                    break;
                case 7:
                    System.out.print("yetmis");
                    break;
                case 8:
                    System.out.print("seksen");
                    break;
                case 9:
                    System.out.print("doksan");
                    break;


            }
            System.out.print(" ");

            switch (birlerbasamagi) {
                case 0:
                    break;
                case 1:
                    System.out.print("bir");
                    break;
                case 2:
                    System.out.print("iki");
                    break;
                case 3:
                    System.out.print("uc");
                    break;
                case 4:
                    System.out.print("dort");
                    break;
                case 5:
                    System.out.print("bes");
                    break;
                case 6:
                    System.out.print("alti");
                    break;
                case 7:
                    System.out.print("yedi");
                    break;
                case 8:
                    System.out.print("sekiz");
                    break;
                case 9:
                    System.out.print("dokuz");
                    break;


            }
        }
        else System.out.println("Lutfen dogru aralikta sayi giriniz..");

    }
}
