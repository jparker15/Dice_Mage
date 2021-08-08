package com.company;

import java.util.ArrayList;

public class Den {

    public ArrayList<Die> den = new ArrayList();
    public Die mon = new Die();

    public void addMonster(){
        den.add(new Die());
    }
}
