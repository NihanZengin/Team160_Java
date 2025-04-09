package GrupCalismasi;

import java.util.Scanner;

public class S4 {

     /*
    1) Kullanicidan TC kimlik numarasini isteyin. Bu kimlik
numarasinin son rakaminin cift rakam olarak bittigini ve Tc
kimlik numarasinin 11 haneden olustugunu kontrol eden
 nonstatic bir method’ ta kontrol edin. Aksi durumda
IllegalArgumentException olusturun. Kontrol edeceginiz son
rakami ve 11 haneyi ic ice try-catch kullanarak yapin. Finally
blogunda Scanner’ i kapatin
     */

    public  void tcKimlikNoKontrol(){
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Lutfen TC kimlik numaranizi giriniz: ");
            String tcKimlikNo= scanner.nextLine();
            try{
                if(tcKimlikNo.length()!=11){
                    throw new IllegalArgumentException("Tc no 11 haneli olmalidir.");
                }

                int sonRakam=Integer.parseInt(tcKimlikNo.substring(tcKimlikNo.length()-1));

                if (sonRakam%2!=0){
                    throw new IllegalArgumentException("Tc no son rakami cift olmalidir.");
                }
            }catch (IllegalArgumentException e){
                System.out.println("Hata: "+ e.getMessage());
            }
        } catch (Exception e) {
            System.out.println("Beklenmeyen bir hata olustu.");
        }finally {
            scanner.close();
            System.out.println("Scanner kapatildi");
        }
    }

    public static void main(String[] args) {

        S4 kontrol = new S4();
        kontrol.tcKimlikNoKontrol();
    }

}
