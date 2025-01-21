package H02_D06_TernaryOperator;

public class C06_Ternary_AtamaYazdirma {
    public static void main(String[] args) {

        // Ternary operatoru YA sout icinde kullanilmali
        //                   YA DA mutlaka ATAMA yapilmalidir


        int a = 40;

        // a>0 ? a+10 : a-10 ;
        // sadece ternary olmaz. ya atama yapmaliyiz ya da sout ile yazdirmaliyiz.


        // verilen gorevde hem yazdirma hem atama varsa
        // ternary yazarken dikkat edilmelidir!!!!


        int sayi = 15;

        // verilen sayi variable'inin degerini kontrol edip
        // sayi ciftse "cift sayilari sevmem" yazdirin
        // sayi tek ise sayinin degerini 10 artirin


        // sayi%2==0 ? System.out.println("Cift sayi") : (sayi+=10) ; // Yine bu sekilde de  olmuyor.

        System.out.println(sayi%2==0 ? "cift sayilari sevmem" : (sayi+=10)); // sayimiz cift olmadigi icin,
                                                                             // ikinci kisim calisti ve
                                                                            // sayi degerini atama yoluyla 10 artirdi.
        System.out.println("sayinin son hali: " + sayi);

        /// Ornekte oldugu gibi hem yazdirma hem atama durumu yapilirken atama islemini paranteze almamiz gerekti.




    }
}
