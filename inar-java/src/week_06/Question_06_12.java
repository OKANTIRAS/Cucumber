package week_06;

public class Question_06_12 {
    public static void main(String[] args) {
        printChars('1','Z',10);

    }
    public static void printChars(char ch1,char ch2,int numberPerLine){
        int counter = 0;
        for(int i = ch1; ch1 <= ch2; ch1++){
            System.out.print((char)ch1 + " ");
            counter++;
            if(counter % numberPerLine == 0){
                System.out.println();
            }

        }
    }
}
