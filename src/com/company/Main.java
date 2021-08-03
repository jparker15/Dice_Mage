package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Player p1 = new Player("Jar");

        p1.mana.manaPool = 1;

        System.out.println(p1.mana.manaPool);

        if(true){
            p1.mana.manaPool += 1;
        }else{
            p1.mana.manaPool = 0;
        }
    }
}
