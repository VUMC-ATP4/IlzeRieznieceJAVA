package homeworkTwo;

import java.util.Scanner;

public class HomeworkTwoMethodes {
    public static void main(String[] args) {

    // Fifth task - print business card 3 times

        printBusinessCard();
        printBusinessCard();
        printBusinessCard();

    //  Sixth task - print new business card with arguments 2 times

        String card = printBusinessCardTwo("Kristīne ", "Vītola ", "+371 29867563", 1990);
        String card1 = printBusinessCardTwo("Jāzeps", "Vītols", "+371 29867843", 2000);
        System.out.println("Business card \n" +  card);
        System.out.println("Business card \n" +  card1);


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



    static String printBusinessCardTwo(String nameTwo, String surnameTwo, String phoneNumberTwo, int yearOfBirthTwo) {
        return "##########\nVizitkarte" +
                "\nVārds:" + nameTwo +
                "\nUzvārds:" + surnameTwo +
                "\nTelefona nr:" + phoneNumberTwo +
                "\nDzimšanas gads:" + yearOfBirthTwo +
                "\n##########";

    }

    static int  summa(int a, int b) {
        return a+b;
    }

    static  double avr(double a, double b, double c) {
        return (a + b + c) / 3;

    }
}
