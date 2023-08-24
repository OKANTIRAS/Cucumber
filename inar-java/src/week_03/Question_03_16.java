package week_03;

import java.util.Scanner;

public class Question_03_16 {
    public static void main(String[] args) {
        System.out.println("Random coordinate in rectangle centered at (0, 0) with width 100 height 200: ");
        int width = (int) (Math.random() * 200) - 100;
        int height = (int) (Math.random() * 300) - 100;
        System.out.print("(" +width +", ");
        System.out.println(height + ")");



    }
}
