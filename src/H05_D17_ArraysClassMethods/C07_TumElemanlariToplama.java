package H05_D17_ArraysClassMethods;

public class C07_TumElemanlariToplama {
    public static void main(String[] args) {
        int [] sayilar = {3,6,9,1};

        //array'in tum elementlerinin toplamini yazdirin

        int toplam=0;

        for (int i = 0; i < sayilar.length; i++) {
            toplam+=sayilar[i];
        }
        System.out.println("sayilar array'indaki tum elementlerin toplami : "+toplam); //19




        int[][] arr={{2,3,7},{3,5},{4},{1,2,3,6,8}};

        //array'in tum elementlerinin toplamini yazdirin

        int toplam2=0;
        for (int i = 0; i <arr.length ; i++) {            //outer array'i kontrol eder
            for (int j = 0; j < arr[i].length; j++) {     //her bir innerdekileri kontrol eder
                toplam2 += arr[i][j];
            }
        }
        System.out.println("arr array'indaki tum elementlerin toplami : "+toplam2); //44
    }
}
