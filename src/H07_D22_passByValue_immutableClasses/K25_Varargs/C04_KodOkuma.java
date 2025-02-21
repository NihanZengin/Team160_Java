package H07_D22_passByValue_immutableClasses.K25_Varargs;

public class C04_KodOkuma {
    public static void main(String[] args) {

        elemanYazdir("Ali",1,2,3,4); // 3
        elemanYazdir("Kerim",3,5,7,8,1,0,3,4,5); // 1

        islem(2,3,4,5,6,7,8,9);
    }
    public static void elemanYazdir(String s , int... v){

        System.out.println( v[s.length()-1] );

        /*
        elemanYazdir("Ali",1,2,3,4)
        s="Ali"
        v[]={1,2,3,4}
        s.length()-1--> 3-1-->2
        v[2]--> 3
         */
        /*
        elemanYazdir("Kerim",3,5,7,8,1,0,3,4,5)
        s="Kerim"
        v[]={3,5,7,8,1,0,3,4,5}
        s.length()-1--> 5-1-->4
        v[4]--> 1
         */

    }


    public static void islem(int sayi1, int sayi2,  int... sayilar){

        System.out.println(sayilar[sayi1] + sayilar[sayi2]);

        /*
        islem(2,3,4,5,6,7,8,9);
        sayi1=2
        sayi2=3
        sayilar[]= {4,5,6,7,8,9}
        sayilar[2]+sayilar[3]--> 6+7-->13
         */

    }
}
