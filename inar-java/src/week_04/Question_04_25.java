package week_04;

public class Question_04_25 {
    public static void main(String[] args) {
        System.out.print("Generated plate number: ");
        System.out.print((char) (Math.random() * ('Z' - 'A') +'A'));
        System.out.print((char) (Math.random() * ('Z' - 'A') +'A'));
        System.out.print((char) (Math.random() * ('Z' - 'A') +'A'));
        System.out.print((int) (Math.random() * 10));
        System.out.print((int) (Math.random() * 10));
        System.out.print((int) (Math.random() * 10));
        System.out.print((int) (Math.random() * 10));
    }
}
