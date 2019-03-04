public class Player {

    int playerId;
    int chipCount;

    Card [] hand = new Card[2];

    Player(int playerId){
        this.playerId = playerId;
    }

    public void assignCards(Card c1, Card c2){

        hand[0] = c1;
        hand[1] = c2;

    }
}

