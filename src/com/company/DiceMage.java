package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class DiceMage {

    public ArrayList<Player> players = new ArrayList<>();
    public int currentPlayer = 0;

    public DiceMage(){
        Player p1 = new Player();
        Player p2 = new Player();

        players.add(p1);
        players.add(p2);
        Scanner scanner = new Scanner(System.in);

        for(Player p : players){
            System.out.println("Name of Player?:");
            String playerName = scanner.next();
            p.name = playerName;
        }
        while(true){
            p1.aether.roll();
            System.out.println(p1.aether.display());
            int managen = p1.aether.generateMana();
            p1.mana += managen;
            System.out.println(p1.name + " gained " + managen);
            p1.displayStats();
            if (p1.mana > p1.aether.totalPool.size() - 2) {
                System.out.println("add to the Aether?");
                System.out.println(p1.aether.totalPool.size());
                String answer = scanner.next();
                if (answer.equals("y")) {
                    p1.mana -= (p1.aether.totalPool.size() - 2);
                    p1.aether.addAether();
                    p1.displayStats();
                }
            }

            if (p1.mana >= 3) {
                System.out.println("summon monster?");
                String answer = scanner.next();
                if (answer.equals("y")) {
                    p1.den.addMonster();
                    p1.mana -= p1.den.den.size() * 3;
                }
            }

            p1.displayStats();
        }
    }
}
