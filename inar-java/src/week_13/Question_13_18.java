package week_13;

import java.math.BigInteger;

public class Question_13_18 {
    public static void main(String[] args) {

        Rational_15 result = new Rational_15(new BigInteger("1"),new BigInteger("2"));
        for (int i = 0; i < 100; i++) {
            BigInteger numerator = new BigInteger(String.valueOf(i));
            BigInteger denominator = new BigInteger(String.valueOf(i + 1));
            Rational_15 currentRational = new Rational_15(numerator,denominator);
            result = result.add(currentRational);

        }
        System.out.println(result);

    }
}
