package classroomFour;

public class Main {

    public static void main(String[] args) {
        //objekts viens
        House majaViens = new House(); // nodefinets mainigais maja1, ar tipu house, pirmais, ir izmantotas klases nosaukums
        majaViens.majasNumurs = 1;
        majaViens.ielasNosaukums = "Brivibas iela";
        majaViens.printetAdresi();

        //objekts divi, definets pec klases house
        House majaDivi = new House();
        majaDivi.majasNumurs = 2;
        majaDivi.ielasNosaukums = "Gertrudes iela";
        majaDivi.printetAdresi();


        majaDivi.ielasNosaukums = "Izmainits nosaukums";
        majaDivi.printetAdresi();

        House majaTris = new House();
        majaTris.ielasNosaukums = "Lacplesa iela";
        majaTris.majasNumurs = 13;
        majaTris.istabuskaits = 3;
        majaTris.platiba = 100;
        Cena cena1 = new Cena();
        cena1.cena = 3000;
        cena1.valuta = '$';
        majaTris.cena = cena1;


        majaTris.printetPapildusInformaciju();
       // majaTris.skatijumuSkaits++;

       Bicycle bicycleOne = new Bicycle();
       // System.out.println(BicycleOne.name);

        System.out.println("Velosipēda ātrums ir = " + bicycleOne.speed);
        bicycleOne.spiedPedalus();
        System.out.println("Velosipēda ātrums ir = " + bicycleOne.speed);
        bicycleOne.spiedPedalus();
        bicycleOne.spiedPedalus();
        bicycleOne.spiedPedalus();
        bicycleOne.spiedPedalus();
        System.out.println("Velosipēda ātrums ir = " + bicycleOne.speed);
        System.out.println("Priekšā ir gājējs");
        bicycleOne.bremze();
        System.out.println("Velosipēda ātrums ir = " + bicycleOne.speed);
        bicycleOne.bremze();
        bicycleOne.bremze();
        bicycleOne.bremze();
        System.out.println("Velosipēda ātrums ir = " + bicycleOne.speed);


Zivs zivsViens = new Zivs();
zivsViens.zivsNosaukums = "Asaris";
zivsViens.irKupinata = true;
zivsViens.zivsIzmers = "Maza";
zivsViens.cenaParKg = 13.25;



zivsViens.printetPapilduInformaciju();

    Circle circleOne = new Circle(5.34);
    Circle circleTwo = new Circle();

    circleTwo.radiuss = 15.30;

        System.out.println("Radiuss rinkim viens ir: " + circleOne.laukums());
        System.out.println(circleTwo.laukums());
        System.out.println("Diametrs rinkim viens ir: " + circleOne.diametrs());
        System.out.println(circleTwo.diametrs());



    }
}
