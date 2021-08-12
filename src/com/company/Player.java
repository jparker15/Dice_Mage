package com.company;

public class Player {
    public String name;
    public Aether aether = new Aether();
    public Den den = new Den();
    public int health = 5;
    public int mana = 0;


    public Player(){
        this.name = name;
    }

    public Player(String name){
        this.name = name;
    }

    public void displayStats(){
        System.out.println("\nMage " + name);
        System.out.println("Health: " + health + " | Aether: " + aether.totalPool.size() + " | Mana: " + mana +"\n");

        if(den.den.size() > 0){
            den.display();
            System.out.println("\n");
        }

    }
}
