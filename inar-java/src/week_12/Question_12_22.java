package week_12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Question_12_22 {
    public static void main(String[] args) throws FileNotFoundException {
        if (args.length != 3) {
            System.out.println("Wrong input");
            System.exit(1);
        }
        ArrayList<File> directories = new ArrayList<>();
        File file = new File(args[0]);
        String oldWord = args[1];
        String newWord = args[2];
        if (file.isDirectory()) {
            directories.add(file);
        } else {
            System.exit(2);
        }
        while (!directories.isEmpty()) {
            File currentFile = directories.remove(0);
            File[] files = currentFile.listFiles();
            for (int i = 0; i < files.length; i++) {
                if (files[i].isDirectory()) {
                    directories.add(files[i]);
                } else {
                    changeStatement(files[i], oldWord, newWord);
                }

            }
        }
    }

    public static void changeStatement(File file, String oldWord, String newWord) throws FileNotFoundException {
        Scanner input = new Scanner(file);
        String page = "";
        while (input.hasNext()) {
            page += input.nextLine() + " \n";
        }

        page = page.replaceAll(oldWord, newWord);
        PrintWriter output = new PrintWriter(file);
        output.println(page);
        output.close();
    }
}
