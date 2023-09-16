package week_05;

public class Question_05_43 {
    public static void main(String[] args) {
        int count = 0;
        for( int i = 1; i <= 7; i++){
            for( int k = i + 1; k <= 7; k++){
                System.out.println(i + " " + k );
                count++;
            }
        }
        System.out.println("The total number of all combinations is " + count);
    }
}
