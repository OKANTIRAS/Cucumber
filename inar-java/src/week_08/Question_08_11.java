package week_08;

public class Question_08_11 {
    public static void main(String[] args) {
        int[][] headsTails = fillArray();

    }

    public static int[][] fillArray() {
        int[][] headsTails = new int[512][9];
        for (int i = 0; i < headsTails.length; i++) {
            for (int j = 0; j < headsTails[i].length; j++) {
                headsTails[i][j] = (int) (Math.random() * 2);
            }
            for (int j = 0; j < i; j++) {
                if (java.util.Arrays.equals(headsTails[j], headsTails[i])) {
                    i--;
                    break;
                }

            }

        }
        return headsTails;

    }
}
