package week_12;

import java.io.File;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Question_12_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter directory name: ");
        String diractoryPath = "C:\\Users\\OKAN\\Desktop\\workspace\\inar-java\\src\\week_12\\" + input.nextLine();

        File directory = new File(diractoryPath);

        if (!directory.exists()) {
            boolean isCreated = directory.mkdir();
            if (isCreated) {
                System.out.println("Directory created successfully");
            } else {
                System.out.println("Directory couldn't be created");
            }
        } else {
            System.out.println("Directory already exists");
        }
    }
}
