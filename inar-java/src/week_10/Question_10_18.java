package week_10;

import java.math.BigInteger;

public class Question_10_18 {
    public static void main(String[] args) {
        String value = Long.MAX_VALUE + "";
        BigInteger bigInteger = new BigInteger(value);

        int counter = 0;
        while (counter != 5){
            if(isPrime(bigInteger)){
                System.out.println(bigInteger);
                counter++;
            }
            bigInteger = bigInteger.add(BigInteger.ONE);
        }
    }

    private static boolean isPrime(BigInteger bigInteger) {
        for (BigInteger i = new BigInteger("2"); i.compareTo(bigInteger.sqrt()) <= 0; i = i.add(BigInteger.ONE)) {
            if(bigInteger.mod(i).equals(new BigInteger("0"))){
                return false;
            }

        }
        return true;
    }


}
