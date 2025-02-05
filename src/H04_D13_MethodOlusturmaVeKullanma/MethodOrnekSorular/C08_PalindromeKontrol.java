package H04_D13_MethodOlusturmaVeKullanma.MethodOrnekSorular;

public class C08_PalindromeKontrol {
    public static void main(String[] args) {
//

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
