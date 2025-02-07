package H04_D15_Scope;

public class C05_ClassLevelVariables_BaskaClasstanErisim {

    /**Bir class'tan baska bir class'taki class
     * level variable'lara ulasabiliriz*/

    public static void main(String[] args) {


         /// static: classIsmi.classUyeIsmi

        C04_InstanceVariablesObjeIleKullanim.method1();
        System.out.println(C04_InstanceVariablesObjeIleKullanim.blS);
        System.out.println(C04_InstanceVariablesObjeIleKullanim.sayiS);
        C04_InstanceVariablesObjeIleKullanim.sayiS=56;


        /// instance: obje olusturarak

        C04_InstanceVariablesObjeIleKullanim obj=new C04_InstanceVariablesObjeIleKullanim();
        obj.method2();
        System.out.println(obj.strI);
        obj.chrI='5';


    }
}
