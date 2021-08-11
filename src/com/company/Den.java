package com.company;

import java.util.ArrayList;

public class Den {

    public ArrayList<Die> den = new ArrayList();


    public void addMonster(){
        den.add(new Die(den.size() + 1 * 2));
    }

    public void display(){
        System.out.println("Den:");

        for(Die monster: den){
            System.out.println("d" + monster.faceUpValue);
        }
    }
}
