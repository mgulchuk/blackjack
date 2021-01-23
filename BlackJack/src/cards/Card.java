package cards;

public class Card {
    private String cardText;

    public Card(String cardText) {
        this.cardText = cardText;
    }

    public String getCardText() {
        return cardText;
    }

    @Override
    public String toString() {
        return cardText;
    }
}
