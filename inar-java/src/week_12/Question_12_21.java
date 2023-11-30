package week_12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Question_12_21 {
    public static void main(String[] args)throws FileNotFoundException {
        String path = "C:\\Users\\OKAN\\Desktop\\workspace\\inar-java\\src\\week_12\\Integers.txt";
        File file = new File(path);
        Scanner input = new Scanner(file);
        String lines ="";
        while (input.hasNext()){
            lines += input.nextLine() +" \n";
        }
        String [] numbers = lines.split("[\\n\\s]+");
        int [] array = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            array[i] = Integer.parseInt(numbers[i]);
        }
        Arrays.sort(array);
        PrintWriter output = new PrintWriter(file);
        output.println(Arrays.toString(array));
        output.close();
    }


}
