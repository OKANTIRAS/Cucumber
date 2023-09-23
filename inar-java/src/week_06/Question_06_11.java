package week_06;

public class Question_06_11 {
    public static void main(String[] args) {
        System.out.println("Sales Amount        Commission");
        System.out.println("------------------------------");

        for(double salesAmount = 10000; salesAmount <= 100000; salesAmount += 5000){
            System.out.printf("%-18.0f%8.1f\n",salesAmount,computeCommission(salesAmount));
        }
    }
    public static double computeCommission(double salesAmount){
        double commission = 0;
        if(salesAmount <= 5000){
             commission = salesAmount * 8 /100;
        }else if(5000 < salesAmount && salesAmount <= 10000){
            commission = (5000 * 8 / 100) + (salesAmount - 5000) * 0.1;
        }else{
            commission =(5000 * 8 / 100) +  5000 * 0.1 + (salesAmount - 10000) * 12 /100;
        }
        return commission;
    }
}
