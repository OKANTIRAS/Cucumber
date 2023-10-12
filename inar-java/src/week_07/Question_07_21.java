package week_07;

import java.util.Arrays;
import java.util.Scanner;

public class Question_07_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of balls to drop: ");
        int numberOfBalls = input.nextInt();
        System.out.println("Enter the number of slots in the bean machine: ");
        int numberOfSlots = input.nextInt();

        String [] wayOfBalls = new String[numberOfBalls];
        for (int i = 0; i < wayOfBalls.length; i++) {
            wayOfBalls[i] = dropTheBalls(numberOfSlots);
            System.out.println(wayOfBalls[i]);

        }
        int [] slotArray = fillTheSlotArray(wayOfBalls,numberOfSlots);
        System.out.println(Arrays.toString(slotArray));
        drawTheMachine(slotArray,numberOfBalls);

    }

    public static void drawTheMachine(int[] slotArray, int numberOfBalls) {
        for (int i = numberOfBalls; i > 0 ; i--) {
            for (int j = 0; j < slotArray.length; j++) {
                if(slotArray[j] >= i){
                    System.out.print("0");
                }else{
                    System.out.print(" ");
                }

            }
            System.out.println();

        }

    }

    private static int[] fillTheSlotArray(String[] wayOfBalls, int numberOfSlots) {
        int [] slotArray = new int[numberOfSlots];
        for (int i = 0; i < wayOfBalls.length; i++) {
            int index = 0;
            for (int j = 0; j < wayOfBalls[i].length(); j++) {
                if(wayOfBalls[i].charAt(j) == 'R'){
                    index++;
                }

            }
            slotArray[index] ++;

        }
        return slotArray;
    }

    private static String dropTheBalls(int numberOfSlots) {
        String dropping = "";
        for (int i = 0; i < numberOfSlots - 1; i++) {
            if(((int) (Math.random() * 2)) == 0){
                dropping += "R";
            }else{
                dropping += "L";
            }

        }
        return dropping;
    }


}
