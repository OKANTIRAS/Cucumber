package week_10;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Question_10_20 {
    public static void main(String[] args) {
        for (int i = 100; i <= 1000 ; i+= 100) {
            BigDecimal added = new BigDecimal(1);
            BigDecimal constantOne = new BigDecimal(1);
            for (int j = 1; j <= i ; j++) {
                BigDecimal multipication = new BigDecimal(1);
                for (int k = 1; k <= j; k++) {
                    multipication = multipication.multiply(new BigDecimal(k));
                }
                added = added.add(constantOne.divide(multipication,30, RoundingMode.HALF_UP));
            }
            System.out.println(added);
        }
    }
}
