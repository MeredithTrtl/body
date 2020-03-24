package Organs;

import Actions.IHealed;

public class Heart extends Organ implements IHealed {

    public Heart(String name, String purpose){
        super(name, purpose);
    }

    public String beat(){
        return "ba-dum, ba-dum, ba-dum";
    }

    public void heal(int health){
        this.vitality += health;
    }

}
