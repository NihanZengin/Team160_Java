package H05_D16_arrays;

public class C08_KullanimSayisiBulma {
    public static void main(String[] args) {

        // Verilen bir array’de
        // istenen bir elemanin var olup olmadigini
        // ve varsa kac kere kullanildigini yazdirin

        int[] arr = {1, 3, 4, 2, 4, 5, 3, 2, 1, 4, 5, 3, 2, 1, 5, 2};
        int arananSayi = 2;

        int sayac = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arananSayi) {
                sayac++;
            }
        }
        if (sayac == 0) {
            System.out.println("Aradiginiz " + arananSayi + "sayisi array'de kullanilmamis");
        } else {
            System.out.println("Aradiginiz " + arananSayi + "sayisi" + sayac + "adet kullanilmistir");

        }


    }


}
