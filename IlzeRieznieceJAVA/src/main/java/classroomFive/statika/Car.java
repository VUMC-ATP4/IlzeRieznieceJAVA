package classroomFive.statika;

public class Car {
    private String name;
    private String color;
    public static String klasesApraksts; //static nozime, ka visi objekti no klases Car izmantos vienu un to pasu mainigo
    public static int countOfCarsCreatedInSystem;

    public Car(String name, String color) {
        this.name = name;
        this.color = color;
        countOfCarsCreatedInSystem++;
    }

    public static void makeSound(){ // statiska metode
        //Statiska metode nevar izmantot nestatisku objekta mainigo
        System.out.println("Trrr");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
