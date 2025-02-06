package H04_D14_WhileLoop;

import java.util.Scanner;

public class C11_DowhileLoop {
    public static void main(String[] args) {

        //Kullanicidan bir pozitif sayi isteyin,
        //sayinin tam kare olup olmadigini bulunuz
        //tam kare ise true, degilse false yazdirin.
        //Ornek: input: 16(4*4) , output : true

        Scanner scanner =new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz...");
        int sayi = scanner.nextInt();


        int karekokDegeri=1;

        do{
            if(karekokDegeri*karekokDegeri==sayi){
                System.out.println("true");
                break;
            }
            karekokDegeri++;
            if (karekokDegeri*karekokDegeri>sayi){
                System.out.println("false");
                break;
            }
        }while(karekokDegeri*karekokDegeri<=sayi);

    }
}
