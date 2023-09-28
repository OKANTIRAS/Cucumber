package week_06;

public class Question_06_26 {
    public static void main(String[] args) {
        palindromAndPrimeNumbers();

    }

    public static void palindromAndPrimeNumbers() {
        String numbers = "";
        int count = 0;
        int number = 2;
        while (count < 100) {
            if (isPalindrom(number) && isPrime(number)) {

                if (count % 10 == 0) {
                    System.out.printf("\n%-10d", number);
                }else{
                    System.out.printf("%-10d", number);
                }
                count++;
            }
            number++;
        }

    }

    public static boolean isPalindrom(int number) {
        String strNumber = Integer.toString(number);
        int firstIndex = 0;
        int lastIndex = strNumber.length() - 1;
        for (int i = 0; i < strNumber.length(); i++) {
            if (strNumber.charAt(firstIndex) != strNumber.charAt(lastIndex)) {
                return false;
            }
            firstIndex++;
            lastIndex--;
        }
        return true;

    }

    public static boolean isPrime(int number) {
        boolean isPrime = true;
        for (int k = 2; k <= number / 2; k++) {
            if (number % k == 0) {
                isPrime = false;
            }
        }
        return isPrime;
    }
}
