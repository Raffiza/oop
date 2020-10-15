package static_method;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("budi");
        Player player2 = new Player("bambang");
        Player player3 = new Player("tresno");
        Player player4 = new Player("andi");

        Player.showNumberOfPlayer();
        System.out.println("Names : " + Player.getNames());
    }
}

class Player {
    private static int numberOfPlayer;
    private static ArrayList<String> nameList = new ArrayList<String>();

    private String name;

    Player (String name){
        this.name = name;
        Player.numberOfPlayer++;
        Player.nameList.add(this.name);
    }

    void show(){
        System.out.println("Player name = " + this.name);
    }

    static void showNumberOfPlayer(){
        System.out.println("Number of Player = " + Player.numberOfPlayer);
    }

    static ArrayList<String> getNames(){
        return Player.nameList;
    }


}