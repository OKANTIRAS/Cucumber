package week_12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Question_12_20 {
    public static void main(String[] args) throws FileNotFoundException {
        if (args.length != 1) {
            System.out.println("Wrong input");
            System.exit(1);
        }
        String path = args[0];
        File file = new File(path);
        ArrayList<File> directories = new ArrayList<>();
        if (file.isDirectory()) {
            directories.add(file);
        } else {
            System.exit(2);
        }
        while (!directories.isEmpty()) {
            File firstFile = directories.remove(0);
            File[] files = firstFile.listFiles();
            for (int i = 0; i < files.length; i++) {
                if (files[i].isDirectory()) {
                    directories.add(files[i]);
                } else {
                    removeStatement(files[i], firstFile);
                }

            }
        }


    }

    private static void removeStatement(File file, File firstFile) throws FileNotFoundException {
        Scanner input = new Scanner(file);
        String page = "";
        while (input.hasNext()) {
             page += input.nextLine() + "\n";
        }
        page.replaceAll("//package " + firstFile.getName() + " \n","");
        PrintWriter output = new PrintWriter(file);
        output.print(page);
        output.close();

    }
}
