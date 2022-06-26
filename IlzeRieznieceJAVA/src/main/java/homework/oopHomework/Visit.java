package homework.oopHomework;

import java.util.Date;

public class Visit {
    private String customer;
    private Date date;
    private double serviceExpense;
    private double productExpense;
    private double totalExpenses;

   // public Visit (String customer, Date date) {
      //  Customer = customer;
       // this.date = date;
   // }
    public double getServiceExpense() {
        return serviceExpense;
}
    public double getProductExpense() {
        return productExpense;
    }
    public void setServiceExpense (double serviceExpense) {
        this.serviceExpense = serviceExpense;
    }
    public void setProductExpense (double productExpense) {
        this.productExpense = productExpense;
    }

    public double getTotalExpenses () {
        return totalExpenses;
    }

    @Override
    public String toString() {
        return "Visit{" +
                "customer='" + customer + '\'' +
                ", date=" + date +
                ", serviceExpense=" + serviceExpense +
                ", productExpense=" + productExpense +
                ", totalExpenses=" + totalExpenses +
                '}';
    }
}
