package week_13;

public class Question_13_10 {
    public static void main(String[] args) {
        Rectangle_10 rectangle1 = new Rectangle_10(5, 3);
        System.out.println("Rectangle1: " + rectangle1);
        Rectangle_10 rectangle2 = new Rectangle_10(6, 7);
        System.out.println("Rectangle2: " + rectangle2);
        Rectangle_10 rectangle3 = new Rectangle_10(8, 4);
        System.out.println("Rectangle3: " + rectangle3);
        System.out.println();
        System.out.println("Rectangle1 is " + (rectangle1.equals(rectangle2) ? "" : "not ") +
                "equal to rectangle2");
        System.out.println("Rectangle1 is " + (rectangle1.equals(rectangle3) ? "" : "not ") +
                "equal to rectangle3");

    }
}
