package H05_D17_ArraysClassMethods;

public class C10_EnUzunKelimeyiYazdirma {
    public static void main(String[] args) {

        String [][]arr ={{"Ali","okula", "git"},{"Merhabalar", "Arkadaslar"},{"Bu","is","olacak"}};
        //en uzun array'i yazdirin

        enUzunKelime(arr); //En Uzun Kelime : Merhabalar

    }
    public static void enUzunKelime(String [][] arr){

        String enUzunKelime="";
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (enUzunKelime.length()<arr[i][j].length()){
                    enUzunKelime=arr[i][j];
                }
            }
        }
        System.out.println("En Uzun Kelime : "+ enUzunKelime);

    }
}
