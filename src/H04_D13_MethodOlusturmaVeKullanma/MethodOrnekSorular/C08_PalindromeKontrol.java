package H04_D13_MethodOlusturmaVeKullanma.MethodOrnekSorular;

public class C08_PalindromeKontrol {
    public static void main(String[] args) {

        // Verilen metnin palindrome olup olmadigini kontrol edip
        //palindrom ise true , degilse false donduren bir method olusturun.

        System.out.println(isPalindrome("Java"));

        System.out.println(isPalindrome("Madam"));

    }

    public static boolean isPalindrome(String metin){

        String tersMetin=C07_MetniTerseCevirme.metninTersiniDondur(metin); //konsolda gormeyiz

        if (metin.equalsIgnoreCase(tersMetin)){
            return true;
        }else {
            return false;
        }
    }
}
