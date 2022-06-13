package classroomFive.inheritance;

public class Dog extends Animal { // inheritance
    public Dog(int legCount, String name) {
        super(legCount, name);
    }
//dinamiskais polimorfisms, ar parrakstisanu
//override metode - animal klase ir make sound metode, kas neatbilst Dog, tadel parraksta esoso metodi
    @Override
    public void makeSound() {
        System.out.println("Es esmu suns. Vau, vau, vau...");
    }
}
