package H05_D16_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C15_KullaniciyaArrayOlusturtma {
    public static void main(String[] args) {
        //Kullanicidan array'in boyutunu ve Integer elementlerini alip array olusturun

        Scanner scanner=new Scanner(System.in);

        System.out.println("Lutfen olusturulacak int array icin boyut belirtiniz...");
        int verilenLenght=scanner.nextInt();
        int[] arr=new int[verilenLenght];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Array'deki ");
            System.out.print(i+1+ ". elemani giriniz: ");
            arr[i]=scanner.nextInt();

        }
        System.out.println(Arrays.toString(arr));
    }
}
