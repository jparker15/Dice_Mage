package com.company;

import java.util.ArrayList;

public class Den {

    public ArrayList<Die> den = new ArrayList();


    public void addMonster(){
        den.add(new Die(den.size() * 2));
    }

    public void display(){
        for(Die monster: den){
            System.out.println("Den:");
            System.out.println("d" + monster.faceUpValue);
        }
    }
}
