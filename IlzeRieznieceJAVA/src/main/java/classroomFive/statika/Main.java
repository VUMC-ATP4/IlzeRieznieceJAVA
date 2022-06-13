package classroomFive.statika;

public class Main {
    public static void main(String[] args) {
        Car auto1 = new Car("BMW", "Melns");
        System.out.println("Auto skaits sistema: " + auto1.countOfCarsCreatedInSystem);
        Car auto2 = new Car ("Mercedes", "Balts");
        System.out.println("Auto skaits sistema: " + auto1.countOfCarsCreatedInSystem);
        auto1.klasesApraksts = "Si ir auto klase"; // jo Car klase static, vertiba darbosies visiem objektiem
        System.out.println("auto1: " + auto1.getColor() + " " + auto1.getName() + "; " + auto1.klasesApraksts);
        System.out.println("auto2: " + auto2.getColor() + " " + auto2.getName() + "; " + auto2.klasesApraksts);

        auto2.klasesApraksts = "Si ir auto klase xxxx";
        System.out.println("auto1: " + auto1.getColor() + " " + auto1.getName() + "; " + auto1.klasesApraksts);
        System.out.println("auto2: " + auto2.getColor() + " " + auto2.getName() + "; " + auto2.klasesApraksts);

        Car.makeSound(); // nostrada, jo statiska metode Car klase
        auto1.makeSound();
        auto2.makeSound();

    }
}
