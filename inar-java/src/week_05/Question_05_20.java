package week_05;

public class Question_05_20 {
    public static void main(String[] args) {
        String primeNumbers = "";
        int counter = 0;
        boolean isPrime = true;
        int number = 2;

        System.out.println("The prime numbers between 2 and 1000, inclusive are: ");

        while (number <= 1000) {
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;

                } else {
                    isPrime = true;

                }
                if (isPrime) {
                    primeNumbers += number + " ";
                    counter++;
                    if (counter % 8 == 0) {
                        primeNumbers += "\n";
                    }
                }number++;
            }
            System.out.println(primeNumbers);


        }
    }
}