package week_07;

public class Question_07_29 {
    public static void main(String[] args) {
        String[] rank = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        int sum;

        String[] cards = {"card1", "card2", "card3", "card4"};

        do {

            cards[0] = rank[getRandomCard()];
            cards[1] = rank[getRandomCard()];
            cards[2] = rank[getRandomCard()];
            cards[3] = rank[getRandomCard()];

            sum = sumOfCards(cards);
        } while (sum != 24);
        printcards(cards);
    }

    public static void printcards(String[] cards) {
        System.out.println("The number of picks that yields the sum of 24: " +
                cards[0] + " " + cards[1] + " " + cards[2] + " " + cards[3]);
    }

    public static int getRandomCard() {
        return (int) (Math.random() * 52) % 13;
    }
    public static int sumOfCards(String [] cards){
        int sum = 0;
        for (int i = 0; i < cards.length; i++) {
            switch (cards[i]){
                case "Jack":
                    sum += 11;
                    break;
                case "Queen":
                    sum += 12;
                    break;
                case "King":
                    sum += 13;
                    break;
                case "Ace":
                    sum += 1;
                    break;
                default:
                    sum += Integer.parseInt(cards[i]);
                    break;

            }
        } return sum;
    }

}
