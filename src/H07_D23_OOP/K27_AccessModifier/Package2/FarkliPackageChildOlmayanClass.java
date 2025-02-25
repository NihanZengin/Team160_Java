package H07_D23_OOP.K27_AccessModifier.Package2;

import H07_D23_OOP.K27_AccessModifier.Package1.Datalar;

public class FarkliPackageChildOlmayanClass {

    public static void main(String[] args) {

        //System.out.println(Datalar.sayiPrivate);
        //Datalar.methodPrivate();

        //System.out.println(Datalar.strDefaultAccMod);
        //Datalar.methodDefaultAccMod();

        //System.out.println(Datalar.chrProtected);
        //Datalar.methodProtected();

        System.out.println(Datalar.dblPublic);
        Datalar.methodPublic();
        /// Eğer Datalar farklı bir paketteyse,
        ///onu import paketAdi.Datalar; şeklinde
        ///import etmen gerekiyordu.
        ///Java'da farklı paketlerdeki public sınıflara
        ///erişmek için bu gereklidir.
        /// import H07_D23_OOP.K27_AccessModifier.Package1.Datalar;
    }
}
