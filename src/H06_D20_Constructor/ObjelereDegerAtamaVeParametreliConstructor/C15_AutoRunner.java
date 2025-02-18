package H06_D20_Constructor.ObjelereDegerAtamaVeParametreliConstructor;

public class C15_AutoRunner {
    public static void main(String[] args) {

        C14_Auto oto1=new C14_Auto();

        System.out.println(oto1);
        //C14_Auto{marka='marka atanmamis', model='model atanmamis', renk='renk atanmamis', yil=1900, fiyat=0}



        C14_Auto oto2= new C14_Auto("Mercedes","E200");
        System.out.println(oto2);
        //C14_Auto{marka='Mercedes', model='E200', renk='renk atanmamis', yil=1900, fiyat=0}



        C14_Auto oto3= new C14_Auto("BMW","520",2010);
        System.out.println(oto3);
        //C14_Auto{marka='BMW', model='520', renk='renk atanmamis', yil=2010, fiyat=0}



        C14_Auto oto4= new C14_Auto("Nıssan","Mıcra","Beyaz", 2015,10000);
        System.out.println(oto4);
        //C14_Auto{marka='Nıssan', model='Mıcra', renk='Beyaz', yil=2015, fiyat=10000}



    }
}
