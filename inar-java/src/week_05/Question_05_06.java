package week_05;

public class Question_05_06 {
    public static void main(String[] args) {
        System.out.println("Miles       Kilometers           |             Kilometers     Miles");
        int kilometers = 0;
        double miles = 0;

        for(int i = 1, j = 20; i < 11 && j < 70; i++, j+=5){
            kilometers = i * 1609;
            miles = (j / 1.609);
            System.out.printf("%-7d     %-10d           |     %10d            %.3f\n",i,kilometers,j,miles);

        }
    }
}
