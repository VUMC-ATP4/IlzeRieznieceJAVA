package classroomFour;

public class Bicycle {
    //definesim informaciju
    int speed = 21; // nodefinets pec noklusejuma
    String name = "Author";
    String color = "Green";
    int weight;
    double rataIzmers;

    public void bremze() {
        speed--;
    }

    public void spiedPedalus() {
        speed++;
    }
}
