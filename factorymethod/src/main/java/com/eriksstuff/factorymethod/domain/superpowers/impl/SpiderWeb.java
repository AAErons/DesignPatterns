package com.eriksstuff.factorymethod.domain.superpowers.impl;

import com.eriksstuff.factorymethod.domain.superpowers.Superpower;

public class SpiderWeb implements Superpower {
    @Override
    public void useSuperpower() {
        System.out.println("Using spiderweb");
    }
}
