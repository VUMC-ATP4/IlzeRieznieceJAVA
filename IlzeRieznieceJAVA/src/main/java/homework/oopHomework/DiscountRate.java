package homework.oopHomework;

public class DiscountRate {
    private static double serviceDiscountPremium = 0.2;
    private static double serviceDiscountGold = 0.15;
    private static double serviceDiscountSilver = 0.1;
    private static double productDiscountPremium = 0.1;
    private static double productDiscountGold = 0.1;
    private static double productDiscountSilver = 0.1;

    public double getServiceDiscountPremium() {
        return serviceDiscountPremium;
    }

    public double getServiceDiscountGold() {
        return serviceDiscountGold;
    }

    public double getServiceDiscountSilver() {
        return serviceDiscountSilver;
    }

    public double getProductDiscountPremium() {
        return productDiscountPremium;
    }

    public double getProductDiscountGold() {
        return productDiscountGold;
    }

    public double getProductDiscountSilver() {
        return productDiscountSilver;
    }
}
