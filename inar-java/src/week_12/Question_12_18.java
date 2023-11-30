package week_12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Question_12_18 {
    public static void main(String[] args) throws FileNotFoundException{
        if(args.length != 1){
            System.out.println("Wrong input! \n " +
                    "Usage : java Question_12_18.java sourceRootFile");
            System.exit(1);
        }
        ArrayList<File>directories = new ArrayList<>();
        String path = args[0];
        File file =new File(path);
        if(file.isDirectory()){
            directories.add(file);
        }else{
            System.out.println("It is not a directory");
            System.exit(2);
        }
        while(!directories.isEmpty()){
            File firstFile = directories.remove(0);
            File [] files = firstFile.listFiles();
            for (int i = 0; i < files.length; i++) {
                if(files[i].isDirectory()){
                    directories.add(files[i]);
                }else{
                    changePackageName(files[i],firstFile);
                }

            }
        }
    }
    public static void changePackageName(File file,File directory)throws FileNotFoundException {
        StringBuilder page = new StringBuilder("//package" + directory.getName() + " \n");

        Scanner input = new Scanner(file);
        while(input.hasNext()){
             page.append(input.nextLine()).append("\n");
        }
        PrintWriter output = new PrintWriter(file);
        output.print(page);
        output.close();
    }


}
