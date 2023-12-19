package week_14;

import java.util.*;

public class Question_14_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = input.nextLine();
        Map<Character,Integer>map = new HashMap<>();

        for (int i = 0; i < text.length(); i++) {
            if(text.charAt(i) == ' '){
                continue;
            }
            if(!map.containsKey(text.charAt(i))){
                map.put(text.charAt(i),1);
            }
            else{
                map.put(text.charAt(i),(map.get(text.charAt(i)) + 1));
            }
            
        }
        for (int i = 0; i < text.length(); i++) {
            if(text.charAt(i) == ' '){
                continue;
            }
            if(map.get(text.charAt(i)) == 1){
                System.out.println("The first non-repeating character is '" + text.charAt(i) + "' : " +
                        (i + 1) + ". character of the string.");
                break;
            }

        }

    }
}
