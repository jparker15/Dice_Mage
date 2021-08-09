package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Player p1 = new Player();
        Player p2 = new Player();
        Scanner scanner = new Scanner(System.in);

//        System.out.println("Name of P1?:");
//        String p1Name = scanner.next();
//        p1.name = p1Name;
        int i = 0;
        while(i < 10){
            p1.aether.roll();
            System.out.println(p1.aether.display());
            int managen =  p1.aether.generateMana();
            p1.mana += managen;
            System.out.println(p1.name + " gained " + managen );
            p1.displayStats();
            if(p1.mana > p1.aether.totalPool.size() - 2){
                System.out.println("add to the Aether?");
                System.out.println(p1.aether.totalPool.size());
                String answer = scanner.next();
                if(answer.equals("y")){
                    p1.mana -= (p1.aether.totalPool.size() - 2);
                    p1.aether.addAether();
                    p1.displayStats();
                }
            }

            if(p1.mana > 6){
                System.out.println("summon monster?");
                String answer = scanner.next();
                if(answer.equals("y")){
                    p1.den.addMonster();
                    p1.mana -= p1.den.den.size() * 3;
                }
            }
            i++;
        }



    }
}
