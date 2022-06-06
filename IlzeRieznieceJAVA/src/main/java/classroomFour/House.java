package classroomFour;

public class House {
    // define tikai vertibas, metodi nevajag definet; tiek izveidota klase, objektam maja
    String ielasNosaukums;
    int majasNumurs;
    int stavuSkaits;
    int ieejuSkaits;
    int istabuskaits;
    double platiba;
   // int cena;

    Cena cena;
    boolean irStavvieta;
    //char valuta;
    int skatijumuSkaits;

    public double cenaKvadratmetra(){
        return cena.cena/platiba;

    }

    //tepat var ari definet metodes un pieskirt/nepieskirt vertibas

    public void printetAdresi(){
        System.out.println("Majas adrese ir: " + ielasNosaukums + " " + majasNumurs);

    }
    public void printetPapildusInformaciju(){
        printetAdresi();
        System.out.println("Papildu informacija:\n istabu skaits: " + istabuskaits +
                "\n platiba: " + platiba +
                "\n cena: " + cena +
                "\n cena kvadratmetra ir: " + cena.cena/platiba);
    }




}
