package classroomFive.encapsulationTwo;

import classroomFive.encapsulation.Bird;
import classroomFive.encapsulation.Matematika;

public class Main {
    Bird vista = new Bird(); // nevares pieklut, ja nav public Bird klase

    public static void main(String[] args) {
        Bird vanags = new Bird();
        vanags.printText(); // piedava tikai printText, jo tikai ta ir publiska metode


    }

}
