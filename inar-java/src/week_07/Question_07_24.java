package week_07;

import java.util.Arrays;

import static week_07.Question_07_25.printResult;

public class Question_07_24 {
    public static void main(String[] args) {
        String[] suits = {"Spades", "Clubs", "Diamonds", "Hearts"};
        String[] ranks = {"Ace", "1", "2", "3", "4", "5", "6", "7",
                "8", "9", "10", "Jacks", "Queen", "King"};
        int[] cards = createCards();
        couponCollector();



    }
    public static void couponCollector() {
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades" };
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };
        int[] deck = new int[52];
        boolean isTrue = true;

        for (int i = 0; i < deck.length; i++) {
            deck[i] = i;
        }

        String[] suitsOfCollectedCards = new String[4];
        String[] ranksOfCollectedCards = new String[4];



        int numberOfPick = 0;

        while (isTrue) {

            int random = (int) (Math.random() * 52);

            suitsOfCollectedCards[0] = suits[random / 13];
            ranksOfCollectedCards[0] = ranks[random % 13];
            numberOfPick++;//first pick.

            for (int i = 1; i < suitsOfCollectedCards.length; i++) {
                random = (int) (Math.random() * 52);
                for (int j = 0; j < i; j++) {
                    if (suitsOfCollectedCards[j] == suits[random / 13]) {
                        numberOfPick++;
                        isTrue = false;
                        break;
                    }

                }
                if (!isTrue) {
                    i--;
                    isTrue = true;
                } else {
                    suitsOfCollectedCards[i] = suits[random / 13];
                    ranksOfCollectedCards[i] = ranks[random % 13];
                    numberOfPick++;
                }

            }
            isTrue = false;
        }
        printResult(suitsOfCollectedCards, ranksOfCollectedCards, numberOfPick);
    }


    public static int[] createCards() {
        int[] cards = new int[52];
        for (int i = 0; i < cards.length; i++) {
            cards[i] = i;
        }
        for (int i = 0; i < cards.length; i++) {
            int index = (int) (Math.random() * 52);
            int tempt = cards[index];
            cards[index] = cards[i];
            cards[i] = tempt;
        }
        return cards;
    }
    public static void printResult(String[] suits, String[] ranks, int numberOfPicks) {
        for (int i = 0; i < suits.length; i++) {
            System.out.println(ranks[i] + " of " + suits[i]);

        }
        System.out.println("Number of picks " + numberOfPicks);
    }

}
