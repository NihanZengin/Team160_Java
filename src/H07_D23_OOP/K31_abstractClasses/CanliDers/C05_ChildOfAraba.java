package H07_D23_OOP.K31_abstractClasses.CanliDers;

public class C05_ChildOfAraba extends C04_KuralciArabaClass{

    // Class 'C05_ChildOfAraba' must either be declared abstract
    // or implement abstract method 'fren()' in 'C04_KuralciArabaClass'
    // C05 class'i ya Abstract olmali
    // ya da parent edindigi abstract olan C04 class'indaki
    // fren, motor ve aku method'larini kendisine uyarlamali

    // public abstract void deneme();
    // Abstract method in non-abstract class
    // abstract olmayan (concrete) bir class'da abstract method OLUSTURULAMAZ


    @Override
    public void fren() {

    }

    @Override
    public void motor() {

    }

    @Override
    public void aku() {

    }

    public void klima(){
        System.out.println("cevreye duyarli klima");
    }

}
