package H07_D23_OOP.K32_interfaces;

public class N01_ChildOfInterface implements M01_ParentInterface{


    public static void main(String[] args) {
        /*
         parent interface'deki default method6 ve static method7
         body'ye sahip olduklarindan
         child class'larin implement etmesi ZORUNLU OLMAZ

         bu method'lari child class'lar isterlerse direk parent interface'den kullanirlar
         isterlerse de kendilerine uyarlayabilirler

         aralarindaki fark
         static keyword kullananlari interfaceadi.staticMethodAdi ile cagirabilirsiniz
         ama default keyword kullanalari obje ile kullanmak gerekir
         */

        M01_ParentInterface.method7();

        N01_ChildOfInterface obj = new N01_ChildOfInterface();
        obj.method6();


    }

    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }

    @Override
    public int method3() {
        return 0;
    }

    @Override
    public String method4() {
        return "";
    }

    @Override
    public int method5() {
        return 0;
    }
}
