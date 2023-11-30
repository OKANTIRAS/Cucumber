package week_12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Question_12_31 {
    public static void main(String[] args)throws FileNotFoundException {
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s\n"
                , "Year", "Rank1", "Rank2", "Rank3", "Rank4", "Rank5", "Rank1", "Rank2", "Rank3", "Rank4", "Rank5");
        System.out.print("-----------------------------------------------------------------------------" +
                "-------------------------------------------------------------\n");
        for (int i = 2010; i >= 2001 ; i--) {
            File file = new File("C:\\Users\\OKAN\\Desktop\\workspace\\inar-java\\src\\week_12" +
                    "\\babynameranking" + i + ".txt");
            Scanner input = new Scanner(file);
            String[] names = new String[10];
            while (input.hasNext()) {
                for (int j = 0; j < 5; j++) {
                    String line = input.nextLine();
                    String[] parts = line.split("[\\n\\s]+");
                    names[j] = parts[3];
                }
                for (int j = 5; j < 10; j++) {
                    String line = input.nextLine();
                    String[] parts = line.split("[\\n\\s]+");
                    names[j] = parts[1];
                }
            }
            System.out.printf("%-10d",i);
            System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s\n",
            names[0], names[1], names[2], names[3], names[4], names[5], names[6], names[7], names[8], names[9]);
            System.out.println();

        }
    }
}
