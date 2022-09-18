package MODULE_2.SET_3;

public class Card {
    private static String suit;
    private static int number;
    private final int CARDS_IN_SUIT = 13;

    public void setSuit(String newSuit) {
        suit = newSuit;
    }

    public void setNumber(int newNumber) {
        number = newNumber;
    }

    public String getSuit() {
        return suit;
    }

    public int getNumber() {
        return number;
    }

    public int generateNumber() {
        int randomNumber = ((int)(Math.random() * 100) % CARDS_IN_SUIT + 1);
        return randomNumber;
    }

    public String generateSuit() {
        String[] suitName = {"Hearts", "Spades", "Diamonds", "Clovers"};
        String suit = suitName[(int)(Math.random() * suitName.length)];
        return suit;
    }

    public String numberName(){
        int number = generateNumber();
        String numberName = String.valueOf(number);
        if(number == 1) {
            numberName = "Ace";
        }
        if(number == 11) {
            numberName = "Jack";
        }
        if(number == 12) {
            numberName = "Queen";
        }
        if(number == 13) {
            numberName = "King";
        }
        return numberName;
    }
} //Ablay & Marquez - A221
