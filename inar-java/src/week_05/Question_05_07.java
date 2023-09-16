package week_05;

public class Question_05_07 {
    public static void main(String[] args) {
        int tuition= 10000;
        int cost10 = 0;
        int cost14 = 0;
        int cost = 0;
        int costFourYears = 0 ;
        int i;
        for(i = 0; i < 14; i++) {
            tuition += tuition * 0.05;
            cost += tuition;

            if(i == 9) {
                cost10 = cost;
                System.out.println("Tuition in ten years:   $" + tuition);
            }
            if(i == 13){
                cost14 = cost;
            }
            costFourYears = (cost14 - cost10);
        }

        System.out.println("Total cost for four years ' worth of tuition after tenth year:   $" + costFourYears);


    }
}
