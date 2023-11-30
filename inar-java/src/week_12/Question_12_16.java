package week_12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Question_12_16 {
    public static void main(String[] args)throws FileNotFoundException {
        if(args.length != 4){
            System.exit(1);
        }
        File sourceFile = new File(args[0]);
        if(!sourceFile.exists()){
            System.exit(2);
        }
        File targetFile = new File(args[1]);
        if(targetFile .exists()){
            System.exit(3);
        }
        Scanner input = new Scanner(sourceFile);
        String str = "";
        while (input.hasNext()){
            str += input.nextLine() + "\n";
        }
        input.close();
        str = str.replaceAll(args[2],args[3]);
        PrintWriter output = new PrintWriter(targetFile);
        output.println(str);
        output.close();




    }
}
