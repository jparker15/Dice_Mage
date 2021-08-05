package com.company;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class Aether {

        public ArrayList<Die> totalPool = new ArrayList<>();
        public int aetherLevel = 6;

        public Aether(){
            for(int i = 0; i < aetherLevel; i++){
                totalPool.add(new Die());
            }

        }

        public void roll(){
            // for each die in dice
            for (Die die: totalPool) {
                die.roll();
            }
        }

        public String display(){
            String output = "";
            for (Die die: totalPool) {
                output += die.faceUpValue + "";
            }
            char[] arr = output.toCharArray();
            Arrays.sort(arr);
            output = new String(arr);

            return output.trim();
        }

        public int generateMana(){
            HashMap<Integer,Integer> freq = new HashMap<>();

            for(Die die: totalPool){
                if(freq.get(die.faceUpValue) != null){
                    freq.put(die.faceUpValue, freq.get(die.faceUpValue) + 1 );
                }else{
                    freq.put(die.faceUpValue,1);
                }
            }

            int maxOfAKind = Collections.max(freq.values());
            int minOfAKind = 3;

            if(maxOfAKind >= minOfAKind){
                return maxOfAKind;
            }else{
                return 1;
            }
        }
}
