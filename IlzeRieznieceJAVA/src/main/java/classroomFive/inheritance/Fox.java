package classroomFive.inheritance;

public class Fox {
    String name;
    int legCount;

    public Fox(int legCount, String name) {
        this.legCount = legCount;
        this.name = name;

    }
    public void printLegCount(){
        System.out.println("Vards: " + name + "; kaju skaits ir: " + legCount);
    }
}
