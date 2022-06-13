package classroomFive.inheritance;

public class Example {
    public static void main(String[] args) {
        Dog dog1 = new Dog(4, "Reksis");
        Octopus octopus1 = new Octopus(8, "Astonkajis");
        Chicken chicken1 = new Chicken(2, "Balta vista");
        Chicken chicken2 = new Chicken(1, "Melna vista");

        Fox fox = new Fox(4, "Kumins");

        dog1.printLegCount();
        octopus1.printLegCount();
        chicken1.printLegCount();
        chicken2.printLegCount();

        System.out.println("Octopus lives in " + octopus1.waterType);
        Animal [] dzivnieki = {dog1, octopus1, chicken1, chicken2}; // masivs - var izveidot, jo ir kopiga klase
                // masivam nevar pievienot klasi Fox, jo ta nav saistita ar Animal klasi

        //izprintet visu masivu, izmantojot ciklu
        for (int a = 0; a < dzivnieki.length; a++) {
            dzivnieki[a].printLegCount();

        }
        dog1.makeSound();
        chicken1.makeSound();
        octopus1.makeSound();


    }
}
