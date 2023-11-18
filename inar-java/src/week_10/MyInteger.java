package week_10;

public class MyInteger {
    private int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public static boolean isEven(int value) {
        return (value % 2 == 0);
    }

    public static boolean isOdd(int value) {
        return value % 2 != 0;
    }

    public static boolean isPrime(int value) {
        boolean isPrime = true;
        for (int i = 2; i < value / 2; i++) {
            if (value % i == 0) {
                isPrime = false;
            } else {
                isPrime = true;
            }
        }
        return isPrime;
    }

    public int getValue() {
        return value;
    }

    public static boolean isEven(MyInteger myinteger) {
        return isEven(myinteger.getValue());
    }
    public static boolean isOdd(MyInteger myinteger){
        return isOdd(myinteger.getValue());
    }
    public static boolean isPrime(MyInteger myinteger){
        return isPrime(myinteger.getValue());
    }
    public boolean equals (int number){
        return value == number;
    }
    public boolean equals (MyInteger myInteger){
        return value == myInteger.getValue();
    }
    public static int parseInt(char[] array){
        String number = " ";
        for (int i = 0; i < array.length; i++) {
            number += array[i];
        }
        return Integer.parseInt(number);
    }
    public static int parseInt(String number) {
        return Integer.parseInt(number);
    }
    public boolean isEven() {
        return isEven(value);
    }

    public boolean isOdd() {
        return isOdd(value);
    }

    public boolean isPrime() {
        return isPrime(value);
    }

}
