package H05_D17_ArraysClassMethods;

public class C09_SonElemanTopla {
    public static void main(String[] args) {

        int[][] arr ={{2,3,7,1,2},{3,5,1,2},{4,1,2},{1,2,3,6,8,1,2}};
        sonElemanTopla(arr);


    }
    public static void sonElemanTopla(int arr [][]){

        int toplam=0;

        for (int i = 0; i < arr.length; i++) {
                toplam+=arr[i][arr[i].length-1];

        }
        System.out.println("Array son elemanlar toplami : "+toplam);

    }
}
