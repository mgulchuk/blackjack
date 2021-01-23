package deck;

import cards.Card;

import java.util.ArrayList;

public class Deck {
    private ArrayList<Card> dealerPile;
    private ArrayList<Card> discardPile;

    public Deck() {
        dealerPile = new ArrayList<>();
        discardPile = new ArrayList<>();
    }

    public void addCard(Card card){
        dealerPile.add(card);
    }

    public void shuffle(){
        if (!discardPile.isEmpty()){
            while(!discardPile.isEmpty()){
                dealerPile.add(discardPile.remove(0));
            }
        }
        ArrayList<Card> card = new ArrayList<>();
        while(!dealerPile.isEmpty()) {
            int rand=(int)(Math.random()*dealerPile.size());
            card.add(dealerPile.get(rand));
            dealerPile.remove(rand);
        }
        dealerPile=card;
    }

    public Card dealTopCard(){
        Card c = dealerPile.remove(0);
        discardPile.add(c);
        return c;
    }

    public int cardCount(){
        return dealerPile.size();
    }

    @Override
    public String toString() {
        StringBuilder card = new StringBuilder();
        for (Card value : dealerPile) {
            card.append(value);
        }
        String cards = card.toString();

        StringBuilder discard = new StringBuilder();
        for (Card value : discardPile) {
            discard.append(value);
        }
        String dis = discard.toString();

        return cardCount() + " cards in deck\n******************\n" +
                cards + "\n" + discardPile.size() + " cards in discard\n******************\n" +
                dis;
    }
}
