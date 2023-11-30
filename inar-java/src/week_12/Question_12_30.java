package week_12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Question_12_30 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = input.nextInt();
        String path = "C:\\Users\\OKAN\\Desktop\\workspace\\inar-java\\src\\week_12" + "\\babynameranking" +
                year + ".txt";
        System.out.print("Enter the gender: ");
        char gender = input.next().charAt(0);
        System.out.print("Enter the name: ");
        String name = input.nextLine();

        File file = new File(path);
        Scanner scn = new Scanner(file);
        while (input.hasNext()){
            String line = input.nextLine() ;
            String [] parts = line.split("[\\n\\s]+");
            if(gender == 'M' && parts[1].equals(name)){
                System.out.println(name + "is ranked " + "#" + parts[0] + " in year" + year);
                break;
            }else if(gender == 'F' && parts[3].equals(name)){
                System.out.println(name + "is ranked " + "#" + parts[0] + " in year" + year);
                break;
            }

        }


    }
}
