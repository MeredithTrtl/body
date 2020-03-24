package Limbs;

import Actions.IFrankenstein;

public abstract class Limb implements IFrankenstein {

    protected String name;
    protected int vitality;

    public Limb(String name, int vitality){
        this.name = name;
        this.vitality = vitality;
    }

    public String getName() {
        return name;
    }

    public int getVitality() {
        return vitality;
    }

    public void reduceEnergyLevel(int reduction){
        this.vitality -= reduction;
    }

    public void increaseEnergyLevel(int increment){
        this.vitality += increment;
    }

    public String frankenstein(){
        return "I have a " + this.getName();
    }
}
