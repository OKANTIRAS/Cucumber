package week_05;

public class Question_05_27 {
    public static void main(String[] args) {
        String leapYears = "";
        int counter = 0;
        System.out.println("All the leap years from 101 to 2100: ");
        for(int i = 101; i <= 2100; i++){
            if((i % 4 == 0) && (i % 100 != 0)){
                counter++;
                System.out.print(i + " ");
                if(counter % 8 == 0){
                    System.out.println();
                }
            }
        }
    }
}
