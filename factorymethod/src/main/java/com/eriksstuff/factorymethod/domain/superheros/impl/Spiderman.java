package com.eriksstuff.factorymethod.domain.superheros.impl;

import com.eriksstuff.factorymethod.domain.superheros.Superhero;

public class Spiderman extends Superhero {

    @Override
    public void sayMoto() {
        System.out.println("Just your friendly neighborhood spiderman!");
    }
}
