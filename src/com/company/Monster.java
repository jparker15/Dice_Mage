package com.company;

public class Monster {

    public int powerLvl;
    public int attackLvl;

    public Monster(int powerLvl){
        this.powerLvl = powerLvl;

    }

   public void attack (){
       attackLvl = (int) ((Math.random() * powerLvl)); //roll an attack in a range from 0 to power level
   }
}
