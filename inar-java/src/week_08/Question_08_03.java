package week_08;

public class Question_08_03 {
    public static void main(String[] args) {
        char[][] scores = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};

        char [] key = {'D','B','D','C','C','D','A','E','A','D'};
        displayresult(scores,key);
    }

    public static void displayresult(char[][] scores, char [] key) {
        int correctCount = 0;
        for (int i = 0; i < scores.length; i++) {
            correctCount = 0;
            for (int j = 0; j < scores[i].length; j++) {
                if(scores[i][j] == key[j]){
                    correctCount++;
                }
            }
            System.out.println("Student " + i + "'s correct count is " + correctCount);

        }
    }
}
