package week_12;

public class Question_12_01_WithException {
    public static void main(String[] args) {
        int a=0;
        int b=0;
        try {
            a = Integer.parseInt(args[0]);

        } catch (NumberFormatException ex) {
            System.out.println("Wrong Input: " + args[0]);
            System.exit(2);
        }
        try {
            b = Integer.parseInt(args[2]);
        } catch (NumberFormatException ex) {
            System.out.println("Wrong Input: " + args[2]);
            System.exit(1);
        }
        System.out.println(a + " + " + b + " = " + (a + b));

    }
}
