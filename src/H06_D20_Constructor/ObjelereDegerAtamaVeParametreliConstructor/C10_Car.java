package H06_D20_Constructor.ObjelereDegerAtamaVeParametreliConstructor;

public class C10_Car {
    String marka="marka atanmamis";
    String model="model atanmamis";
    String renk="renk atanmamis";
    int yil=1900;
    int fiyat;

// Code --> Generate --> schift ile istedigini sec
    @Override
    public String toString() {
        return "C10_Car: " +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", renk='" + renk + '\'' +
                ", yil=" + yil +
                ", fiyat=" + fiyat;
    }
}
