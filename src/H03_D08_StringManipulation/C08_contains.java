package H03_D08_StringManipulation;

public class C08_contains {


    public static void main(String[] args) {

        String str = "Java ile her sey kolay";

        System.out.println(str.contains("a")); //true

        System.out.println(str.contains("va il")); // true // karakter zincirine bakiyor

        System.out.println(str.contains("Ja her")); //false //

        System.out.println(str.contains("java")); //Case Sensitiv oldugundan false doner / Ignorecase yoktur

        System.out.println(str.contains("")); // hiclik var mi? --> true



    }
}
