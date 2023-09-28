package week_06;

public class Question_06_28 {
    public static void main(String[] args) {
        printMersenne();
    }
    public static void printMersenne(){
        int number = 2;
        int count = 0;
        System.out.println("p               2^p-1");
        System.out.println("---------------------------");
        while(count <= 31){
            if(isPrime(number)){
                if(isMersennePrime(number)){
                    System.out.printf("%-10d%d\n",number,getMersenne(number));
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
        }
        return true;
    }
    public static boolean isMersennePrime(int number){
        int mersenneNumber = getMersenne(number);
        if(isPrime(mersenneNumber)){
            return true;
        }else{
            return false;
        }
    }
    public static int getMersenne(int number){
        int calculatedNumber = (int) Math.pow(2, number) - 1;
        return calculatedNumber;
    }
}
