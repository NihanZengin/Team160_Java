package H07_D23_OOP.K29_Inheritance.D03_constructorCall;

public class C05_P extends C04_GP {
    C05_P(){
        // super();
        System.out.println("P parametresiz constructor calisti");
    }

    C05_P(String s){
        this();
        System.out.println("P String parametreli constructor calisti");
    }

    C05_P(int a){
        super("Veli");
        System.out.println("P int parametreli constructor calisti");
    }
}
