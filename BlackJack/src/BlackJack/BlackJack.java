package BlackJack;


import cards.StandardCard;
import deck.StandardDeck;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author Michael Gulchuk
 * @version 1.0
 *
 * This class represents a blackjack game
 */
public class BlackJack {
    private int playerTotal;
    private int dealerTotal;
    private StandardDeck deck;

    /**
     * constructs a new deck and shuffles the deck and also sets totals to zero
     */
    public BlackJack(){
        deck = new StandardDeck();
        deck.shuffle();
        playerTotal = 0;
        dealerTotal = 0;
        welcome();
    }

    /**
     * Returns players card values total
     * @return players total
     */
    public int getPlayerTotal(){
        return playerTotal;
    }

    /**
     * Returns dealers card values total
     * @return dealers total
     */
    public int getDealerTotal(){
        return dealerTotal;
    }

    /**
     * sets players total to value of cards
     * @param t sets players total
     */
    public void setPlayerTotal(int t){
        this.playerTotal = t;
    }

    /**
     * sets dealers total to value of cards
     * @param t sets dealer total
     */
    public void setDealerTotal(int t){
        this.dealerTotal = t;
    }

    /**
     * deals first two cards of the game
     * @return a stream of standard card objects
     */
    public Stream<StandardCard> dealTwoCards(){
        if(deck.cardCount() <= 2){
            System.out.print("No more cards, shuffling deck...");
            deck.shuffle();
        }

        List<StandardCard> dealt = Stream.of(deck.dealTopCard(), deck.dealTopCard()).collect(Collectors.toList());

        dealt.forEach((StandardCard value) -> System.out.print("You are dealt a " + value));
        setPlayerTotal(dealt.get(0).getRankValue() + dealt.get(1).getRankValue());

        return dealt.stream();

    }

    /**
     * deals one card from the deck
     * @return a standard card object
     */
    public StandardCard dealOneCard(){
        if(deck.cardCount() <= 1){
            System.out.print("No more cards, shuffling deck...");
            deck.shuffle();
        }

        return deck.dealTopCard();
    }


    /**
     * prints out welcome message
     */
    public void welcome(){
        System.out.println("Welcome to my BlackJack console program!");
        System.out.println("****************************************\n");
        System.out.println("Generated a new standard deck of cards");
        System.out.println("Shuffling deck...\n");
    }

    /**
     *
     * @return string representation of BlackJack
     */
    public String toString(){
        return "Player total " + playerTotal +
                "Dealer total " + dealerTotal +
                "Deck " + deck;
    }
}
