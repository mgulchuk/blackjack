package deck;

import cards.Card;
import cards.StandardCard;

import java.util.ArrayList;

public class StandardDeck extends Deck {

    public StandardDeck() {
        super();
        String[] ranks = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King", "Ace"};
        String[] suits = {"Hearts","Diamonds","Spades","Clubs"};
        ArrayList<Card> card = new ArrayList<>();
        for (String suit : suits) {
            for (String rank : ranks) {
                card.add(new StandardCard(rank, suit));
            }
        }
        for (Card value : card) {
            addCard(value);
        }

    }

    public StandardCard dealTopCard() {
        return (StandardCard) super.dealTopCard();
    }
}
