package D03_dataCasting;

public class C03_ExplicitNarrowing_DataKaybi {

    public static void main(String[] args) {


   // asagidaki sayilari int bir variable'a atayip yazdirin.

    double db1 = 34.01;
    double db2 = 45.99;
    float  fl1= 23.7F;

    int sayi=(int) db1;

        System.out.println("34.01'in int'a cast edilmis degeri : " + sayi);
        //34.01'in int'a cast edilmis degeri : 34

        sayi=(int) db2;

        System.out.println("45.99'in int'a cast edilmis degeri : " + sayi);
        //45.99'in int'a cast edilmis degeri : 45

        sayi=(int) fl1;
        System.out.println("23.7'in int'a cast edilmis degeri : " + sayi);
        //23.7'in int'a cast edilmis degeri : 23



        // asagidaki sayilari byte data turunde bir variable'a atayip yazdirin.

    int sayi1= 29;
    short sayi2= 130;
    long sayi3= 140;
    float sayi4= 256F;
    double sayi5= 530;

    byte byt1 = (byte)sayi1;
        System.out.println("29'in byte'a cast edilmis degeri : " + byt1); // 29 byte'a sigar.

        byte byt2= (byte)sayi2;



}
}
