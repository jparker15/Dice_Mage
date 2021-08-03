package com.company;


import java.util.ArrayList;
import java.util.List;

public class Mana {

        public ArrayList<Die> mana = new ArrayList<>();
        public int manaPool = 0;

        public Mana (){

        }

        public void roll(){
            // for each die in dice
            for (Die die: mana) {
                die.roll();
            }
        }



        @Override
        public String toString(){
            String output = "";
            for (Die die:mana) {
                output += die.faceUpValue + "";
            }
            return output.trim();
        }

}
