package H05_D19_ForEachLoop;

public class C02_KarelerinToplami {
    public static void main(String[] args) {
        //Verilen int array'deki her elementin karelerini alip toplayan bir method olusturun

        int arr[]= {1,3,5,7,2};
        System.out.println(kareleriToplami(arr));
    }
    public static int kareleriToplami (int arr[]){
        int toplam=0;
        for (int each: arr){
            toplam+=each*each;
        }
        return toplam;
    }
}
