package classroomFive.inheritance;

import classroomFive.inheritance.Animal;

public class Octopus extends Animal {

    String waterType = "Salt water";

    public Octopus(int legCount, String name){
        super(legCount, name); //super nozime, ka konstruktors tiek nemts no klases aukstak, kas saja gadijuma ir animal
    }

    @Override
    public void makeSound() {
        super.makeSound(); // izsauc to pasu, kas ir galvenaja klase
    }
}
