package com.eriksstuff.factorymethod.service;

import com.eriksstuff.factorymethod.domain.superheros.Superhero;
import com.eriksstuff.factorymethod.domain.superheros.impl.Spiderman;
import com.eriksstuff.factorymethod.domain.superheros.impl.Superman;
import com.eriksstuff.factorymethod.domain.superpowers.Superpower;
import com.eriksstuff.factorymethod.domain.superpowers.impl.Flying;
import com.eriksstuff.factorymethod.domain.superpowers.impl.SpiderWeb;

import java.util.ArrayList;
import java.util.List;

public class SuperheroFactory {

    public static void main(String[] args){
        List<Superhero> superheros = new ArrayList<>();

        Superpower flying = new Flying();
        Superpower spiderweb = new SpiderWeb();

        Superhero superman = new Superman();
        superman.setHeroName("Superman");
        superman.setPower(flying);

        superheros.add(superman);

        Superhero spiderman = new Spiderman();
        spiderman.setHeroName("Spiderman");
        spiderman.setPower(spiderweb);

        superheros.add(spiderman);

        for(Superhero hero : superheros){
            hero.saveHumanity();
            hero.getPower().useSuperpower();
        }
    }
}
