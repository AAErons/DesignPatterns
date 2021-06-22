package com.eriksstuff.factorymethod.domain.superheros;

import com.eriksstuff.factorymethod.domain.superpowers.Superpower;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Superhero {

    private String heroName;
    private Superpower power;

    public abstract void sayMoto();

    public void saveHumanity(){
        System.out.println(heroName + " has saved the day once more!");
    }
}
