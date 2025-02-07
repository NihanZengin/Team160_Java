package H04_D15_Scope;

public class C02_LocalVariables {

    /**
     * Local variable'lar deger atamadan DEKLARE edilebilir.
     * Ancak deger atamadan kullanilamazlar.
     */

    public static void main(String[] args) {


        int sayi;
        String str;
        char chr;

      /**  System.out.println(str); //Variable 'str' might not have been initialized*/

      str="Java candir";
        System.out.println(str);
        System.out.println(str.length());


       /** System.out.println(Character.toUpperCase(chr)); //Variable 'str' might not have been initialized*/


       method1(5);
    }

    public static void method1(int sayi2){
        System.out.println(sayi2);

       /** int sayi2=45; //Variable 'sayi2' is already defined in the scope*/

       sayi2=23;
    }
}
