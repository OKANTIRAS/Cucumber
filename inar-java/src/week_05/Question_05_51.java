package week_05;

import java.util.Scanner;

public class Question_05_51 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String text1 = input.nextLine();

        System.out.println("Enter the second string: ");
        String text2 = input.nextLine();
        String newText = "";

        for(int i = 0 , k = 0; i <= text1.length() -1 && k <= text2.length() -1; i++, k++){
            if(text1.charAt(i) == text2.charAt(k)){
                newText += text1.charAt(i) + "";
            }else if (i != k){
                System.out.printf("%s and %s have no comman prefix",text1,text2);
            }else{
                break;
            }

        }
        System.out.println("The common prefix is " + newText);

    }
}
