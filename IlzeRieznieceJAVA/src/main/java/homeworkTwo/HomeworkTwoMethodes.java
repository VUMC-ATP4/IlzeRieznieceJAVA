package homeworkTwo;

import java.util.Scanner;

public class HomeworkTwoMethodes {
    public static void main(String[] args) {

    // Fifth task - print business card 3 times

        printBusinessCard();
        printBusinessCard();
        printBusinessCard();

    //  Sixth task - print new business card with arguments 2 times
        printBusinessCardTwo();
        printBusinessCardTwo();

    //  Seventh task - 2 int as arguments in method sum,return sum without print. Result print in the main method

        int sum = summa(7,9);
        System.out.println(sum);

     // Eight task
        double ave = avr(14, 5, 3);
        System.out.println(ave);

    }

    static void printBusinessCard(){
        String name = "Ilze";
        String surname = "Riezniece";
        int phoneNumber = 28708876;
        int yearOfBirth = 1988;
        System.out.println("Business card");
        System.out.println("##########");
        System.out.println("Name:" + " " + name);
        System.out.println("Surname:" + " " + surname);
        System.out.println("Phone number: +371" + " " + phoneNumber);
        System.out.println("Year of birth:" + " " + yearOfBirth);
        System.out.println("##########");

    }

    static void printBusinessCardTwo(){
        String nameTwo = "Anna";
        String surnameTwo = "Diga";
        int phoneNumberTwo = 29847356;
        int yearOfBirthTwo = 1990;

        String teikums = (" Name:" + nameTwo + "\n Surname:" + " " + surnameTwo + "\n Phone number: +371" + " " +phoneNumberTwo + "\n Year of birth:" + " " + yearOfBirthTwo);
        System.out.println("Business card two");
        System.out.println("##########");
        System.out.println(teikums);
        System.out.println("##########");

    }

    static int  summa(int a, int b) {
        return a+b;
    }

    static  double avr(double a, double b, double c) {
        return (a + b + c) / 3;

    }
}
