package week_06;

public class Question_06_38 {
    public static void main(String[] args) {
        printcharacters();
    }
    public static void printcharacters(){
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            int ch1 = getRandomDigitCharacter();
            System.out.print(ch1 + " ");
            count++;
            if (count % 10 == 0) {
                System.out.println();
            }

        }
        System.out.println();
        for (int i = 1; i <= 100; i++) {
            char ch2 = getRandomUppercaseLetter();
            System.out.print(ch2 + " ");
            count++;
            if (count % 10 == 0) {
                System.out.println();
            }
        }


    }

    public static char getRandomUppercaseLetter() {
        char uppercase = ' ';
        uppercase = (char) ((Math.random() * ('Z' - 'A') + 'A'));
        return uppercase;
    }

    public static int getRandomDigitCharacter() {
        int digit;
        digit = (int)(Math.random() * 10);

        return digit;
    }

}

