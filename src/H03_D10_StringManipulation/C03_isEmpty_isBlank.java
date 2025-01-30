package H03_D10_StringManipulation;

public class C03_isEmpty_isBlank {
    public static void main(String[] args) {
        String s1 = "";
        String s2 = " ";
        String s3 = "     ";
        String s4 = "Hello World";

        System.out.println(s4.isEmpty()); // false     length()==0
        System.out.println(s4.isBlank()); // false      true if the string is empty or contains only white space

        System.out.println(s3.isEmpty()); // false
        System.out.println(s3.isBlank()); // true

        System.out.println(s2.isEmpty()); // false
        System.out.println(s2.isBlank()); // true

        System.out.println(s1.isEmpty()); // true
        System.out.println(s1.isBlank()); // true

    }
}
