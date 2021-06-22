package com.eriksstuff.factorymethod.domain.superheros.impl;

import com.eriksstuff.factorymethod.domain.superheros.Superhero;

public class Superman extends Superhero {

    @Override
    public void sayMoto() {
        System.out.println("Dreams save us. Dreams lift us up and transform us.");
    }
}
