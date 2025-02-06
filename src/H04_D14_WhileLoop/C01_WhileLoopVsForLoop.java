package H04_D14_WhileLoop;

public class C01_WhileLoopVsForLoop {
    public static void main(String[] args) {

        /*

        Eger baslangic ve bitis degerleri biliniyorsa veya
        bir islemi kac kere tekrarlayacagimizi biliyorsak For Loop avantajlidir.

        Cunku while loop
        - baslangic degeri
        - bitis degeri ve artis azalis miktarini otomatik olarak bize vermez.
         */

        //1'den 10'a kadar (1 ve 10 dahil) tum sayilari toplayin

        int toplam=0;

        for (int i = 1; i <=10 ; i++) {
            toplam+=i;
        }
        System.out.println("For loop ile 1-10 arasi toplam : "+toplam);


        //aybi soruyu while loop ile yapalim

        int sayi=1;
         toplam=0;


        while (sayi<=10){   // calismaya devam etme sarti
            toplam+=sayi;
            sayi++;  //     DIKKAT: bunu yazmayi unutursak sonsuz loop olusur.
        }
        System.out.println("While loop ile 1-10 arasi toplam : "+toplam);


        //20'den 30'a kadar olan sayilari (20 ve 30 dahil) cift sayilari carpin ve yazdirin

        int carpim=1;

        for (int i = 20; i <=30 ; i++) {
            if(i%2==0){
                carpim*=i;
            }
        }
        System.out.println("For loop ile 20-30 arasi carpim : "+carpim);

        //ayni soruyu while loop ile yapalim

        sayi=20;
        carpim=1;

        while(sayi<=30) {
            if (sayi % 2 == 0) {
                carpim *= sayi;
            }
            sayi++;                                //DIKKAT :unutmayin

        }
        System.out.println("While loop ile 20-30 arasi carpim : "+carpim);
    }

}
