package week_05;

import java.util.Scanner;

public class Question_05_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int numberOfStudents = input.nextInt();
        input.nextLine();
        System.out.println("Enter each student's name and score: ");
        int maxScore = 0;
        String maxName = "";

        int secondScore = 0;
        String secondName = "";

        for(int i = 1; i <= numberOfStudents; i++){
            System.out.println("Student: " + i );
            System.out.print("  Name: ");
            String name = input.nextLine();
            System.out.print("  Score: ");
            int score = input.nextInt();
            input.nextLine();

            if(maxScore < score){
                maxScore = score;
                maxName = name;
            }do{
                secondScore = score;
                secondName = name;
            }while((secondScore < score) && (secondScore != maxScore));
        }
        System.out.println("The highest scoring student: " + maxName);
        System.out.println("The Second highest scoring student: " + secondName);
    }
}
