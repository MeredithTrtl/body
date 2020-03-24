package Limbs;

import Actions.IMoved;

public class Arm extends Limb implements IMoved {

    public Arm(String name, int energyLevel){
        super(name, energyLevel);

    }

    public void move(int energyRequired){
        this.reduceEnergyLevel(energyRequired);
    }

    public void wave(){
        this.move(2);
    }
}
