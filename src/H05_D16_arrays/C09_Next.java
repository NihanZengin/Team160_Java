package H05_D16_arrays;

public class C09_Next {
    public static void main(String[] args) {
        String[] isimler = {"Aysenur","Emin", "Fadime", "Haydar Turna","Nihan","Ramazan"};
    }
    public static void printEnKisaEnUzunKelime(String[] kelimeler){
        String enKisaKelime = kelimeler[0];
        String enUzunKelime = kelimeler[0];

        for (int i = 0; i < kelimeler.length ; i++) {

            if ( kelimeler[i].length() < enKisaKelime.length() ){

                enKisaKelime = kelimeler[i];
            }


            if ( kelimeler[i].length() > enUzunKelime.length() ){
                enUzunKelime = kelimeler[i];
            }

        }

        System.out.println("En kisa kelime : " + enKisaKelime);
        System.out.println("En uzun kelime : " + enUzunKelime);
    }
    }

