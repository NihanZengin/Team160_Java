package H03_D08_StringManipulation;

import java.util.Scanner;

public class C11_ {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen e-posta adresinizi girin: ");
        String email = scanner.nextLine();

        if(!email.contains("@")){
            System.out.println("gecersiz mail");
        }
        if(!email.contains("@gmail.com")){
            System.out.println("mail gmail olmali");

        }
        if (!email.endsWith("@gmail.com")){
            System.out.println("mail'de yazim hatasi var");
        }


    }
}
