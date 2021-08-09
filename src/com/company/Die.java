package com.company;

public class Die {
    public int faceUpValue;
    public int numOfSides;

    public Die (){
        numOfSides = 6;

    }

    public Die(int faceUpValue){
        this.faceUpValue = faceUpValue;
    }

    public void roll () {
        faceUpValue = (int) ((Math.random() * numOfSides) + 1); //1 - 6
    }

}
