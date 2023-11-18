package week_10;

import java.math.BigInteger;

public class Question_10_16 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(1);
        for (int i = 0; i < 49; i++) {
            stringBuilder.append(0);
        }

        BigInteger bigInteger = new BigInteger(stringBuilder.toString());
        int counter = 0;
        while (counter != 10) {
            BigInteger bigInteger2 = new BigInteger("2");
            BigInteger bigInteger3 = new BigInteger("3");
            if (bigInteger.mod(bigInteger2).equals(new BigInteger("0")) ||
                    bigInteger.mod(bigInteger3).equals(new BigInteger("0"))) {

                System.out.println(bigInteger);
                counter++;
            }
            bigInteger = bigInteger.add(BigInteger.ONE);


    }


}
}
