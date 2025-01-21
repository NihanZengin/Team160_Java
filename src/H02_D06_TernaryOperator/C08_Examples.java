package H02_D06_TernaryOperator;

public class C08_Examples {
    public static void main(String[] args) {

        int a=10;

     System.out.println(a>0 ? "Sayi Pozitif" : "Sayi Pozitif degil"); //10 0 dan buyuk oldugundan true kismini yazdi
                                                                         //Sayi Pozitif



     System.out.println(a>20 ? a*a : a++); // 10>20 --> false --> ikinci atama kismi calisti.
                                          //DIKKAT: once a'yi yazdirdi sonra a'yi bir artirip a'ya atadi.
        System.out.println("a'nin atamadan sonraki hali: "+a); //10
                                                              //a'nin atamadan sonraki hali: 11


     System.out.println(a<100 || a< 0 ? 3*a+1 : 2+a/5); // 11 yuzden kucuk ama 0'dan kucuk degil, biri true ise true'dur
                                                        // 3*11==33 , 33+1==34



        int x=10;
        int y=15;

        int z= a>0 ? y++: --x;                         //10>0 --> true --> z=y=15 --> y=y+1

        System.out.println(x+ ","+ y +","+z);          // x-->10 , y --> 16 , z --> 15

        int k=10;
        int l=20;

          System.out.println(k>5 ? k>0 ? 100 : 50 : k<20 ? k+5 : k-5 );

        //System.out.println(  k>5 ?
        //                     [k>0 ? (100) : (50)] :    --> true bolumu calisir
        //                     [k<20 ? (k+5) : (k-5)] ); --> false bolumu calismaz


    }
}
