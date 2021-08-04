package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Player p1 = new Player();

        p1.aether.roll();

        System.out.println(p1.aether.display());

        int managen =  p1.aether.generateMana();

        p1.mana += managen;

        System.out.println(p1.mana
        );
    }
}
