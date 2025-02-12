package H05_D16_arrays;

public class C14_ElemanArama {
    public static void main(String[] args) {
        //Verilen String bir array'de istenen bir elemanin var olup olmadigini ve varsa kac kere kullanildigini yazdirin.
        String[] harfler={"a","d","f","e","a","e","d","a","e","a"};

        String arananHarf="a";
        int sayac=0;

        for (int i = 0; i < harfler.length; i++) {
            if (harfler[i].equals(arananHarf)){
                sayac++;
            }

        }
        System.out.println(arananHarf+ " harfi array'de "+sayac + " adet var.");
        //a harfi array'de 4 adet var.
    }
}
