package week_07;

public class Question_07_16 {
    public static void main(String[] args) {
        int [] randomGeneratedArray =generateRandomArray();
        int key = generateRandom();
        printExecutionTimeForLinear(randomGeneratedArray, key);
        java.util.Arrays.sort(randomGeneratedArray);
        printExecutionTimeForBinary(randomGeneratedArray, key);
    }

    public static void printExecutionTimeForBinary(int[] randomGeneratedArray, int key) {
        long startTime = System.nanoTime();
        int indexOfKeyWithBinary = binarySearch(randomGeneratedArray, key);
        long endTime = System.nanoTime();
        long executionTime = endTime - startTime;
        System.out.println("Execution time of invoking the binarySearch in milliseconds " + executionTime);
    }

    public static int binarySearch(int[] randomGeneratedArray, int key) {
        int low = 0;
        int high = randomGeneratedArray.length - 1;

        while (high >= low) {
            int mid = (low + high) / 2;
            if (key < randomGeneratedArray[mid]) {
                high = mid - 1;
            } else if (key == randomGeneratedArray[mid]) {
                return mid;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }


    public static void printExecutionTimeForLinear(int[] randomGeneratedArray, int key) {
        long startTime = System.nanoTime();
        int indexOfKey =linearSearch(randomGeneratedArray,key);
        long endTime = System.nanoTime();
        long executionTime = endTime - startTime;
        System.out.println("Execution time of invoking the linearSearch in milliseconds " + executionTime);
    }

    public static int linearSearch(int[] randomGeneratedArray, int key) {
        for (int i = 0; i < randomGeneratedArray.length; i++) {
            if (randomGeneratedArray[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static int generateRandom() {
        return (int) (Math.random() * 100000);

    }

    public static int[] generateRandomArray() {
        int [] numbers = new int[100000];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }
        numbers = shuffleArray(numbers);
        return numbers;
    }

    public static int[] shuffleArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            int randomNumber = (int) (Math.random() * 100000);
            int tempt = numbers[i];
            numbers[i] = numbers[randomNumber];
            numbers[randomNumber] = tempt;
        }
        return numbers;
    }




}
