package H05_D16_arrays;

public class C06_devam {
    public static void main(String[] args) {
        //Verilen bir array'deki
        // pozitif tamsayilari toplayip sonucu
        // bize donduren bir method yaziniz
        //getPozitifSayilarToplam();

        // Verilen gorevi yapmak icin, array'deki elementleri tek tek kontrol etmek gerektigi icin
        // bir loop kullanmaliyiz


        int[] arr = {3,-4,6,-1,5,3,-4};
        System.out.println(  getPozitifSayilarToplam(arr)    ); // 17
    }
    public static int getPozitifSayilarToplam(int[]arr){
        int toplam=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>0){
                toplam+=arr[i];
            }
        }
        return toplam;

    }

}
