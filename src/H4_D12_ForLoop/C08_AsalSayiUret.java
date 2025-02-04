package H4_D12_ForLoop;

import java.util.Random;

public class C08_AsalSayiUret {
    public static void main(String[] args) {

        //1000'den kucuk rastgele bir asal sayi uretip yazdirmak istiyoruz.
        // Bir asyi uretip asal olup olmadigini kontrol edin.

        //random bize rastgele sayi uretir ama asal olup olmadigini bilemeyiz

        Random random=new Random();
        int sayi =random.nextInt(1000);

        for (int i = 2; i < sayi; i++) {
            if (sayi%i==0){
                System.out.println("Uretilen sayi : "+sayi+" asal degil, bir daha deneyin");
                break;
            }
            if (i==sayi-1){
                System.out.println("Uretilen sayi : "+sayi+ " asal sayidir.");
            }


        }
    }
}
