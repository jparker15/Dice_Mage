package com.company;

import java.util.ArrayList;

public class Den {

    public ArrayList<Monster> den = new ArrayList();
    public int totalAtk = 0;


    public void addMonster(){
        den.add(new Monster(den.size() + 1 * 2));
    }

    public int attack(){

        for(Monster m: den){
            m.attack();
            totalAtk += m.attackLvl;
        }

        return totalAtk;
    }

    public void display(){
        System.out.println("Den:");

        for(Monster monster: den){
            System.out.println("d" + monster.powerLvl);
        }
    }
}
