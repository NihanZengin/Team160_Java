package H07_D22_passByValue_immutableClasses.K25_Varargs;

public class C06_KodOkuma {
    public static void main(String[] args) {
        new C06_KodOkuma().C09(1,"Java");
        //burada obje olusturup C09 methoduna o sekilde ulasilmis

        C06_KodOkuma obj= new C06_KodOkuma(); //obj objesi olusturulmus
        obj.C09(2,"Java","Guzeldir"); // obj objesi uzerinden methoda ulasilmis

    }
    public void C09(int a, String...b){

        System.out.println(b[b.length-a]+" ");

        /*
        new C06_KodOkuma().C09(1,"Java");
        int a=1
        String[] b={"Java"} // tek elemanli array
        b.length-->1
        b[1-1]-->b[0]--> "Java"
        sout--> Java
         */

        /*
        obj.C09(2,"Java","Guzeldir");
        int a=2
        String[] b={"Java","Guzeldir"} // iki elemanli array
        b.length-->2
        b[2-2]-->b[0]--> "Java"
        sout--> Java
         */
    }
}
