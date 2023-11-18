package week_10;

import java.math.BigInteger;

public class Question_10_17 {
    public static void main(String[] args) {
        String maxLongValue = Long.MAX_VALUE + "";
        BigInteger bigInteger = new BigInteger(maxLongValue);
        BigInteger bigInteger2 = bigInteger.sqrt();
        for (int i = 0; i < 10; i++) {
            bigInteger2 = bigInteger2.add(BigInteger.ONE);
            System.out.println(bigInteger2.pow(2));
        }
       
       


    }
}
