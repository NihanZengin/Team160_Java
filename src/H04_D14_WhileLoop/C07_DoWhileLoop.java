package H04_D14_WhileLoop;

public class C07_DoWhileLoop {
    public static void main(String[] args) {

        /*
        While loop da condition kontrolu
        loop body'den daha fazla calisir.

        do-while loop'da
        condition kontrol sayisi ile
        loop body calisma sayisi aynidir.

         */
        //1'den 5'e kadar (5 haric) olan sayilari yazdirin.

        int sayi = 1;

        while (sayi<5){
            System.out.println(sayi + " ");
            sayi++;
        }

        System.out.println("");

        //do while loop ile

        sayi =1;

        do{
            System.out.println(sayi + " ");
            sayi++;

        }while(sayi<5);

    }
}
