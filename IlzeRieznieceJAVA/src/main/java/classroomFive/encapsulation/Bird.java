package classroomFive.encapsulation;

public class Bird { // public nozima, ka klasi var veidot visur, visa projekta

    public String name; // mainigajam vares pieklut no jebkuras vietas projekta
    // private String name; // var pieklut tikai sis klases ietvaros
    private String colour;

    // metode, void, jo nekas netiks mainits, publiska, var izsaukt no citas klases
    public void printText(){
        System.out.println("Si ir publiska metode");
        System.out.println("Printeju putnu");
    }

    // nevar izsaukt no citas klases, var izsaukt tikai no sis klases
    private void printTextSpecial(){
        System.out.println("Si ir privata metode");

    }

    // Var pieklut pakotnes ietvaros
    void defaultMethodExample(){
        System.out.println("Si ir default metode");
    }
}
