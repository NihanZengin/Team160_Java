package H04_D15_Scope;

public class C04_InstanceVariablesObjeIleKullanim {
    String strI;
    static String strS;
    int sayiI=10;
    static int sayiS;
    char chrI;
    static char chrS='#';
    boolean blI=true;
    static boolean blS;

    public static void main(String[] args) {
        //static alanda instance variable'i direkt kullanamayiz
        //System.out.println(chrI);

        C04_InstanceVariablesObjeIleKullanim obj = new C04_InstanceVariablesObjeIleKullanim();

        System.out.println(obj.sayiI);
        System.out.println(obj.strI);
        System.out.println(obj.chrI);
        System.out.println(obj.blI);
        obj.sayiI=45;
    }

    public static void method1(){


    }

    public void method2(){

    }
}
