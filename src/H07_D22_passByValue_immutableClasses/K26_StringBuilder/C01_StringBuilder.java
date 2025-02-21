package H07_D22_passByValue_immutableClasses.K26_StringBuilder;

public class C01_StringBuilder {
    public static void main(String[] args) {
         /**
          * Java'da metin datalar kullanilabilecek 3 Class vardir.
          * Bunlardan hangisinin kullanilacagina
           ihtiyaclara gore development asamasinda karar verilir.
          */

        /*

        | class         | mutability | multi-thread                      | hiz           |
        |--------------|------------|---------------------------------   |--------------|
        | String       | Immutable  | -                                  | -            |
        | StringBuilder| Mutable    | Multi-thread calismayi desteklemez | Daha hizlidir |
        | StringBuffer | Mutable    | Multi-thread calismayi destekler   | Daha yavastir |
        */





         /*
            StringBuilder 3 farkli sekilde olusturulabilir
         */

        StringBuilder sb1 = new StringBuilder();

        // Java 16 karakter alabilecek kapasitede ama BOS bir sb uretir

        System.out.println("sb1 : "+ sb1); // Bos bir satir
        System.out.println("sb1'in uzunlugu  : "+ sb1.length() ); // 0
        System.out.println("sb1'in kapasitesi  : "+ sb1.capacity() ); // 16

        sb1.append("Java candir.");

        System.out.println("sb1 : "+ sb1); // Java candir.
        System.out.println("sb1'in uzunlugu  : "+ sb1.length() ); // 12
        System.out.println("sb1'in kapasitesi  : "+ sb1.capacity() ); // 16


        StringBuilder sb2 = new StringBuilder(7);

        // Java 7 karakter alabilecek kapasitede ama BOS bir sb uretir

        System.out.println("sb2 : "+ sb2); // Bos satir
        System.out.println("sb2'in uzunlugu  : "+ sb2.length() ); // 0
        System.out.println("sb2'in kapasitesi  : "+ sb2.capacity() ); // 7

        sb2.append("Cem");
        System.out.println("sb2 : "+ sb2); // Cem
        System.out.println("sb2'in uzunlugu  : "+ sb2.length() ); // 3
        System.out.println("sb2'in kapasitesi  : "+ sb2.capacity() ); // 7


        sb2.append(" BAKIR");
        System.out.println("sb2 : "+ sb2); // Cem BAKIR
        System.out.println("sb2'in uzunlugu  : "+ sb2.length() ); // 9
        System.out.println("sb2'in kapasitesi  : "+ sb2.capacity() ); // 7 * 2 + 2 ==> 16



        StringBuilder sb3 = new StringBuilder("Java");

        // Java 16+ 4(length) ==> 20 karakter kapasiteli, icinde "Java" bulunan bir sb olusturur

        System.out.println("sb3 : "+ sb3); // Java
        System.out.println("sb3'in uzunlugu  : "+ sb3.length() ); // 4
        System.out.println("sb3'in kapasitesi  : "+ sb3.capacity() ); // 20


        sb3.append(" ogrenen pisman olmaz.");

        System.out.println("sb3 : "+ sb3); // Java ogrenen pisman olmaz
        System.out.println("sb3'in uzunlugu  : "+ sb3.length() ); // 26
        System.out.println("sb3'in kapasitesi  : "+ sb3.capacity() ); // 2 * 20 + 2 ==> 42


        // Eger size ve length'i esitlemek isterseniz, trimToSize() kullanabilirsiniz.

        sb3.trimToSize();

        System.out.println("sb3 : "+ sb3); // Java ogrenen pisman olmaz
        System.out.println("sb3'in uzunlugu  : "+ sb3.length() ); // 26
        System.out.println("sb3'in kapasitesi  : "+ sb3.capacity() ); // 26

        /*
            TC No : 11123456789
            her ne kadar sayilardan olussa da matematiksel islemlerde kullanilmayacagi icin
            String veya StringBuilder olarak tutabiliriz

         */





    }
}
