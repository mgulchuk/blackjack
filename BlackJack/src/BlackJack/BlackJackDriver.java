package BlackJack;

import cards.StandardCard;

import java.util.Scanner;

/**
 * This class starts a new BlackJack game and is played against the dealer,
 * if the game is won/lost then a new game will be initialized if player continues to play
 */
public class BlackJackDriver {
    private static boolean play = true;
    private static final BlackJack game = new BlackJack();

    public static void main(String[] args) {
        while(play) {
            game.dealTwoCards();
            while (game.getPlayerTotal() < 21) {
                System.out.print("Your total is " + game.getPlayerTotal() + ", hit?: ");
                Scanner scan = new Scanner(System.in);
                if (scan.nextBoolean()) {
                    StandardCard card = game.dealOneCard();
                    game.setPlayerTotal(game.getPlayerTotal() + card.getRankValue());
                    System.out.print("You are dealt a " + card);
                    if (game.getPlayerTotal() > 21) {
                        System.out.println("You went bust you lose!");
                        reset();
                        break;
                    }
                } else {
                    System.out.println();
                    while (game.getDealerTotal() < game.getPlayerTotal()) {
                        StandardCard dealerCard = game.dealOneCard();
                        System.out.print("Dealer is dealt a " + dealerCard);
                        game.setDealerTotal(game.getDealerTotal() + dealerCard.getRankValue());
                        System.out.println("Dealer total is " + game.getDealerTotal());
                    }
                    if (game.getDealerTotal() > 21) {
                        System.out.println("Dealer went bust, you win!");
                        reset();
                        break;
                    } else if (game.getDealerTotal() == game.getPlayerTotal()) {
                        System.out.println("Tie game!");
                        reset();
                        break;
                    } else {
                        System.out.println("Dealer wins!");
                        reset();
                        break;
                    }
                }
            }
        }
    }

    private static boolean playAgain(){
        System.out.print("Play another hand? (true/false): ");
        Scanner play = new Scanner(System.in);
        return play.nextBoolean();
    }

    private static void reset(){
        play = playAgain();
        game.setPlayerTotal(0);
        game.setDealerTotal(0);
    }
}
