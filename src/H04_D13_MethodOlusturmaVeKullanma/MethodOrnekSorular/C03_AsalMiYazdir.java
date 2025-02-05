package H04_D13_MethodOlusturmaVeKullanma.MethodOrnekSorular;

public class C03_AsalMiYazdir {
    public static void main(String[] args) {

        //Verilen bir tamsayinin,
        //asal sayiolup olmadigini kontrol edip, sonucu yazdiran method olusturun

        asalMiYazdir(30);

        asalMiYazdir(43);
    }

    public static void asalMiYazdir(int sayi){

        for (int i = 2; i <sayi ; i++) {

            if (sayi%i==0){
                System.out.println("Verilen "+sayi+" sayisi asal degil");
                break;
            }
            if(i==sayi-1){
                System.out.println("Verilen "+sayi+" sayisi asal");
            }

        }




    }


}
