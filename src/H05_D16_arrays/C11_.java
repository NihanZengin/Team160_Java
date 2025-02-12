package H05_D16_arrays;

import java.util.Arrays;

public class C11_ {
    public static void main(String[] args) {

        //4 int deger koyabilecegimiz sayilar array'i olusturun

        int[] sayilar= new int[4]; // [0, 0, 0, 0]



        //5 isim koyabilecegimiz bir array olusturun

        String[] isimler=new String[5]; // [null, null, null, null, null]



        //2 boolean degger koyabilecegimiz bir array olusturun

        boolean[] degerler= new boolean[2]; //[false, false]



        // Icinde 56 , 67 , 23 , 97 degerlerinin oldugu notlar array'i olusturun.

        int[] notlar= {56, 67, 23, 97};


        //Icinde mevsim isimlerinin oldugu mevsimler array'i olusturun.

        String[] mevsimler= {"ilkbahar", "yaz" , "sonbahar", "kis"};


        //notlar array'indaki 23'u yazdirin

        System.out.println(notlar[2]); //23


        //mevsimlerden kis'i yazdirin

        System.out.println(mevsimler[3]);


        //sayilar array'indaki ilk elementi yazdirin

        System.out.println(sayilar[0]); //0


        //isimler array'indaki 2. elementi yazdirin

        System.out.println(isimler[1]); //null


        //notlar array'indaki 2. sayiyi 45 yapin

        notlar[1]=45;


        //mevsimler array'indaki ilk ismi Mahmut olarak atayin

        mevsimler[0]="Mahmut";


        //mevsimler array'indaki 5. elementi yazdirin

        //System.out.println(mevsimler[5]); //sariya boyadi ama hata vermedi
                                        // ama calistirdigimizda exception verir


        //isimler array'in tamamini yazdirin

        System.out.println(isimler); //[Ljava.lang.String;@6a5fc7f7
                                     // boyle yazdiramayiz cunku stack memoride referansini yazdirir

        System.out.println(Arrays.toString(sayilar));//[0, 0, 0, 0]



        //notlari yazdirin

        System.out.println(Arrays.toString(notlar)); //[56, 45, 23, 97]


        String str = "Java candir";

        int[] arr = {3,5,7,9,1,2};

        //String'deki karakter sayisini yazdirin

        System.out.println(str.length());


        //arr'dei element sayisini yazdirin

        System.out.println(arr.length);


        //String'in son karakterini yazdirin

        System.out.println(str.length()-1);


        //arr'nin son elementini yazdirin

        System.out.println(arr.length-1);


        //String'in sondan 3. elementini yazdirin

        System.out.println(str.length()-3);


        //arr'nin sondan 3. elementini yazdirin

        System.out.println(arr.length-3);

    }

}
