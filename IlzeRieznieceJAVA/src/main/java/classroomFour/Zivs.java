package classroomFour;

public class Zivs {
    String zivsNosaukums;
    String zivsIzmers;
    boolean irKupinata;
    double cenaParKg;
    char valuta = '$';
    String izcelsmesValsts = "Latvija";


    char dzimums;
    String nosaukums;
    String vide;
    int vecums;

    public void printetZivi() {
        System.out.println("Zivs dzimums: " + dzimums);
        System.out.println("Zivs nosaukums: " + nosaukums);
        System.out.println("Zivs vide: " + vide);
        System.out.println("Zivs vecums: " + vecums + "gadi veca");

    }
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
