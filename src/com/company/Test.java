package com.company;

public class Test {
    public static void main(String[] args) {
        DiceMage dice = new DiceMage();

        Player p1 = new Player("Wyt");
        Player p2 = new Player("Blk");

        dice.players.add(p1);
        dice.players.add(p2);


        while(true){
            dice.start();

        }
    }
}
