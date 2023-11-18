package week_10;

import java.math.BigInteger;

public class Question_10_19 {
    public static void main(String[] args) {
        BigInteger bigInteger = new BigInteger("2");

        for (int i = 2; i < 100; i++) {
            if (isPrime(i)) {
                bigInteger = BigInteger.TWO.pow(i);
                bigInteger = bigInteger.subtract(BigInteger.ONE);
                if (isPrime(bigInteger)) {
                    System.out.println(bigInteger);
                }
            }




        }
    }

    private static boolean isPrime(BigInteger bigInteger) {
        for (BigInteger i = new BigInteger("2"); i.compareTo(bigInteger.sqrt()) <= 0; i = i.add(BigInteger.ONE)) {
            if (bigInteger.mod(i).equals(new BigInteger("0"))) {
                return false;
            }

        }
        return true;
    }

    private static boolean isPrime(int i) {
        for (int j = 2; j <= Math.sqrt(i); j++) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }
}
