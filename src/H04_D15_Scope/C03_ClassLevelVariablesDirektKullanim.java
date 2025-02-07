package H04_D15_Scope;

public class C03_ClassLevelVariablesDirektKullanim {
    /** Class level variable'lar ikiye ayrilir;
     * static:
            - tum class'tan kullanilabilir
     * instance:
            -static olmadigi icin static olan method'dan DIREKT olarak kullanilamaz.
     * */

    /*DIKKAT: farkettiyseniz, class level variable'lar deger atamadan DEKLARE edilebildigi gibi,
    * deger atamadan da kullanilabilir.

    * Java bunlara belirlenmis degerlerin (default deger) atamasini yapar.
            * non-primitive --> null
            * sayisal primitive --> 0
            * boolean --> false
            * char --> hiclik ('')
    * */
    String strI;
    static String strS;
    int sayiI=10;
    static int sayiS;
    char chrI;
    static char chrS='#';
    boolean blI=true;
    static boolean blS;

    public static void main(String[] args) {
       /** static int a = 34; // Modifier 'static' not allowed here*/

        System.out.println(strS);
        System.out.println(sayiS);
        System.out.println(chrS);
        System.out.println(blS);


        /**System.out.println(strI); //Non-static field 'strI' cannot be referenced from a static context*/

    }
    public static void method1(){

        System.out.println(strS);
        System.out.println(sayiS);
        System.out.println(chrS);
        System.out.println(blS);



      /**  System.out.println(sayiI); //Non-static field 'sayiI' cannot be referenced from a static contex */

    }
    public void method2(){

        System.out.println(strS);
        System.out.println(sayiS);
        System.out.println(chrS);
        System.out.println(blS);


        System.out.println(strI);
        System.out.println(sayiI);
        System.out.println(chrI);
        System.out.println(blI);


    }
}
