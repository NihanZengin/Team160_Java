package H06_D20_Constructor.Giris;

public class C04_Fabrika {

    String perIsim="isim atanmamis";
    String perAdres="adres atanmamis";
    String perTel="tel atanmamis";

    public double maasHesabi(double mesai, double fazlaMesai){
        return mesai*17 +fazlaMesai*23;
    }
    /*

        Java OPP(Object Oriented Programming) kullanir

        Yani biz java ile
        once Class'lar olusturup
        o class'lardan olusturacagimiz objeler ile
        istedigimiz islemleri yapariz

        Java olusturulan her class'tan OBJA OLUSTURULABILMESI icin
        Her class'a bir CONSTRUCTOR koyar
     */

    /*
    Java'nin default olarak koydugu bu constructer GORUNMEZ

    default constructor parametresizdir, ve body'sinde kod OLMAZ

    EGER kod yazilirken gorunur bir constructor olusturulursa
    Java default constructor'i siler
     */

    C04_Fabrika(){

    }

    /*
    Iste default constructor bu yukardaki gibi gorunur, biz kendimiz yazdigimiz icin Java gorunmez Default comstructor'i sildi
    Bizim yazdigimiz sadece Parametresiz Constructor'dir.
    Ve bu Default Constructor ile ayni islevi yapar
     */
}
