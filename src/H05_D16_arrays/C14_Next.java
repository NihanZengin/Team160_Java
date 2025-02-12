package H05_D16_arrays;

public class C14_Next {
    public static void main(String[] args) {
        //Soruyu method yazarak yapalim
        //Verilen String bir array'de istenen bir elemanin var olup olmadigini ve varsa kac kere kullanildigini yazdirin.
        String[] harfler={"a","d","f","e","a","e","d","a","e","a"};
        StringElemanArama(harfler,"d");//d harfi array'de 2 adet var.
    }
    public static void StringElemanArama(String[] str, String arananHarf){
        int sayac=0;

        for (int i = 0; i < str.length; i++) {
            if (str[i].equals(arananHarf)){
                sayac++;
            }
        }
        System.out.println(arananHarf+ " harfi array'de "+sayac + " adet var.");

    }
}
