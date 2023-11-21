package week_11;

import week_10.Circle2D;
import week_10.Loan;

import java.util.ArrayList;
import java.util.Date;


public class Question_11_06 {
    public static void main(String[] args) {
        ArrayList<Object> objects = new ArrayList<>();
        Loan loan = new Loan();
        Date date = new Date();
        String str = new String("Inar Academy");
        Circle2D circle = new Circle2D();

        objects.add(loan);
        objects.add(date);
        objects.add(str);
        objects.add(circle);

        for (int i = 0; i < objects.size(); i++) {
            System.out.println(objects.get(i).toString());
            System.out.print("-------------------------\n");

        }
    }
}
