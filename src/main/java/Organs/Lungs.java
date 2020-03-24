package Organs;

import Actions.IHealed;

public class Lungs extends Organ implements IHealed {

    public Lungs(String name, String purpose){
        super(name, purpose);
    }

    public String breathe(){
        return "whooooosh";
    }

    public void heal(int health){
        this.vitality += health;
    }
}
