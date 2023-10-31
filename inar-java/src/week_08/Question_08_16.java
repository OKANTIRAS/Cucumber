package week_08;

public class Question_08_16 {
    public static void main(String[] args) {
        int [][] array = {{4,2}, {1,7}, {4,5},{1,2},{1,1},{4,1}};
        sort(array);


    }

    public static void sort(int[][] array) {
        int [] closestNumber = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length ; j++) {
                if(array[i][0] < array[j][0]){
                    closestNumber = array[i];
                }

            }

        }
    }
}
