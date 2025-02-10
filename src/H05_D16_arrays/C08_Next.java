package H05_D16_arrays;

public class C08_Next {
    public static void main(String[] args) {

        // Verilen bir array’de
        // istenen bir elemanin var olup olmadigini
        // ve varsa kac kere kullanildigini yazdiran bir method olusturun.

        int[] arr = {1,3,4,2,4,5,3,2,1,4,5,3,2,1,5,2};
        int arananSayi = 1;


        printKullanimSayisi(arr,arananSayi);
    }

    public static void printKullanimSayisi(int[] arr, int istenenEleman) {


        int sayac = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == istenenEleman) {
                sayac++;
            }

        }


        if (sayac == 0) {
            System.out.println("Aradaginiz " + istenenEleman + " sayisi array'de kullanilmamis");
        } else {
            System.out.println("Aradaginiz " + istenenEleman + " sayisi array'de " + sayac + " adet kullanilmis");
        }

    }
}

