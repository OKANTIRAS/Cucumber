package week_05;

public class Question_05_04 {
    public static void main(String[] args) {
        int kilometers;
        System.out.println("  Miles      Kilometers");
        for(int i = 1; i < 11; i++){
            kilometers =  i * 1609;
            System.out.printf("%-3d          %4d\n",i,kilometers );

        }
    }
}
