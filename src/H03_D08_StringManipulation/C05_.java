package H03_D08_StringManipulation;

public class C05_ {
    public static void main(String[] args) {


        String str4 = "Not";
        String str5 = "NOT";
        String str6 = new String("not");
        String str7 = "No"+"T";
        String s = "no";
        String t = "T";
        String str8 = s+ t;
        String k = "n";
        String str9 = k.toUpperCase()+"ot";

        System.out.println(str4.equalsIgnoreCase(str5));
        System.out.println(str4.equalsIgnoreCase(str6));
        System.out.println(str4.equalsIgnoreCase(str7));
        System.out.println(str4.equalsIgnoreCase(str8));
        System.out.println(str4.equalsIgnoreCase(str9));
        System.out.println(str4.equalsIgnoreCase("Not"));




    }
}
