package week_14;

import java.util.*;

public class Question_14_15 {
    public static void main(String[] args) {
        ArrayList<Integer>list = createList();
        System.out.println(list);
        Map<Integer,Integer>numbers =createMap(list);
        System.out.println(numbers);
        ArrayList<Integer>missingNumbers = getMissingNumbers(numbers);
        System.out.print("Numbers missing from the Arraylist: " + missingNumbers);
    }

    public static ArrayList<Integer> getMissingNumbers(Map<Integer, Integer> numbers) {
        ArrayList<Integer>list =new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            if(numbers.get(i) == 0){
                list.add(i);
            }

        }
        return list;
    }

    public static ArrayList<Integer> createList(){
        Scanner input = new Scanner(System.in);
        ArrayList<Integer>list = new ArrayList<>();
        try{
            System.out.print("Enter the number of elements (n): ");
            int size = input.nextInt();
            System.out.print("Enter the elements of the ArrayList (each in the range [1,n]): ");
            for (int i = 0; i < size; i++) {
                int number = input.nextInt();
                list.add(number);
            }
        }catch (InputMismatchException e){
            System.out.println("Wrong input! ");
        }
        return list;
    }
    public static Map<Integer,Integer> createMap(ArrayList<Integer>list){
        Map<Integer,Integer>numbers = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
           if(list.get(i) == i){
               numbers.put(list.get(i),numbers.get(list.get(i))+ 1);
           }

        }
        return numbers;
    }

}
