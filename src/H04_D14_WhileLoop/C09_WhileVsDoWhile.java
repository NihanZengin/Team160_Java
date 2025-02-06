package H04_D14_WhileLoop;

public class C09_WhileVsDoWhile {
    public static void main(String[] args) {

        /*
        Uygun deger girilmediginde :
        While loop'ta atanan ilk deger icin while kontrolu false oldugundan
         loop body'si hic calismadan loop biter.

         Do while loop'ta ise ilk deger kontrol edilmeden once loop body'si bir kere calisir.
         Ve ilk deger uygun olmasa bile ilk degeri yadirir.
         Bu ozellik bazen avantaj , bazen dezavantaj olabilir.
         */

        //Verilen sayidan baslayarak birer artirarak
        //10'a kadar (10 haric) olan sayilari yazdirin

        int sayi=5;

        //while loop
        while(sayi<10){
            System.out.println(sayi+ " ");
            sayi++;
        }
        System.out.print("");



        //do while loop
        sayi=5;

        do{
            System.out.print(sayi+ " ");
            sayi++;

        }while(sayi<10);
    }
}
