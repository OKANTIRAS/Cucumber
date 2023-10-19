package week_08;

public class Question_08_10 {
    public static void main(String[] args) {
        int[][] numbers = new int[4][4];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                numbers[i][j] = (int) (Math.random() * 2);
                System.out.print(numbers[i][j]);
            }
            System.out.println();
        }

        findLargestRow(numbers);
        findLargestColumn(numbers);
    }

    public static void findLargestColumn(int[][] numbers) {
        int maxIndex = 0;
        int maxCount = 0;
        int count = 0;
        for (int i = 0; i < 4; i++) {
            count = 0;
            for (int j = 0; j < 4; j++) {
                if (numbers[j][i] == 1) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                maxIndex = i;
            }
        }
        System.out.println("The largest column index: " + maxIndex);

    }

    public static void findLargestRow(int[][] numbers) {
        int maxIndex = 0;
        int maxCount = 0;
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            count = 0;
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] == 1) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                maxIndex = i;
            }
        }
        System.out.println("The largest row index: " + maxIndex);
    }
}
