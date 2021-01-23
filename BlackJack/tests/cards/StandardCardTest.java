package cards;

import org.junit.Test;

import static org.junit.Assert.*;

public class StandardCardTest {
    @Test
    public void testConstructor(){
        StandardCard card = new StandardCard("5","spades");

        assertEquals("This rank is incorrect", "5", card.getRank());
        assertEquals("This suit is incorrect", "spades", card.getSuit());
    }

    @Test
    public void testGetRankValue(){
        StandardCard card = new StandardCard("King","spades");
        assertEquals("This value is incorrect", 10, card.getRankValue());
        card = new StandardCard("Ace", "Hearts");
        assertEquals("This value is incorrect", 11, card.getRankValue());
        card = new StandardCard("5","spades");
        assertEquals("This value is incorrect", 5, card.getRankValue());
    }

    @Test
    public void testToString(){
        StandardCard card = new StandardCard("9","diamonds");

        assertEquals("toString expected to be 9 of diamonds", "9 of diamonds\n", card.toString());
    }

}