package com.company;


public class Mana {

        public ArrayList<Die> mana = new ArrayList<>();

        public Mana (){

        }

        public void roll(){
            // for each die in dice
            for (var die: dice) {

            }
        }
        // single roll die
        public void roll (int choice){

        }

        public void roll ( List<Integer> choices){
            for (int choice: choices) {

//            roll(rand,choice);
            }
        }

        @Override
        public String toString(){
            String output = "";
            for (Die die:dice) {
                output += die.value + "";
            }
            return output.trim();
        }

}
