package week_09;

public class Question_09_06 {
    public static void main(String[] args) {
        int [] numbers = getNumbers();
        shuffle(numbers);
        testSortQuality(numbers);
    }

    public static void testSortQuality(int[] numbers) {
        StopWatch stopWatch = new StopWatch();
        sort(numbers);
        stopWatch.stop();
        System.out.println("The execution time of sorting 100,000 numbers using selection sort :"
                + stopWatch.elapsedTime() + " milliseconds");
    }

    public static void sort(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
           int minumumNumber = numbers[i];
           int minumumIndex = i;
            for (int j = i + 1; j <numbers.length -1 ; j++) {
                if(numbers[j] < minumumNumber){
                    minumumNumber = numbers[j];
                    minumumIndex = j;
                }
            }
            if(minumumIndex != i){
                numbers[minumumIndex] = numbers[i];
                numbers[i] = minumumNumber;
            }

        }
    }

    public static void shuffle(int[] numbers) {
        int tempt ;
        for (int i = 0; i < numbers.length; i++) {
            int randomNumber = (int) (Math.random() * 100000);
            tempt = numbers[i];
            numbers[i] = numbers[randomNumber];
            numbers[randomNumber] = tempt;
        }
    }

    public static int[] getNumbers() {
        int [] numbers = new int[100000];
        return numbers;
    }

}
