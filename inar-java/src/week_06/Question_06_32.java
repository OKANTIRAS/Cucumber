package week_06;

public class Question_06_32 {
    public static void main(String[] args) {
        playCrabs();

    }

    public static void playCrabs() {
        int count = 0;
        for (int i = 1; i <= 10000; i++) {


            int firstDice = rollDice();
            int secondDice = rollDice();
            int sum = firstDice + secondDice;

            if (sum == 7 || sum == 11) {
                System.out.printf("You rolled %d + %d = %d\n", firstDice, secondDice, sum);
                System.out.println("You win");
                count++;
            } else if (sum == 2 || sum == 3 || sum == 12) {
                System.out.printf("You rolled %d + %d = %d\n", firstDice, secondDice, sum);
                System.out.println("You lost");
            } else {
                System.out.printf("You rolled %d + %d = %d\n", firstDice, secondDice, sum);
                System.out.println("point is " + sum);
            }
            while (true) {
                firstDice = rollDice();
                secondDice = rollDice();
                int sum2 = firstDice + secondDice;
                System.out.printf("You rolled %d + %d = %d\n", firstDice, secondDice, sum2);

                if (sum2 == 7) {
                    System.out.println("You lost");
                    break;
                } else if (sum2 == sum) {
                    System.out.println("You win");
                    count++;
                    break;
                } else {
                    System.out.println("The point is " + sum2);
                }
            }
        }
        System.out.println("Number of winning games:  " + count);

    }

    public static int rollDice() {
        int numberOfDice = (int) (Math.random() * 6) + 1;
        return numberOfDice;


    }

}