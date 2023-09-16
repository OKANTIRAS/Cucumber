package week_05;

public class Question_05_15 {
    public static void main(String[] args) {
        String characters = "";
        int counter = 0;
        for (int i = '!'; i <= '~'; i++) {
            characters = characters + " " + (char)(i);
            counter++;
            if(counter % 10 == 0){
                characters = characters + "\n";
            }

        } System.out.print(characters);
    }
}
