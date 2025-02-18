package H06_D20_Constructor.ObjelereDegerAtamaVeParametreliConstructor;

public class C14_Auto {
    String marka="marka atanmamis";
    String model="model atanmamis";
    String renk="renk atanmamis";
    int yil=1900;
    int fiyat;

    @Override
    public String toString() {
        return "C14_Auto{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", renk='" + renk + '\'' +
                ", yil=" + yil +
                ", fiyat=" + fiyat +
                '}';
    }

    C14_Auto(){}

    C14_Auto(String mrk, String mdl){
        marka=mrk;
        model=mdl;
    }
    C14_Auto(String marka, String model,int yil){
        this.marka=marka;
        this.model=model;
        this.yil=yil;

        //mdl. mrk gibi kisaltmalar ilerde hatirlamak zor olacagi icin
        // tercih edilmemeli
        //ama Constructer icindeki marka ile
        // Class'da tanimlanmis marka variable karistigi icin
        //Class leveldeki variable'lar onune
        // this.marka seklinde yaziyoruz.,

    }

    // tum instance variable'lari parametre olarak kabul eden bir Constructer'i intelliJ ile olusturun

    //Code--> Generate --> Constructer --> ıstedıklerını sec


    public C14_Auto(String marka, String model, String renk, int yil, int fiyat) {
        this.marka = marka;
        this.model = model;
        this.renk = renk;
        this.yil = yil;
        this.fiyat = fiyat;
    }
}
