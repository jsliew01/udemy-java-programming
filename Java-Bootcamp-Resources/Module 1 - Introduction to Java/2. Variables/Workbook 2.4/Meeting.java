public class Meeting {
    public static void main(String[] args) {
        double sales = 24309.65; 
        double profit = 18562.18; 
        double refunds = 688.78; 
        double shipping = 1233.57; 

        int roundedSales = (int)sales;
        int roundedProfit = (int)profit;
        int roundedRefund = (int)refunds;
        int roundedShipping = (int)shipping;

        System.out.println("This month, we made $" + roundedSales + " in sales");
        System.out.println("Factoring in costs, we made $" + roundedProfit + " in profit");
        System.out.println("The refunds are at a low $" + roundedRefund + ". This is a good sign!");
        System.out.println("Shipping costs were high. We paid $" + roundedShipping + " in shipping");


    }
}