package week_06;

public class Question_06_29 {
    public static void main(String[] args) {
        printTwinPrimes();
    }
    public static void printTwinPrimes(){
        for(int i = 2; i <= 1000; i++){
            if(isPrime(i) && isPrime(i + 2)){
                System.out.printf("(%d,%d)\n",i,(i+2));
            }
        }
    }
    public static boolean isPrime(int number){
        for(int i = 2; i <= number / 2; i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
}
