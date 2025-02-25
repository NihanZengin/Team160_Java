package H07_D23_OOP.K27_AccessModifier.Package2;

import H07_D23_OOP.K27_AccessModifier.Package1.Datalar;

public class FarkliPackageChildClass extends Datalar {

    public static void main(String[] args) {

        //System.out.println(Datalar.sayiPrivate);
        //Datalar.methodPrivate();

        //System.out.println(Datalar.strDefaultAccMod);
        //Datalar.methodDefaultAccMod();

        System.out.println(Datalar.chrProtected);
        Datalar.methodProtected();

        System.out.println(Datalar.dblPublic);
        Datalar.methodPublic();

    }
}
