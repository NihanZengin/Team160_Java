package H07_D22_passByValue_immutableClasses.K26_StringBuilder;

public class C02_StringBuilderMethodlari {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");

        /// append methodu :

        sb.append(" Candir "); //String
        sb.append(3);          //integer,float,double..
        sb.append(true);       //boolean
        sb.append('m');        //char

        System.out.println(sb); // Java Candir 3truem


        /// index numarasi vererek :
        String str = "Ali topu at";

        sb.append(str,3,8); //str'in 3.indexinden 8. indexine kadar olan kismi sb StringBuilder'ina ekler

        System.out.println(sb); // Java Candir 3truem topu



        /// replace methodu :
        String metin = "Ali Can";
        System.out.println(metin.replace("Ali", "veli")); // veli Can

        sb.replace(11,18,"*"); //11 ila 18 arasindaki indexlere sadece bir * koyar
        System.out.println(sb); // Java Candir*topu

        sb.replace(11,16,".");
        System.out.println(sb); // Java Candir.


        /// reverse methodu :
        sb.reverse();

        System.out.println(sb); // .ridnaC avaJ

        System.out.println(sb.reverse()); // Java Candir.
        /// sout icinde de method kullansaniz degisiklik kalici olur

        System.out.println(sb); // Java Candir.


        /// insert methodu :
        sb.insert(4," hem");

        System.out.println(sb); // Java hem Candir.


        /// deleteCharAt methodu
        sb.deleteCharAt(15);

        System.out.println(sb); // Java hem Candir
        //sondaki nokteyi sildik index no vererek


    }
}
