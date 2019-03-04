import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> cards = new ArrayList<>();

    Deck(){
        for(int i = 1; i <= 13; i++){
            cards.add(new Card(i, Suit.Spades));
        }
        for(int i = 1; i <= 13; i++){
            cards.add(new Card(i, Suit.Diamonds));
        }
        for(int i = 1; i <= 13; i++){
            cards.add(new Card(i, Suit.Hearts));
        }
        for(int i = 1; i <= 13; i++){
            cards.add(new Card(i, Suit.Clubs));
        }
        ShuffleDeck();
    }

    private void ShuffleDeck(){
        Collections.shuffle(cards);
    }

    public Card getRandomCardFromDeck(){

        for(Card c : cards){
            if(c.inDeck){
                c.inDeck = false;
                return c;
            }
        }

        return null;
    }

    public void printDeck(){
        for(Card c : cards){
            System.out.println(c.value + " " + c.suit);
        }
    }

}
