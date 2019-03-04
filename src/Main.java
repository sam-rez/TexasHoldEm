public class Main {

    public static void main(String[] args) {
        Table table = new Table(9);

        table.playerSitDown(new Player(1));
        table.playerSitDown(new Player(2));
        table.playerSitDown(new Player(3));
        table.playerSitDown(new Player(4));
        table.playerSitDown(new Player(5));
        table.playerSitDown(new Player(6));

        Hand hand = new Hand(table);
        hand.dealHand();
        table.printPlayers();
    }


}
