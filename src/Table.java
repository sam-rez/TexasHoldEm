import java.util.List;

public class Table {

    int tableSize;
    Player [] players;
    Boolean [] playerInHand;

    Table(int tableSize){
        this.tableSize =  tableSize;
        players = new Player[tableSize];
    }

    public void playerSitDown(Player p){
        for(int i = 0; i < players.length; i++){
            if(players[i] == null){
                players[i] = p;
                return;
            }
        }
    }

    public void playerGetUp(int seat){
        players[seat] = null;
    }

    public void printPlayers(){
        for(int i = 0; i < players.length; i++){
            System.out.print("Seat number: " + i + " ");
            if(players[i] != null) {
                System.out.print("Player ID: " + players[i].playerId + " ");
                System.out.println("Player Hand: " + players[i].hand[0].value + " " + players[i].hand[0].suit + " "
                        + players[i].hand[1].value + " " + players[i].hand[1].suit);
            }else{
                System.out.println();
            }
        }
    }


}
