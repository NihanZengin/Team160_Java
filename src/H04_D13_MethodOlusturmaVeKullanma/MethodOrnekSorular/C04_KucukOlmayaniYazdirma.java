package H04_D13_MethodOlusturmaVeKullanma.MethodOrnekSorular;

public class C04_KucukOlmayaniYazdirma {
    public static void main(String[] args) {

        //Verilen iki tamsayinin kucuk olmayani yazdiran bir method yaziniz

        kucukOlaniYazdirma(23,67); //67

        kucukOlaniYazdirma(11,5);  //11




    }
    public static void kucukOlaniYazdirma(int sayi1 , int sayi2){

        System.out.println(sayi1<sayi2?sayi2:sayi1);
    }
}
