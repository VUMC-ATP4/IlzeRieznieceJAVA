package homeworkThree;

import java.util.Scanner;

public class LoopHomework {
    public static void main(String[] args) {

        System.out.println("Pirmais uzdevums\n");
        // nolasa veselus skaitlus, ko ievada, apstājas, kad summa ir lielāka par 100

        Scanner scanner = new Scanner(System.in);
        int summa = 0;
        while (summa <= 100) {
            System.out.println("Ieraksti veselu skaitli");
            int number = scanner.nextInt();
            summa = summa + number;
            System.out.println("Šobrīd summa ir " + summa);

        }
        System.out.println("Gatavs, summa ir " + summa);


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
        int pilsetas = 0;
        while (pilsetas < cities.length) {
            System.out.println(cities[pilsetas]);
            pilsetas++;
        }

        int skaitli = 0;
        while (skaitli < randomSkaitli.length) {
            System.out.println(randomSkaitli[skaitli]);
            skaitli++;
        }

        int burti = 0;
        while (burti < randomBurti.length) {
            System.out.println(randomBurti[burti]);
            burti++;
        }

        System.out.println("##########################");
        int skaili2 = 0;
        do {
            System.out.println(randomSkaitli[skaili2]);
            skaili2++;
        }
        while (skaili2 < randomSkaitli.length);

        int burti2 = 0;
        do {
            System.out.println(randomBurti[burti2]);
            burti2++;
        }
        while (burti2 < randomBurti.length);

        int pilsetas2 = 0;
        do {
            System.out.println(cities[pilsetas2]);
            pilsetas2++;
        }
        while (pilsetas2 < cities.length);


        System.out.println("##########################");

        for (int b = 0; b < randomBurti.length; b++) {
            System.out.println(randomBurti[b]);
        }

        for (int b = 0; b < randomSkaitli.length; b++) {
            System.out.println(randomSkaitli[b]);
        }

        for (int b = 0; b < cities.length; b++) {
            System.out.println(cities[b]);
        }
        System.out.println("##########################");

        for (String pilsetas3 : cities ) {
            System.out.println(pilsetas3);
        }

        for (int skaitli3 : randomSkaitli) {
            System.out.println(skaitli3);
        }

        for (char burti3 : randomBurti) {
            System.out.println(burti3);
        }


        System.out.println("\nCeturtais uzdevums \n");
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

        while (ievaditoReizuSkaits <= 3) {
            ievaditoReizuSkaits++;
            System.out.println("Ievadi konta PIN kodu");
            lietotajaPinKods = scanner.nextInt();
            if (lietotajaPinKods == pinKods) {
                System.out.println("PIN ir pieņemts, laipni lūdzam atpakaļ");
                break;
            } else if (ievaditoReizuSkaits == 3 && lietotajaPinKods != pinKods) {
                System.out.println("Atvainojiet, bet jūs esat bloķēts");
                break;
            } else {
                System.out.println("Nepareizs PIN, mēģiniet vēlreiz");
            }
        }
    }
}

