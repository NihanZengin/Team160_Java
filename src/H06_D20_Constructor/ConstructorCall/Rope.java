package H06_D20_Constructor.ConstructorCall;

public class Rope {

    public static void swing() {

        System.out.print ("swing ");
    }
    public void climb() {
        System.out.println("climb ");
    }
    public static void play() {
        swing() ;
        // climb() ; //static bolgeden static olmayani cagiramazsiniz bu sebeple alti cizilmis
    }

    public static void main(String[] args) {

        Rope rope = new Rope();
        rope. play ();


        Rope rope2 = null; //constructer yazilmamis bu sebeple obje olusmamis
                           //null olarak isaretlendigi icin hata vermez
                           //normalde calistirildiginda nullPointerException verirdi
                           //ama burda rope2 objesine ihtiyac olmadan (play static oldugu icin )
                           //play(); calisabileceginden burada rope2 yi Java gormezden geldiginden
                           // NullPointerException vermedi.
        rope2.play() ; // play() static oldugundan, objeye ihtiyac yok, Java rope2'yi yok sayiyor

        /*
            23.satirda Rope rope2; yazilip birakilsaydi
            24.satirda rope2.play(); CTE verirdi.
            Java, deger atamadin ki kullanasin derdi.

            null olarak isaretlendigi icin
            Java 24.satirda CTE vermez

            24.satira gecildigildiginde
            rope2 objesi null olarak isaretlendiginden
            rope2 objesi kullanilmaya calisilirsa NullPointerException verir
            ANCAKKK play() static oldugundan, rope2'ye ihtiyac duymaz
            bundan dolayi 24.satir calisir

         */
    }
}
