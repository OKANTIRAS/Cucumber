package week_12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Question_12_11 {
    public static void main(String[] args) throws FileNotFoundException {
        if(args.length != 2){
            System.out.println("Wrong input! \n" +
                    "Usage : java Question_12_11.java word fileName");
            System.exit(1);
        }
        StringBuilder page = new StringBuilder();
        String word = args[0];
        String pathOfFile = args[1];

        File file = new File(pathOfFile);
        Scanner input = new Scanner(file);

        while (input.hasNext()){
            String line = input.nextLine();
            if(line.contains(word)){
                line = line.replace(word,"");
            }
            page.append(line).append("\n");
        }
        PrintWriter output = new PrintWriter(file);
        output.print(page.toString());
        output.close();

    }
}
