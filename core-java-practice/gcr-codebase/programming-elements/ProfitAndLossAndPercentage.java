public class ProfitAndLossAndPercentage {
    public static void main(String[] args) {
        double costPrice = 129; // input cost price
        double sellingPrice = 191; // input selling price
        if (sellingPrice > costPrice) {
            double profit = sellingPrice - costPrice;
            double profitPercent = (profit / costPrice) * 100; // calculate profit percentage
            System.out.println("profit is: "+ profit+ "  rs and Profit Percentage: " + profitPercent + "%");
        } else if (costPrice > sellingPrice) {
            double loss = costPrice - sellingPrice;
            double lossPercent = (loss / costPrice) * 100; // calculate loss percentage
            System.out.println("loss is: "+loss +" rs and Loss Percentage: " + lossPercent + "%");
        } else {
            System.out.println("No Profit No Loss");
        }
    }
    
}
