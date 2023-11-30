package week_12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Question_12_12 {
    public static void main(String[] args) throws FileNotFoundException {
        String fileName = args[0];
        File file = new File(fileName);
        if(!file.exists()){
            System.exit(1);
        }

        Scanner input = new Scanner(file);
        String page = "";
        while (input.hasNext()) {
            page += input.nextLine() + " \n";
        }
        page = page.replaceAll("\\s*\\{", " {");

        PrintWriter output = new PrintWriter(file);
        output.print(page);
        output.close();

    }
}
