public class ProfitAndLossAndPercentage {
    public static void main(String[] args) {
        double cp = 129; // input cost price
        double sp = 191; // input selling price
        if (sp > cp) {
            double profit = sp - cp;
            double profitpercent = (profit / cp) * 100; // calculate profit percentage
            System.out.println("profit is: "+ profit+ "  rs and Profit Percentage: " + profitpercent + "%");
        } else if (cp > sp) {
            double loss = cp - sp;
            double losspercent = (loss / cp) * 100; // calculate loss percentage
            System.out.println("loss is: "+loss +" rs and Loss Percentage: " + losspercent + "%");
        } else {
            System.out.println("No Profit No Loss");
        }
    }
    
}
