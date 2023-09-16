package week_05;

public class Question_05_03 {
    public static void main(String[] args) {
        double pounds = 0;
        System.out.println("  Kilograms        Pounds");

        for(int i = 1; i < 200; i += 2){
            pounds = i * 2.2;
            System.out.printf("%-3d               %5.1f\n",i,pounds);

        }

    }
}
