package week_12;

public class Question_12_01_WithoutException {
    public static void main(String[] args) {
        String number1 = args[0];
        String number2 = args[2];

        for (int i = 0; i < number1.length(); i++) {
            if(!Character.isDigit(number1.charAt(i))){
                System.out.println("Wrong input : " + number1);
                System.exit(1);
            }
        }
        for (int i = 0; i < number2.length(); i++) {
            if(!Character.isDigit(number2.charAt(i))){
                System.out.println("Wrong input : " + number2);
                System.exit(2);
            }
        }
        int num1 = Integer.parseInt(number1);
        int num2 = Integer.parseInt(number2);
        System.out.println(num1 + " " + args[1] + " " + num2 + " = " + (num1 + num2));

    }
}
