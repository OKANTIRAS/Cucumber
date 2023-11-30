package week_12;

public class Test {
    public static void main(String[] args) {
        String str = "okan%emir!cello?besim";
        String [] ar = str.split("okan");
        for (String str1: ar) {
            System.out.println(str1);

        }
    }
}
