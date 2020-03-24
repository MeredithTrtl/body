package Organs;

import Actions.IFrankenstein;

public abstract class Organ implements IFrankenstein {

    protected String name;
    protected String purpose;
    protected int vitality;

    public Organ(String name, String purpose){
        this.name = name;
        this.purpose = purpose;
        this.vitality = 10;
    }

    public String getName() {
        return name;
    }

    public String getPurpose() {
        return purpose;
    }

    public int getVitality() {
        return vitality;
    }

    public void takeDamage(int damage){
        this.vitality -= damage;
    }

    public String frankenstein(){
        return "I have a " + this.getName();
    }
}
