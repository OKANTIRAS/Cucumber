package week_06;

public class Question_06_27 {
    public static void main(String[] args) {

        printEmirpNumbers();

    }
    public static void printEmirpNumbers(){
        int count = 0;
        int number = 10;
        while(count < 100){
            if(isPrime(number) && isPrime(reverse(number))){
                if(count % 10 == 0){
                    System.out.printf("\n %-7d",number);
                    count++;
                }else{
                    System.out.printf("%-7d",number);
                    count++;

                }
            }
            number++;
        }
    }
    public static boolean isPrime(int number){
        for(int i = 2; i <= number / 2; i++){
            if(number % i == 0){
                return false;
            }

        }return true;
    }
    public static int reverse(int number){
        String strNumber = Integer.toString(number);
        String newString = "";
        for(int i = strNumber.length() -1; i >= 0; i--){
            newString += strNumber.charAt(i);

        }
        if(strNumber.equals(newString)){
            return 4;
        }
        int reverseNumber = Integer.parseInt(newString);
        return reverseNumber;
    }
}
