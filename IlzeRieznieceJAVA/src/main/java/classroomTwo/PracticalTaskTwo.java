package classroomTwo;

import java.util.Scanner;

public class PracticalTaskTwo {
    public static void main(String[] args) {
        System.out.println("This is my second JAVA lesson");

// Recheck previous homework
        double n = 100.25;
        int m = 10;

        //System.out.println("n-m = " + (n / m));
        System.out.println(String.format("%.2f", (n / m)));

        String name = "Ilze";
        String surname = "Riezniece";
        String role = "Content manager";


        double videjaAtzime = 7.3214; // check previous homework

        String concatTeikums = "Mani sauc " + name + " Mans uzvārds ir " + surname + " Es esmu " + role;
        String teikums = String.format("Mani sauc %s. Mans uzvārds ir %s. Es esmu %s. Mana vid atz ir %.1f",name,surname,role,videjaAtzime);

        System.out.println(teikums);
        System.out.println(concatTeikums);

        System.out.println("Šeit jābūt nepatiesam" + (5>10));
        System.out.println("Šeit jābūt nepatiesam: " + (5>10));
        System.out.println((5<10));
        System.out.println(6==5); //false
        System.out.println(5==5);   //true
        System.out.println(6!=5); //true
        System.out.println(5!=5); //false
        System.out.println("Šeit jābūt nepatiesam: " + (5 > 10));
        System.out.println((5 < 10));
        System.out.println(6 == 5); //false
        System.out.println(5 == 5);   //true
        System.out.println(6 != 5); //true
        System.out.println(5 != 5); //false
        int vecums = 18;
        System.out.println(vecums >= 18);
        int bernaVecums = 5;
        System.out.println(bernaVecums<=5);
        System.out.println(vecums>bernaVecums);
        boolean isEligibleToVote = vecums >= 18;
        System.out.println("Vai cilvēks drīkst balsot ? " + isEligibleToVote);

        int x = 4;
        int summa = 10;
        System.out.println(summa);
        boolean vaiIrPatiess = ((x < 5) && (x < 10)); //true
        x = 5;
        System.out.println((x < 5 && x < 10)); //false
        System.out.println((x < 5 || x < 10)); //true
        System.out.println(vaiIrPatiess);
        int a = 10;
        int b = 20;
        int c = 20;
        int d = 0;
        System.out.println((a < b) && (b == c));
        System.out.println(a > b || c == d);

        System.out.println(!(a>b));


        int skaitlis = 5;

        if (skaitlis > 0) {
            System.out.println(skaitlis + " ir pozitivs!");
        } else if (skaitlis < 0) {
            System.out.println(skaitlis + " ir negativs!");
        } else{
            System.out.println(skaitlis + " ir NULLE!");
        }

        int month = 3;

        switch (month) {
            case 1:
                System.out.println("Janvāris");
                break;
            case 2:
                System.out.println("Februāris");
                break;
            case 12:
                System.out.println("Decembris");
            default:
                System.out.println("Mēnesis" + month + " nav definets");
        }


        int skaitlisB = 343;

        switch(skaitlisB){
            case 10:
                System.out.println("Skaitlis  = 10");
                break;
            case 15:
                System.out.println("Skaitlis = 15");
                break;
            case 20:
                System.out.println("skaitlis = 20");
                break;
            default:
                System.out.println("Skaitlis nezināms");
        }
        int q = 10;

        if(q>0){
            System.out.println("Skaitlis ir lielaks par nulli");
        }

        int cilvekaVecums=65;
        char dzimums = 'V';
        boolean drikstDoties = false;

        if(dzimums=='V' && cilvekaVecums >=65){
            drikstDoties = true;
        } else if(dzimums=='S' && cilvekaVecums>=60){
            drikstDoties=true;
        }

        System.out.println("Cilveks drikst doties pensija " + drikstDoties);

        int skaitlisX = 14;

        if (skaitlisX % 2 == 0) {
            System.out.println("Skaitlis ir pāra");
        } else {
            System.out.println("Skaitlis ir nepāra");
        }


    }
}
