package H05_D16_arrays;

public class C06_ElemanlariToplama {
    public static void main(String[] args) {
        //Verilen bir array'deki
        // pozitif tamsayilari toplayip sonucu yazdirin.

        int [] arr = {3, -4 , 6 , -1 , 5, 3, -4};

        //verilen gorevi yapmak icin array'deki elementleri
        // tek tek kontrol etmek gerektigi icin bir loop kullanmaliyiz

        int toplam=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>0){
                toplam+=arr[i];
            }
        }
        System.out.println("Pozitif sayilarin toplami : " +toplam);


    }

}
