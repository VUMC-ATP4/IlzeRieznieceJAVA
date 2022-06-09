package homeworkThree;

import java.util.Scanner;

public class LoopHomework {
    public static void main(String[] args) {

        System.out.println("Pirmais uzdevums\n");
        // nolasa veselus skaitlus, ko ievada, apstajas, kad summa ir 100

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ieraksti veselu skaitli");
        int number = scanner.nextInt();
        int summa = 0;
        while (summa <= 99) {
            summa = summa + number;
            summa++;
            System.out.println("Ieraksti veselu skaitli");
            number = scanner.nextInt();

        }
        System.out.println("Gatavs");


        System.out.println("\nOtrais uzdevums\n");
        // noteikt, vai ievaditais skaitlis ir pirmskaitlis - skaitlis dalas ar 1 un ar sevi un ir lielaks par 1

        System.out.println("Ieraksti skaitli");
        int skaitlis = scanner.nextInt();
        int i, m = 0, flag = 0;
        //int n = 41;// it is the number to be checked
        m = skaitlis / 2;
        if (skaitlis == 0 || skaitlis == 1) {
            System.out.println(skaitlis + " nav pirmskaitlis");
        } else {
            for (i = 2; i <= m; i++) {
                if (skaitlis % i == 0) {
                    System.out.println(skaitlis + " nav pirmskaitlis");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(skaitlis + " ir pirmskaitlis");

            }
        }

        System.out.println("\nTrešais uzdevums\n");
        // Definet masivus String, int, char, izvadit visas vertibas ar while, do wile, for loop, for each

        String[] cities = new String[4];
        cities[0] = "Kuldīga";
        cities[1] = "Cēsis";
        cities[2] = "Valmiera";
        cities[3] = "Rīga";
        int[] randomSkaitli = {45, 55, 67, 89, 97};
        char[] randomBurti = {'A', 'B', 'C', 'D'};
        int iterators = 0;
        while (iterators < cities.length) {
            System.out.println(cities[iterators]);
            iterators++;
        }
        System.out.println("##########################");
        int a = 0;
        do {
            System.out.println(randomSkaitli[a]);
            a++;
        }
        while (a < randomSkaitli.length);

        System.out.println("##########################");

        for (int b = 0; b < randomBurti.length; b++) {
            System.out.println(randomBurti[b]);
        }

        System.out.println("##########################");

        System.out.println("\nCeturtais uzdevume \n");
        // definet veselu skaitlu masivu ar izmeru 100, ar ciklu aizpildit masivu ar para skaitliem un izvadit tos viena linija

        for (int l = 1; l < 100; l++) {
            if (l % 2 == 0) {
                System.out.print(l);
            }
        }
        System.out.println("\nPiektais uzdevums\n");
        // Aprekinat dota skaitla faktorialo vertibu

        System.out.println("Ievadi skaitli, lai aprēķinātu faktoriālo vērtību");
        int cipars = scanner.nextInt();
        int fact = 1;
        int value = 1;

        while (value <= cipars) {
            fact = fact * value;
            value++;
        }
        System.out.println("Faktoriālā vērtība skaitlim " + cipars + " ir " + fact);

        System.out.println("\nSestais uzdevums \n");
        // lietotajam jauzmina parole, ir tris meginajumi, pec meginajuma jaizvada atbilstoss teksts - pareizi, nepareizi, blokets

        final int pinKods = 2222;
        int lietotajaPinKods;
        int ievaditoReizuSkaits = 0;
        System.out.println("Ievadi konta PIN kodu");
        lietotajaPinKods = scanner.nextInt();

        while (lietotajaPinKods != pinKods && ievaditoReizuSkaits <= 3) ;
        System.out.println("Nepareizs PIN, mēģiniet vēlreiz");
        lietotajaPinKods = scanner.nextInt();
        lietotajaPinKods++;

        if (lietotajaPinKods == pinKods) {
            System.out.println("PIN ir pieņemts, laipni lūdzam atpakaļ");
        } else {
            System.out.println("Atvainojiet, bet jūs esat bloķēts");
        }
    }


}

