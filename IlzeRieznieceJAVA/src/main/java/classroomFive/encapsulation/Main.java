package classroomFive.encapsulation;

public class Main {
    public static void main(String[] args) {
        Bird putns = new Bird();
        putns.name = "Pollija";
        // putns. colour = "Sarkans" // nevar pieklut, pieskirt vai izmainit, jo private mainigais Bird klase
        putns.printText();
        putns.defaultMethodExample();

        // cilvekam uzgeneretas publiskas metodes, tad varam pieklut tagad seit
        Human cilveks = new Human();
        cilveks.setAge(8);
        cilveks.setHeight(1.60);
        cilveks.setName("Anna");
        cilveks.setSurname("Ozolina");
        System.out.println(cilveks.getAge());
        System.out.println(cilveks.getHeight());
        System.out.println(cilveks.getName());
        System.out.println(cilveks.getSurname());


        Matematika matematika = new Matematika();
        System.out.println(matematika.add (30,20));
        System.out.println(matematika.add(1.3, 3.5));
        matematika.paraditTekstu("Ilze");
        matematika.paraditTekstu("Ilze", false);
        matematika.paraditTekstu("Juris", true);
    }
}
