package H07_D22_passByValue_immutableClasses.K25_Varargs;

public class C02_VarargsKullanimi {
    public static void main(String[] args) {

        // argument olarak girilen sayilardan
        // ilki haric geriye kalanlari toplayip
        // bulunan toplam deger ile ilk sayinin carpimini yazdiran
        // bir method olusturun
        // orn 2,3,4,5  ==>  2 * (3+4+5) = 24

        islem(1,2,3); // 5
        islem(3,6,7,8,9); // 90
        islem(2,4,5,1,8,9,0); // 54
        islem(2,3); // 6
        islem(5); // 0
        //CTE vermedi cunku geri kalanlari bos bir array olarak kabul eder
        //basta toplami 0 olarak atadigimiz icin 0 ile carpip 0 sonucunu verir.


    }

    public static void islem(int ilkSayi, int... geriyeKalanlar){

        int toplam = 0;

        for (int  each :geriyeKalanlar){

            toplam += each;

        }

        System.out.println("Islem sonucu : " + ilkSayi * toplam);

    }

}
