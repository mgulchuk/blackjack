package cards;

import org.junit.Test;

import static org.junit.Assert.*;

public class CardTest {
    @Test
    public void testConstructor(){
        Card c = new Card("4 of hearts");

        assertEquals("This card is incorrect", "4 of hearts", c.getCardText());
    }

    @Test
    public void testToString(){
        Card c = new Card("7 of diamonds");

        assertEquals("toString expected to be 7 of diamonds", "7 of diamonds", c.toString());
    }

}