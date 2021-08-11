package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class DiceMage {

    public ArrayList<Player> players = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    public DiceMage(){

    }

    public void start(){
//        for(Player p : players){
//            System.out.println("Name of Player?:");
//            String playerName = scanner.next();
//            p.name = playerName;
//        }
        for(Player p: players){
            playerTurn(p);
        }
    }

    public void playerTurn(Player player){
            //Random Mana Bonus
            player.aether.roll();
            System.out.println(player.aether.display());
            //total Mana gained
            int managen = player.aether.generateMana();
            player.mana += managen;

            System.out.println(player.name + " gained " + managen);

            System.out.println(player.name + "'s mana is " + player.mana);

            if (player.mana > player.aether.totalPool.size() - 2) {
                System.out.println("add to the Aether?"  );
                System.out.println(player.aether.totalPool.size());
                String answer = scanner.next();
                if (answer.equals("y")) {
                    player.mana -= (player.aether.totalPool.size() - 2);
                    player.aether.addAether();
                    player.displayStats();
                }
            }

            if (player.mana >= 3) {
                System.out.println("summon monster?");
                String answer = scanner.next();
                if (answer.equals("y")) {
                    player.den.addMonster();
                    player.mana -= player.den.den.size() * 3;
                }
            }

            else{

            }

            player.displayStats();

    }
}
