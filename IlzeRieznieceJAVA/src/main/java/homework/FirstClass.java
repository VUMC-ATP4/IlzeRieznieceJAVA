package homework;

public class FirstClass {
    public static void main(String[] args) {
        System.out.println("This is a homework");

        String countryName = "Chile";
        int population = 17574003;
        double areaValue = 756096.3;
        String capitalCity = "Santiago";
        String officialLanguage = "Spanish";
        boolean isEuropeanUnion = false;
        char currency = '$';

        System.out.println("Country name is" + " " + countryName);
        System.out.println(countryName + "'s capital city is" + " " + capitalCity);
        System.out.println("Official language is" + " " + officialLanguage);
        System.out.println("Is" + " " + countryName + " " + "in EU?" + " " + isEuropeanUnion);
        System.out.println(countryName + "'s population is" + " " + (double)population);
        System.out.println(countryName + "'s area is" + " " + (int)areaValue + " " + "km2");
        System.out.println("For every resident is available" + " " + areaValue/population + " " + "km2" );


} }