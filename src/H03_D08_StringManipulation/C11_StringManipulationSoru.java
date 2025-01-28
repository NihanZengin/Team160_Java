package H03_D08_StringManipulation;

import java.util.Scanner;

public class C11_StringManipulationSoru {
    public static void main(String[] args) {


        // SORU : kullanicidan bir mail alin
        //  - mail @ icermiyorsa "gecersiz mail"
        //  - mail @gmail.com icermiyorsa, "mail gmail olmali"
        //  - mail @gmail.com ile bitmiyorsa, "mailde yazim hatasi var"
        // yazdirin.

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
