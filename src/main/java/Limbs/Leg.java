package Limbs;

import Actions.IMoved;

public class Leg extends Limb implements IMoved {

    public Leg(String name, int energyLevel){
        super(name, energyLevel);
    }

    public void move(int energyRequired){
        this.reduceEnergyLevel(energyRequired);
    }

    public void step(){
        this.move(1);
    }

    public void jump(){
        this.move(2);
    }
}
