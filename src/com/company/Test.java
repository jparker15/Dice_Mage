package com.company;

public class Test {
    public static void main(String[] args) {
        DiceMage dice = new DiceMage();

        Player p1 = new Player("Wyt");
        Player p2 = new Player("Blk");
        boolean gameOver = false;

        dice.players.add(p1);
        dice.players.add(p2);


        while(!gameOver){
            dice.start();

        }
    }
}
