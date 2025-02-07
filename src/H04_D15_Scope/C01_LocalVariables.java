package H04_D15_Scope;

public class C01_LocalVariables {

    /**Scape bir variable'in erisilebildigi alandir.*/

    public static void main(String[] args) {
        String str ="Hava guzel";          //str lokal variable oldugu icin main mothodda olusturuldugundan mail method disinda kullanilamaz

        for(int i=0; i<10; i++){
            System.out.println(i);         //i veya str1 loop variable oldugundan, for loop icinde olusturuldugundan for loop siniri disinda kullanilamaz
            String str1="Ali";
            System.out.println(str1);
        }
    }

    public static void method1(){
        int sayi=10;
    }
    public void method2(){
        char chr ='@';
    }
}
