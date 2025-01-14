package D01_JavaVeProgramlamayaGiris;

public class C03_VariableYazdirma {

    public static void main(String[] args) {
        System.out.println(" Hello Java"); // Konsolda Hllo Java yazdirir.

        int a = 70;

        System.out.println(a); // cift tirnak icinde degilse java bunun variable oldugunu bilir
                               // ve a yi bulur ve onun degerini yazdirir.

        a= 80 ;

        System.out.println(a); //java runtime programdir. run tusuna bastiginiz anda herseye 0 dan baslar.
                                // sirayla herseyi yazar.

        String isim = "Ramazan";

        System.out.println("isim"); // isim yazdirir

        System.out.println(isim); //cift tirnakta olmayinca bunu variable oldugunu bilir
                                  // ve isim variable in degeri Ramazani yazdirir.

        System.out.println("Atanan isim : " + isim ); //Atanan isim : Ramazan
    }
}
