package cards;

public class StandardCard extends Card{
    private String rank;
    private String suit;

    public StandardCard(String rank, String suit) {
        super(rank + " of " + suit);
        this.rank = rank;
        this.suit = suit;
    }

    public int getRankValue(){
        if(rank.equals("Jack") || rank.equals("Queen") ||
         rank.equals("King")){
            return 10;
        }
        else if(rank.equals("Ace")){
            return 11;
        }
        else{
            return Integer.parseInt(rank);
        }
    }

    public String getRank() {
        return rank;
    }

    public String getSuit() {
        return suit;
    }

    @Override
    public String toString() {
        return (rank + " of " + suit + "\n");
    }
}
