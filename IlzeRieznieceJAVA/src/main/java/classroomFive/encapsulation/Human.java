package classroomFive.encapsulation;

public class Human {
    private int age;
    private String name;
    private String surname;
    private double height;

    //ja mainigie ir private, var generet konstruktoru l.taustins-generate-constructor
    // -""- var generet l.taustins-generate-getter and setter -> uzgenere public metodes

    public int getAge() {
        return age;
    }

    public void setAge(int age) {// metode, kas uzstada vecumu un norada to ka metodes parametru
        if (age <= 0) {
            System.out.println("Vecums nav pareizs");
            throw new IllegalArgumentException(); // programma nebeigs darbu, bet pateiks, ka ir kluda

        } else {
            this.age = age;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
