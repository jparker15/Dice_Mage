package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class DiceMage {

    public ArrayList<Player> players = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    public boolean gameOver = false;

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
            if(isWinner(p)){
                isWinner(p);
                gameOver = true;
            }
        }
    }

    public void playerTurn(Player player){
            //Random Mana Bonus
            player.aether.roll();
            System.out.println(player.aether.display());
            //total Mana gained
            int managen = player.aether.generateMana();
            player.mana += managen;

            //monster cost
            int monCost = player.den.den.size() + 1 * 3;

            //aether cost
            int aeCost = player.aether.totalPool.size() - 2;

            System.out.println(player.name + " gained " + managen + " mana");

            System.out.println(player.name + "'s new mana total is " + player.mana);

            player.displayStats();

            if (player.mana >= monCost){
                System.out.println("summon monster? [Mana: "+ monCost +"]"  + " (yes/no)");
                String answer = scanner.next();
                if (answer.equals("y")) {
                    player.den.addMonster();
                    player.mana -= monCost;
                }
                player.displayStats();
            }

            if (player.mana >= aeCost) {
                System.out.println("add to the Aether?"  );
                System.out.println(player.aether.totalPool.size());
                String answer = scanner.next();
                if (answer.equals("y")) {
                    player.mana -= aeCost;
                    player.aether.addAether();
                    player.displayStats();
                }
            }

            if(player.den.den.size() > 0){
                System.out.println("Would you like to attack?");
                String answer = scanner.next();
                if(answer.equals("y")){
                    //TODO:fix attack phase
                    attackPlayer(player);
                }


            }

            else{
                System.out.println("\nMana too low");
                System.out.println("Monster summon: [Mana: " + monCost + "]");
                System.out.println("Aether++: [Mana:" + aeCost + "]");
                System.out.println("press any key to skip turn");
                String answer = scanner.next();
            }


    }

    public void attackPlayer(Player player){

        if(player.name == players.get(0).name) {
            //First player is attacking
            if (players.get(0).den.attack() > players.get(1).den.attack()) {
                System.out.println("\n"+players.get(1).name + " takes 1 DMG");
                players.get(1).health--;
            } else if (players.get(0).den.attack() == players.get(1).den.attack()) {
                System.out.println("Equivalent Exchange! No DMG ");
            } else {
                System.out.println("Blocked");
            }

        }
        else{
            //second player is attacking
            if (players.get(1).den.attack() > players.get(0).den.attack()) {
                System.out.println(players.get(0).name + " takes 1 DMG");
                players.get(0).health--;
            } else if (players.get(1).den.attack() == players.get(0).den.attack()) {
                System.out.println("Equivalent Exchange! No DMG ");
            } else {
                System.out.println("Blocked!");

            }
        }
    }

    public boolean isWinner(Player player){

        if(player.health < 0 && players.get(0).name.equals(player.name)){
            System.out.println(players.get(1).name + " Wins!");
            return true;
        }else if (player.health < 0 && players.get(1).name.equals(player.name)){
            System.out.println(players.get(0).name + " Wins!");
            return true;
        }
        return false;
    }

}
