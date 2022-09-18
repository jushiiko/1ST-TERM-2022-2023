package MODULE_2.SET_3;

public class PickTwoCards {
    public static void main(String[] args) {
        Card myCard = new Card();
        Card yourCard = new Card();

        String yourNumber = yourCard.numberName();
        String myNumber = myCard.numberName();
        String yourSuit = yourCard.generateSuit();
        String mySuit = myCard.generateSuit();

        System.out.println("Your card was the " + yourNumber + " of " + yourSuit + ".");
        System.out.println("My card was the " + myNumber + " of " + mySuit + ".");
        System.out.println("Ablay & Marquez - A221");
    }
} //Ablay & Marquez - A221
