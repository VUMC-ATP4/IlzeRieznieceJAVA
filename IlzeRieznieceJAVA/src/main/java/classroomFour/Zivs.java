package classroomFour;

public class Zivs {
    String zivsNosaukums;
    String zivsIzmers;
    boolean irKupinata;
    double cenaParKg;
    char valuta = '$';
    String izcelsmesValsts = "Latvija";

    public void printetNosaukumu(){
        System.out.println("Zivs ir: " + zivsNosaukums + " " + "\n Izcelsmes valsts: " + izcelsmesValsts);
    }

    public void printetPapilduInformaciju(){
        printetNosaukumu();
        System.out.println("Zivs izmers: " + zivsIzmers +
        "\n Cena par kg: " + cenaParKg + valuta +
        "\n Vai zivs ir kupinata? " + irKupinata);
    }

}
