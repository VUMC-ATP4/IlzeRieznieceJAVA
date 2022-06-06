package classroomThree;

import java.util.Scanner;

public class Masivi {
    public static void main(String[] args) {


        String[] gadaLaiki = {"Pavasaris", "Vasara", "Rudens", "Ziema"};
        int[] fibonacciNumbers = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34};
        double[] randomSkaitli = {21.3, 323.23, 412.45};


        System.out.println("Masiva garums ir: " + gadaLaiki.length); // masiva garums ir 4, bet indeksacija sakas ar 0

        System.out.println(gadaLaiki[0]);
        System.out.println(gadaLaiki[1]);
        System.out.println(gadaLaiki[2]);
        System.out.println(gadaLaiki[3]);
        System.out.println(fibonacciNumbers[3]);
        System.out.println(randomSkaitli[0]);

        String[] germanCars = new String[4];
        germanCars[0] = "Mercedes";
        germanCars[1] = "Audi";
        germanCars[2] = "BMW";
        germanCars[3] = "Opel";

        int iterators = 0;
        while (iterators < germanCars.length) {
            System.out.println(germanCars[iterators]);
            iterators++;
        }


        // Masivs ar cilveku vardiem

        String[] cilveki = {"Juris", "Anna", "Peteris"};
        int[] vecums = {33, 40, 34};
        System.out.println("Vards: " + cilveki[0] + "\n" + "Vecums: " + vecums[0]);


        //Cikls While

        int i = 0;
        while (i < 5) {
            System.out.println("I ir: " + i);
            i++; //cikls izpildisies 5 reizes, jo katru skaitli no 0-5 parbauda vienreiz
            // i = i+1 jeb i++
        }
        System.out.println("Cikla izeja");

        int q = 10;
        while (q > 1) {
            System.out.println("Q ir:" + q);
            //     q++; izpildisies muzigi, jo q vienmer palielinasies par 1
            q--; // tas pats, kas q = q-1;

            while (true) {
                int r = 0;
                r++;
                //    System.out.println(r); bezgaligs cikls, printe bezgaligi

                // nodefinet masivu ar veseliem skaitliem

                int[] bingoLotoLaimigieSkaitli = {3, 5, 48, 7, 6, 31};
                int counter = 0; // sakuma vertiba, sakas ar 0
                while (counter < bingoLotoLaimigieSkaitli.length) {
                    counter++;
                    System.out.println(bingoLotoLaimigieSkaitli[counter]);

                    // ir karsu saraksts, vajag izprintet visas kartis
                    String[] kartis = {"Pika duzis", "Ercena kalps", "Karava dama"};
                    int karts = 0;
                    System.out.println(String.format("Man roka ir %s kartis", kartis.length));
                    //while (karts < 3)
                    while (karts < kartis.length) {
                        System.out.println(kartis[karts]);
                        karts++;


                    }

                    // int number;
                    //           Scanner scanner = new Scanner(System.in);
                    //           do{
                    //              System.out.println("Ievadi skaitli lielaku par nulli, bet mazaku par 10");
                    //             number = scanner.nextInt();
                    //        } while (number <= 0 && number >= 10);


                    // for (int j = 0; j < 10; j++) {
                    //   System.out.println(j);

                    // }
                    for (int j = 2; j < 10; j = j + 2) {
                        System.out.println(j); // printe para skaitlus lidz 10

                        for (int k = 0; k < gadaLaiki.length; k++) {
                            System.out.println(gadaLaiki[k]);

                        }
// Ciemata ir majas ar numuriem no 1-50
// pircejs nevelas maju ar nr., kas dalas ar 3 vai 5 un nevelas nr. 13
// cik numuri atbilst
                        // izitere visus maju numurus
                        for (int l = 1; l <= 50; l++) {
                            //  System.out.println(l);
                            // parbauda, vai skaitlis dalas ar 3
                            if ((l%3 == 0) || (l%5 == 0) || (l == 13)) {
                                System.out.println("Sis numurs neder" + l);

                            } else {
                                System.out.println("Sis numurs mums der" + l);
                            }


                            int[] skaitlos = {1, 3, 4, 6, 1, 2, 3, 5, 1, 2, 5};
                            int summa = 0;
                            for (int skaitlis : skaitlos) {
                                summa = summa + skaitlis;
                                System.out.println(summa);

                            }

                        }

                    }

                }

                //Jauna metode, kas nolasa jaunu
                //             static int sumPositiveNumbers(){
                //               Scanner scanner = new Scanner(System.in);
                //             System.out.println("Ieraksti skaitli");
                //          int number = scanner.nextInt();
                //           int summa = 0;
                //         while (number >= 0) {
                //            summa = summa + number;
                //           System.out.println("Ieraksti skaitli");
                //          number = scanner.nextInt();
                //     }
                //     System.out.println("Pozitivo skaitlu summa ir" + summa);
                //     return summa;


            }
        }

        Scanner scanner = new Scanner(System.in);
        String parole = "Parole123";
        String lietotajaParole;
        do {
            System.out.println("Ievadi paroli");
            lietotajaParole = scanner.nextLine();
            System.out.println("Parbaudam paroli");
        } while (!lietotajaParole.equals(parole));
        System.out.println("Pareiza parole");


    }

}


