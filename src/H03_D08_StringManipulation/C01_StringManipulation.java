package H03_D08_StringManipulation;

public class C01_StringManipulation {
    public static void main(String[] args) {

        String str=" Java Candir";

        str.toUpperCase();

        //9.satirdaki islem calismadi demeyiz. Calisir ama biz sonucu yazdirmadigimiz icin konsolda goremeyiz.


        System.out.println(str); // Java Candir

        //Ayrica str'a atama yapmadigimiz icin str degeri degismez.

        //str;i kucuk harflerle yazdirin
        System.out.println("str'a atama yapmadan kucuk harflerle yazdirdi: "+str.toLowerCase());// java candir

        System.out.println("Atama yapilmadigi icin str hala--> "+str); // Java Candir // Atama yapmadigimiz icin degisiklik kalici olmaz.


        //str'i buyuk harflerle yazilmis sekilde kaydedin.
        str=str.toUpperCase();
        System.out.println("Atamadan sonra str: "+str);

        //str'i kucuk harfe cevirirken turkce karakter ile "java candır"
    }

}
