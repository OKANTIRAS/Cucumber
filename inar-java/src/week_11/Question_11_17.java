package week_11;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class Question_11_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer m: ");
        int m = input.nextInt();
        ArrayList<Integer> integers = findFactors(m);
        int [] array = new int[m / 2];
        for (int i = 0; i < integers.size(); i++) {
            array[integers.get(i)]++;

        }
        int result=1;
        for (int i = 0; i <array.length ; i++) {
            if (array[i]%2==1){
                result*=i;
            }
        }
        System.out.println(result);


    }




    public static ArrayList<Integer> findFactors(int m) {
        ArrayList<Integer> result = new ArrayList<>();
        int realNumber = m;
        while (realNumber != 1) {
            for (int i = 2; i <= m / 2; i++) {
                if(realNumber % i == 0){
                    result.add(i);
                    realNumber = realNumber / i;
                    break;
                }



            }
        }


        return result;
    }
}
