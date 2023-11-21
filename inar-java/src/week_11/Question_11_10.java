package week_11;

import java.util.Collections;
import java.util.Scanner;

public class Question_11_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter five Strings: ");
        MyStack myStack = new MyStack();
        myStack.add(input.next());
        myStack.add(input.next());
        myStack.add(input.next());
        myStack.add(input.next());
        myStack.add(input.next());
        System.out.println(myStack);
        System.out.println("Displaying them in reverse order ..");
        Collections.reverse(myStack);
        System.out.println(myStack);

    }

}
