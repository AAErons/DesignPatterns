package com.eriksstuff.factorymethod.domain.superpowers.impl;

import com.eriksstuff.factorymethod.domain.superpowers.Superpower;

public class Flying implements Superpower {
    @Override
    public void useSuperpower() {
        System.out.println("Using flying!");
    }
}
