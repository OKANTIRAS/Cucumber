package week_12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

public class Question_12_15 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\OKAN\\Desktop\\workspace\\inar-java\\src\\week_12\\Integers.txt");

        ArrayList<Integer>integers = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            Integer numb = (int) (Math.random() * 100);
            integers.add(numb);
        }
        String numbers = "";
        for (int i = 0; i < integers.size(); i++) {
            numbers += integers.get(i) + " ";

        }
        System.out.println(numbers);
        PrintWriter output = new PrintWriter(file);
        output.print(numbers);
        output.close();
        Scanner input = new Scanner(file);
        String irregularNumbers = "";
        while (input.hasNext()){
            irregularNumbers += input.nextLine();

        }
        String [] unsortedArray = irregularNumbers.split("[\\n\\s]+");
        int [] array = new int[unsortedArray.length];
        for (int i = 0; i < array.length; i++) {
            int numb = Integer.parseInt(unsortedArray[i]);
            array[i] = numb;
        }
        Arrays.sort(array);
        String result = "";
        for (int i = 0; i < array.length; i++) {
            result += array[i] + " ";

        }
        PrintWriter output1 = new PrintWriter(file);
        output1.print(result);
        output1.close();


    }
}