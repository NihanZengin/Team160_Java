package H02_D05_IfStatements;

public class C01_BagimsizIfCumleleri {
    public static void main(String[] args) {

        int a=20;
        int b=30;
    //a b'den buyuk ise "a daha buyuk" yazdirin

        if(a>b){
            System.out.println("a b'den daha buyuk");
        }
        //Sartimiz dogru degilse islemi calistirir ama konsola bir sey yazdirmaz.
        //Konsolda: Process finished with exit code 0

    //a cift sayi ise "a cift" yazdirin

        if (a%2==0){
            System.out.println("a cift"); //a cift
        }
        //Sart saglandigi icin if body calisir.

     //b 0'dan buyukse "b pozitif" yazdirin

        if(b>0){
            System.out.println("b pozitif");
        }

        //If cumlesindeki boolean sart onceden de tanimlanabilir.
    }
}
