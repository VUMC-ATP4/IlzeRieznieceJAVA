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
        int priceBeef = 5590;
        int priceCheese = 1990;
        int priceWater = 1000;
        int pocketMoney = 20000;

        System.out.println("Country name is" + " " + countryName);
        System.out.println(countryName + "'s capital city is" + " " + capitalCity);

       String concatTeikums = "Country is" + " " + countryName + ", capital city is" + " " + capitalCity + " " + ", officila language is" + " " + officialLanguage;
       String teikums = String.format("Country is %s. The capital city is %s. The official language is %s.",countryName,capitalCity,officialLanguage);

        System.out.println(concatTeikums);
        System.out.println(teikums);

        System.out.println("Official language is" + " " + officialLanguage);
        System.out.println("The official currency is Chilean peso and it's symbol is" + " " + currency);
        System.out.println("Is" + " " + countryName + " " + "in EU?" + " " + isEuropeanUnion);
        System.out.println(countryName + "'s population is" + " " + population + " " + "(" + (double)population + ")");
        System.out.println(countryName + "'s area is" + " " + (int)areaValue + " " + "km2");
        System.out.println("For every resident is available" + " " + areaValue/population + " " + "km2");
        System.out.println("For every resident is available" + " " + String.format("%.2f", (areaValue/population)) + " " + "km2");
        System.out.println("To buy 1 kg beef, 1 kg cheese and liter water is needed" + " " + (priceBeef+priceCheese+priceWater) + currency);
        System.out.println("If I have" + " " + pocketMoney + currency + " " + "and I buy 1 kg cheese, 1 kg beef and liter a water, I still left" + " " + (pocketMoney-(priceBeef+priceCheese+priceWater)) + currency);

        System.out.println("Some random numbers:");
        //balance - if I divide something and what is the balance
        System.out.println(priceBeef%priceCheese);
        System.out.println(priceBeef-priceCheese);
        System.out.println(priceCheese+priceWater);
        System.out.println(priceWater*priceBeef);
        System.out.println((int)priceBeef/priceCheese);

} }