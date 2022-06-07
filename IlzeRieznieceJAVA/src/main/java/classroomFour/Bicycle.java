package classroomFour;

public class Bicycle {
    //definesim informaciju
    int speed = 21; // nodefinets pec noklusejuma
    String name = "Author";
    String color = "Green";
    int weight;
    double rataIzmers;
    int atrums = 0;
    int atrumi = 21;
    String nosaukums = "Specialized";
    String krasa = "Zaļa";
    int svarsGramos;
    String bremzuTips = "";

    public void bremze() {
        speed--;
    }

    public void spiedPedalus() {
        speed++;
    }



    public void bremzeDivi() {
        if (bremzuTips.equals("V-veida")) {
            atrums = atrums - 2;
        } else if (bremzuTips.equals("Disku")) {
            atrums = atrums - 3;
        } else {
            atrums = atrums - 1;
        }
    }

    public void spiedPedalusDivi() {
        atrums = atrums + 5;
    }
}
