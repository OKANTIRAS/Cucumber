package week_05;

public class Question_05_05 {
    public static void main(String[] args) {
        double pounds = 0;
        double kilograms = 0;
        System.out.println("Kilograms          Pounds             |            Pounds           Kilograms");
        for(int i = 1,j = 20; i < 200 && j < 520; i +=2,j += 5 ){
            pounds = i * 2.2;
            kilograms = j / 2.2;
            System.out.printf("%-10d         %-10.1f         |             %-10d      %-10" +
                    ".2f\n",i,pounds,j,kilograms);

        }
    }
}
