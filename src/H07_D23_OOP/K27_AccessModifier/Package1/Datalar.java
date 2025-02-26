package H07_D23_OOP.K27_AccessModifier.Package1;

public class Datalar {

    static private int sayiPrivate;
    static String strDefaultAccMod; // default access modifier
    static protected char chrProtected;
    static public double dblPublic;

    private static void methodPrivate(){
        System.out.println("Private method calisti");
    }
    static void methodDefaultAccMod(){
        System.out.println("Default access modifier'a sahip method calisti");
    }
    protected static void methodProtected(){
        System.out.println("Protected method calisti");
    }
    public static void methodPublic(){
        System.out.println("Public method calisti");
    }

    public static void main(String[] args) {

        System.out.println(sayiPrivate);
        methodPrivate();

        System.out.println(strDefaultAccMod);
        methodDefaultAccMod();

        System.out.println(chrProtected);
        methodProtected();

        System.out.println(dblPublic);
        methodPublic();
    }
}
