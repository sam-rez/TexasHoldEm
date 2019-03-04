import java.util.List;

public class Hand {


    Deck deck;
    Table table;

    Hand(Table table){
        deck = new Deck();
        this.table = table;
    }

    public void dealHand(){
        for(int i = 0; i < table.players.length; i++){
            if(table.players[i] != null){
                table.players[i].hand[0] = deck.getRandomCardFromDeck();
                table.players[i].hand[1] = deck.getRandomCardFromDeck();
            }
        }
    }

}
