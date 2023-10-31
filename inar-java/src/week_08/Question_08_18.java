package week_08;

public class Question_08_18 {
    public static void main(String[] args) {
        int [][] m = {{1,2},{3,4},{5,6},{7,8},{9,10}};
        shuffle(m);
    }

    public static void shuffle(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            int random = (int) (Math.random() * 5);
            int[] tempt = m[i];
            m[i] = m[random];
            m[random] = tempt;

        }
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();

        }
    }

}
